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

    // IMPRIMIR RELATORIO DE MEMBROS //////////////////////////////////////////
    public void imprimirRelatorioMembros() {

        try {

            String sql = "SELECT * from membro INNER JOIN congregacao "
                    + "ON membro.idCongregacao = congregacao.idCongregacao";

            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
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

    // IMPRIMIR CARTERINHA DE MEMBRO /////////////////////////////////////////////
    public void imprimirCarterinha() {

        try {

            String sql = "SELECT c.nomeCongregacao, m.nome, c.bairro, m.dataCadastro, m.cargo, m.foto, m.idMembro, c.logo "
                    + "FROM membro as m "
                    + "INNER JOIN congregacao as c "
                    + "ON m.idCongregacao = c.idCongregacao WHERE idMembro =" + getMembro_id();

            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
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
    // IMPRIMIR CARTA DE MEMBRO ////////////////////////////////////////////

    public void imprimirCarta() {

        try {

            String sql = "SELECT * FROM membro "
                    + "INNER JOIN congregacao "
                    + "ON membro.idCongregacao = congregacao.idCongregacao WHERE idMembro =" + getMembro_id();

            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ImpressaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        InputStream caminhoRelJasper = this.getClass().getResourceAsStream("/impressao/Carta.jasper");
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
