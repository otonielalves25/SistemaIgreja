/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Congregacao;
import modelo.Usuario;

/**
 *
 * @author Tony
 */
public class CongregacaoDao {

    Connection con;
    PreparedStatement stm = null;
    ResultSet rs;

    //INSERIR NOVO /////////////////////////////////////////////////////////////
    public boolean inserirNovo(Congregacao congregacao) {
        String sql = "INSERT INTO congregacao (nomeCongregacao) VALUES (?)";

        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);

            stm.setString(1, congregacao.getNomeCongregacao());

            stm.execute();
            con.close();
            stm.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar . " + ex);
            return false;
        }

    }

    //ALTERAR NOVO /////////////////////////////////////////////////////////////
    public boolean alterar(Congregacao congregacao) {
        String sql = "UPDATE congregacao SET nomeCongregacao=? WHERE idCongregacao=?";

        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);

            stm.setString(1, congregacao.getNomeCongregacao());

            stm.execute();

            con.close();
            stm.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar. " + ex);
            return false;
        }

    }

    //EXCLUIR //////////////////////////////////////////////////////////////////
    public boolean excluir(int codigo) {
        String sql = "DELETE congregacao WHERE idCongregacao=?";

        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);

            stm.setInt(1, codigo);

            stm.execute();

            con.close();
            stm.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar. " + ex);
            return false;
        }

    }

    // RETORNA UM USUARIO //////////////////////////////////////////////////////
    public Congregacao getCongregacao(int codigo) {
        Congregacao congregacao = null;
        String sql = "SELECT * FROM congregacao WHERE idCongregacao=" + codigo + "";
        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            if (rs.next()) {
                congregacao = new Congregacao();
                congregacao.setIdCongregacao(rs.getInt("idCongregacao"));
                congregacao.setNomeCongregacao(rs.getString("nomeCongregacao"));

            }

            con.close();
            stm.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar. " + ex);

        }
        return congregacao;
    }
    
        // RETORNA UM USUARIO //////////////////////////////////////////////////////
    public Congregacao getCongregacao(String nome) {
        Congregacao congregacao = null;
        String sql = "SELECT * FROM congregacao WHERE nomeCongregacao =" + nome + "";
        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            if (rs.next()) {
                congregacao = new Congregacao();
                congregacao.setIdCongregacao(rs.getInt("idCongregacao"));
                congregacao.setNomeCongregacao(rs.getString("nomeCongregacao"));
            }

            con.close();
            stm.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar. " + ex);

        }
        return congregacao;
    }

    // RETORNA TODOS  //////////////////////////////////////////////////////////
    public ArrayList<Congregacao> getListaCongregacoes() {
        ArrayList<Congregacao> lista = new ArrayList<>();
         Congregacao congregacao;
        String sql = "SELECT * FROM congregacao ORDER BY nomeCongregacao";
        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                congregacao = new Congregacao();
                congregacao.setIdCongregacao(rs.getInt("idCongregacao"));
                congregacao.setNomeCongregacao(rs.getString("nomeCongregacao"));
                lista.add(congregacao);
            }

            con.close();
            stm.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar. " + ex);

        }
        return lista;
    }

    public Congregacao getCongregacao(Object selectedItem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
