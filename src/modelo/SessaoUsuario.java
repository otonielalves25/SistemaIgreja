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
public class SessaoUsuario {
    
    private static int idUsuario;
    private static String nomeUsuario;
    private static String previlegio;   

    /**
     * @return the idUsuario
     */
    public static int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param aIdUsuario the idUsuario to set
     */
    public static void setIdUsuario(int aIdUsuario) {
        idUsuario = aIdUsuario;
    }

    /**
     * @return the nomeUsuario
     */
    public static String getNomeUsuario() {
        return nomeUsuario;
    }

    /**
     * @param aNomeUsuario the nomeUsuario to set
     */
    public static void setNomeUsuario(String aNomeUsuario) {
        nomeUsuario = aNomeUsuario;
    }

    /**
     * @return the previlegio
     */
    public static String getPrevilegio() {
        return previlegio;
    }

    /**
     * @param aPrevilegio the previlegio to set
     */
    public static void setPrevilegio(String aPrevilegio) {
        previlegio = aPrevilegio;
    }
    
  
    
    
}
