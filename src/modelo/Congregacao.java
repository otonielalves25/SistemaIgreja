/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Tony
 */
public class Congregacao {

    private int idCongregacao;
    private String nomeCongregacao;
    private String endereco;
    private String bairro;
    private String cidade;
    private String cep;
    private String telefone;
    private Membro pastor;


    public Congregacao(int idCongregacao) {
        this.idCongregacao = idCongregacao;

    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the pastor
     */
    public Membro getPastor() {
        return pastor;
    }

    /**
     * @param pastor the pastor to set
     */
    public void setPastor(Membro pastor) {
        this.pastor = pastor;
    }

    public Congregacao() {
    }


    /**
     * @return the idCongregacao
     */
    public int getIdCongregacao() {
        return idCongregacao;
    }

    /**
     * @param idCongregacao the idCongregacao to set
     */
    public void setIdCongregacao(int idCongregacao) {
        this.idCongregacao = idCongregacao;
    }

    /**
     * @return the nomeCongregacao
     */
    public String getNomeCongregacao() {
        return nomeCongregacao;
    }

    /**
     * @param nomeCongregacao the nomeCongregacao to set
     */
    public void setNomeCongregacao(String nomeCongregacao) {
        this.nomeCongregacao = nomeCongregacao;
    }

    @Override
    public String toString() {
        return nomeCongregacao; //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


}
