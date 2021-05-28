/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Tony
 */
public class Congregacao {

    private int idCongregacao;
    private String nomeCongregacao;

    public Congregacao() {
    }

    public Congregacao(int idCongregacao) {
        this.idCongregacao = idCongregacao;

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
    
    

}
