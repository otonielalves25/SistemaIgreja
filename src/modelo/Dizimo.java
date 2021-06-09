/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Tony
 */
public class Dizimo {

    private int idDizimo;
    private Membro membro;
    private Date dataCadastro;
    private String formaPaga;
    private String mes;
    private int ano;
    private Float valor;

    /**
     * @return the idDizimo
     */
    public int getIdDizimo() {
        return idDizimo;
    }

    /**
     * @param idDizimo the idDizimo to set
     */
    public void setIdDizimo(int idDizimo) {
        this.idDizimo = idDizimo;
    }

    /**
     * @return the membro
     */
    public Membro getMembro() {
        return membro;
    }

    /**
     * @param membro the membro to set
     */
    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    /**
     * @return the dataCadastro
     */
    public Date getDataCadastro() {
        return dataCadastro;
    }
      public String getDataCadastroFormatada() {
        return new SimpleDateFormat("dd/MM/yyyy").format(this.dataCadastro);
    }

    /**
     * @param dataCadastro the dataCadastro to set
     */
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    /**
     * @return the formaPaga
     */
    public String getFormaPaga() {
        return formaPaga;
    }

    /**
     * @param formaPaga the formaPaga to set
     */
    public void setFormaPaga(String formaPaga) {
        this.formaPaga = formaPaga;
    }

    /**
     * @return the mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the valor
     */
    public Float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Float valor) {
        this.valor = valor;
    }

}
