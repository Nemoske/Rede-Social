package br.com.criandoSistema.SistemaWeb.controller;

import br.com.criandoSistema.SistemaWeb.DAO.IClientes;
import br.com.criandoSistema.SistemaWeb.model.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private IClientes dao ;

 //Método para retornar todos as entidades
    @GetMapping
    public List<Clientes> listaCliente(){
        return (List<Clientes>) dao.findAll();
    }

 //Método para cadastrar entidade
    @PostMapping
    public Clientes cadastroClientes(@RequestBody Clientes clienteNew){
        Clientes clienteNovo = dao.save(clienteNew);
        return clienteNovo;
    }

    @PutMapping
    public Clientes editarCliente(@RequestBody Clientes updateCliente){
        Clientes clienteAtualizado = dao.save(updateCliente);
        return clienteAtualizado;
    }

    @DeleteMapping("/{id_clientes}")
    public Optional <Clientes> deletarClient (@PathVariable Integer iD){
       Optional <Clientes> clienteDel = dao.findById(iD);
        dao.deleteById(iD);
        return clienteDel;
    }

}
