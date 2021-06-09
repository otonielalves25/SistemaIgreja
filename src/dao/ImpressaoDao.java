/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Tony
 */
public class ImpressaoDao {

    Connection con;
    PreparedStatement stm;
    ResultSet rs;
    private int membro_id;

    public void imprimirRelatorioMembros() {

        try {
                   

            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement("SELECT * FROM membro");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ImpressaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        InputStream caminhoRelJasper = this.getClass().getResourceAsStream("/impressao/membros.jasper");        
        JRResultSetDataSource result = new JRResultSetDataSource(rs);

        try {
            JasperPrint impressao = JasperFillManager.fillReport(caminhoRelJasper, null, result);
            JasperViewer view = new JasperViewer(impressao, false);
            view.setVisible(true);
            view.setAutoRequestFocus(true);
            //JasperPrintManager.printPage(impressao, 0, true); // FALSE abre para salvar / TRUE abre p/impressão

        } catch (JRException e) {
        }

    }

    public void imprimirCarterinha() {

        try {

            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement("SELECT * FROM membro WHERE idMembro =" + getMembro_id());
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ImpressaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        InputStream caminhoRelJasper = this.getClass().getResourceAsStream("/impressao/carterinha.jasper");
        JRResultSetDataSource result = new JRResultSetDataSource(rs);

        try {
            JasperPrint impressao = JasperFillManager.fillReport(caminhoRelJasper, null, result);
            JasperViewer view = new JasperViewer(impressao, false);
            view.setVisible(true);
            view.setAutoRequestFocus(true);
            //JasperPrintManager.printPage(impressao, 0, true); // FALSE abre para salvar / TRUE abre p/impressão

        } catch (JRException e) {
        }

    }

    /**
     * @return the membro_id
     */
    public int getMembro_id() {
        return membro_id;
    }

    /**
     * @param membro_id the membro_id to set
     */
    public void setMembro_id(int membro_id) {
        this.membro_id = membro_id;
    }

}
