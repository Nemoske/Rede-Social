package br.com.criandoSistema.SistemaWeb.model;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "clientes")
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clientes")
    private Integer id_clientes;

    @Column(name = "nomecompleto",length = 80, nullable = false)
    private String nomeCompleto;

    @Column(name = "nick",length = 30, nullable = false)
    private String nick;

    @Column(name = "datanascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "profissao", length = 50, nullable = true )
    private String profissao;

    @Column(name = "bio",length = 300, nullable = true)
    private String bio;

    @Column(name = "escolaridade", length = 60, nullable = true)
    private String escolaridade;

    public void setId(Integer id){
        this.id_clientes = id;
    }

    public Integer getId(){
        return id_clientes;
    }


    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto(){
        return nomeCompleto;
    }

    public void setNick(String nick){
        this.nick = nick;
    }

    public String getNick(){
        return nick;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    public String getProfissao(){
        return profissao;
    }

    public void setBio(String bio){
        this.bio = bio;
    }

    public String getBio(){
        return bio;
    }

    public void setEscolaridade(String escolaridade){
        this.escolaridade = escolaridade;
    }

    public String getEscolaridade(){
        return escolaridade;
    }
}
