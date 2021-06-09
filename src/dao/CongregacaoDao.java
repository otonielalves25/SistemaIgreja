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
import modelo.Membro;

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
        String sql = "INSERT INTO congregacao (nomeCongregacao,endereco,bairro,cidade,cep,telefone,idPastorResponsavel,logo) VALUES (?,?,?,?,?,?,?,?)";

        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);

            stm.setString(1, congregacao.getNomeCongregacao());
            stm.setString(2, congregacao.getEndereco());
            stm.setString(3, congregacao.getBairro());
            stm.setString(4, congregacao.getCidade());
            stm.setString(5, congregacao.getCep());
            stm.setString(6, congregacao.getTelefone());
            stm.setInt(7, congregacao.getPastor().getIdMembro());
            stm.setBytes(8, congregacao.getLogo());

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
        String sql = "UPDATE congregacao SET nomeCongregacao=?,endereco=?,bairro=?,cidade=?,"
                + "cep=?, telefone=?,idPastorResponsavel=?, logo=? WHERE idCongregacao=?";

        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);

            stm.setString(1, congregacao.getNomeCongregacao());
            stm.setString(2, congregacao.getEndereco());
            stm.setString(3, congregacao.getBairro());
            stm.setString(4, congregacao.getCidade());
            stm.setString(5, congregacao.getCep());
            stm.setString(6, congregacao.getTelefone());
            stm.setInt(7, congregacao.getPastor().getIdMembro());
            stm.setBytes(8, congregacao.getLogo());
            stm.setInt(9, congregacao.getIdCongregacao());

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
        String sql = "DELETE FROM congregacao WHERE idCongregacao=?";

        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);

            stm.setInt(1, codigo);

            stm.execute();

            con.close();
            stm.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir. " + ex);
            return false;
        }

    }

    // RETORNA UM USUARIO //////////////////////////////////////////////////////
    public Congregacao getCongregacao(int codigo) {
        Congregacao congregacao = null;
        String sql = "SELECT m.idMembro, m.nome, c.* FROM congregacao as c INNER JOIN membro as m ON c.idPastorResponsavel = m.idMembro "
                + "WHERE c.idCongregacao=" + codigo + "";
        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            if (rs.next()) {
                congregacao = new Congregacao();
                congregacao.setIdCongregacao(rs.getInt("idCongregacao"));
                congregacao.setNomeCongregacao(rs.getString("nomeCongregacao"));
                congregacao.setEndereco(rs.getString("endereco"));
                congregacao.setTelefone(rs.getString("telefone"));
                congregacao.setCidade(rs.getString("cidade"));
                congregacao.setBairro(rs.getString("bairro"));
                congregacao.setCep(rs.getString("cep"));
                Membro m = new Membro(rs.getInt("idMembro"), rs.getString("nome"));
                congregacao.setLogo(rs.getBytes("logo"));
                congregacao.setPastor(m);

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
        String sql = "SELECT m.idMembro, m.nome, c.* FROM congregacao as c INNER JOIN membro as m ON c.idPastorResponsavel = m.idMembro "
                + "WHERE c.nomeCongregacao =" + nome + "";
        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            if (rs.next()) {
                congregacao = new Congregacao();
                congregacao.setIdCongregacao(rs.getInt("idCongregacao"));
                congregacao.setNomeCongregacao(rs.getString("nomeCongregacao"));
                congregacao.setEndereco(rs.getString("endereco"));
                congregacao.setTelefone(rs.getString("telefone"));
                congregacao.setCidade(rs.getString("cidade"));
                congregacao.setBairro(rs.getString("bairro"));
                congregacao.setCep(rs.getString("cep"));
                congregacao.setLogo(rs.getBytes("logo"));
                //Membro m = new Membro(rs.getInt("idMembro"), rs.getString("nome"));
                Membro x = new MembroDao().getMembro(rs.getInt("idPastorResponsavel"));
                congregacao.setPastor(x);
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
        String sql = "SELECT m.idMembro, m.nome, c.* FROM congregacao as c INNER JOIN membro as m ON c.idPastorResponsavel = m.idMembro";
        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                congregacao = new Congregacao();
                congregacao.setIdCongregacao(rs.getInt("idCongregacao"));
                congregacao.setNomeCongregacao(rs.getString("nomeCongregacao"));
                congregacao.setEndereco(rs.getString("endereco"));
                congregacao.setTelefone(rs.getString("telefone"));
                congregacao.setCidade(rs.getString("cidade"));
                congregacao.setBairro(rs.getString("bairro"));
                congregacao.setCep(rs.getString("cep"));
                congregacao.setLogo(rs.getBytes("logo"));
                Membro m = new Membro(rs.getInt("idMembro"), rs.getString("nome"));
                congregacao.setPastor(m);
                lista.add(congregacao);
            }

            con.close();
            stm.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar. " + ex);

        }
        return lista;
    }

}
