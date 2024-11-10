package br.com.criandoSistema.SistemaWeb.DAO;

import br.com.criandoSistema.SistemaWeb.model.Clientes;
import org.springframework.data.repository.CrudRepository;

public interface IClientes extends CrudRepository<Clientes,Integer> {

}
