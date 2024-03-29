/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

/**
 *
 * @author aluno
 */
public class Profissional extends Pessoa {
    private int idprofissional;
    private String regprofissional;
    private String descricao;
    private Pessoa pessoa;

    public Profissional(){
    }
    
    public int getIdprofissional() {
        return idprofissional;
    }

    public void setIdprofissional(int idprofissional) {
        this.idprofissional = idprofissional;
    }

    public String getRegprofissional() {
        return regprofissional;
    }

    public void setRegprofissional(String regprofissional) {
        this.regprofissional = regprofissional;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
       @Override
    public String toString() {
        return this.getNome();
    }
}
