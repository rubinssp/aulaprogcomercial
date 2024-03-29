/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

/**
 *
 * @author luisf
 */
public class Projeto {
    
    private int idprojeto;
    private String nome;
    private String datainicio;
    private String dataconclusao;
    private Profissional profissional;
    private Cliente cliente;
    
    public Projeto() {
    }

    public Projeto(String nome, String datainicio, String dataconclusao, Profissional profissional, Cliente cliente) {
        this.nome = nome;
        this.datainicio = datainicio;
        this.dataconclusao = dataconclusao;
        this.profissional = profissional;
        this.cliente = cliente;
    }

    
    
    public int getIdprojeto() {
        return idprojeto;
    }

    public void setIdprojeto(int idprojeto) {
        this.idprojeto = idprojeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(String datainicio) {
        this.datainicio = datainicio;
    }

    public String getDataconclusao() {
        return dataconclusao;
    }

    public void setDataconclusao(String dataconclusao) {
        this.dataconclusao = dataconclusao;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    
    
}
