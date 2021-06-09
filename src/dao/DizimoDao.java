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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Dizimo;
import modelo.Membro;


/**
 *
 * @author Tony
 */
public class DizimoDao {

    Connection con;
    PreparedStatement stm;
    ResultSet rs;
    DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    //INSERIR NOVO /////////////////////////////////////////////////////////////

    public boolean inserirNovo(Dizimo dizimo) {
        String sql = "INSERT INTO dizimo (idMembro, dataCadastro, formaPaga, mes, ano, valor) VALUES (?,?,?,?,?,?)";

        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);

            stm.setInt(1, dizimo.getMembro().getIdMembro());
            stm.setString(2, sdf.format(dizimo.getDataCadastro()));
            stm.setString(3, dizimo.getFormaPaga());
            stm.setString(4, dizimo.getMes());
            stm.setInt(5, dizimo.getAno());
            stm.setFloat(6, dizimo.getValor());

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
    public boolean alterar(Dizimo dizimo) {
        String sql = "UPDATE dizimo SET idMembro=?, dataCadastro=?, formaPaga=?, mes=?, ano=?, valor=? "
                + "WHERE idDizimo=?";

        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);

            stm.setInt(1, dizimo.getMembro().getIdMembro());
            stm.setString(2, sdf.format(dizimo.getDataCadastro()));
            stm.setString(3, dizimo.getFormaPaga());
            stm.setString(4, dizimo.getMes());
            stm.setInt(5, dizimo.getAno());
            stm.setFloat(6, dizimo.getValor());
            stm.setInt(7, dizimo.getIdDizimo());

            stm.execute();

            con.close();
            stm.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar. " + ex);
            return false;
        }

    }

//    //EXCLUIR //////////////////////////////////////////////////////////////////
    public boolean excluir(int codigo) {
        String sql = "DELETE FROM dizimo WHERE idDizimo=?";

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
    public Dizimo getDizimo(int codigo) {
        Dizimo diz = null;
        String sql = "SELECT * FROM dizimo WHERE idDizimo =" + codigo + "";
        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            if (rs.next()) {
                diz = new Dizimo();
                diz.setIdDizimo(rs.getInt("idDizimo"));
                try {
                    diz.setDataCadastro(sdf.parse(rs.getString("dataCadastro")));
                } catch (ParseException ex) {

                }
                diz.setFormaPaga(rs.getString("formaPaga"));
                diz.setMes(rs.getString("mes"));
                diz.setAno(rs.getInt("ano"));
                diz.setValor(rs.getFloat("valor"));
                Membro m = new MembroDao().getMembro(Integer.parseInt(rs.getString("idMembro")));
                diz.setMembro(m);

            }

            con.close();
            stm.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar. " + ex);

        }
        return diz;
    }
        // RETORNA TODOS OS USUARIOS ///////////////////////////////////////////////
    public ArrayList<Dizimo> getListaDizimos(String nome) {
        ArrayList<Dizimo> lista = new ArrayList<>();
        String sql = "SELECT * FROM dizimo "
                + "JOIN membro ON dizimo.idMembro = membro.idMembro WHERE nome LIKE ?";
        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1, "%" + nome + "%");
            rs = stm.executeQuery();
            while (rs.next()) {
                Dizimo diz = new Dizimo();
                diz.setIdDizimo(rs.getInt("idDizimo"));
                try {
                    diz.setDataCadastro(sdf.parse(rs.getString("dataCadastro")));
                } catch (ParseException ex) {

                }
                 diz.setFormaPaga(rs.getString("formaPaga"));
                diz.setMes(rs.getString("mes"));
                diz.setAno(rs.getInt("ano"));
                diz.setValor(rs.getFloat("valor"));
                Membro m = new MembroDao().getMembro(Integer.parseInt(rs.getString("idMembro")));
                diz.setMembro(m);
                lista.add(diz);
            }

            con.close();
            stm.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar. " + ex);

        }
        return lista;
    }

   
    // RETORNA TODOS OS USUARIOS ///////////////////////////////////////////////
    public ArrayList<Dizimo> getListaDizimosAno(String nome, int ano) {
        ArrayList<Dizimo> lista = new ArrayList<>();
        String sql = "SELECT dizimo.idDizimo, membro.idMembro, dizimo.formaPaga, dizimo.dataCadastro, membro.nome, dizimo.ano, dizimo.mes, dizimo.valor "
                + "FROM dizimo JOIN membro ON dizimo.idMembro = membro.idMembro ORDER BY membro.nome";
        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
//            stm.setString(1, "%" + nome + "%");
//            stm.setString(2, "%" + ano + "%");
            rs = stm.executeQuery();
            while (rs.next()) {
                Dizimo diz = new Dizimo();
                diz.setIdDizimo(rs.getInt("idDizimo"));
                try {
                    diz.setDataCadastro(sdf.parse(rs.getString("dataCadastro")));
                } catch (ParseException ex) {

                }
                diz.setFormaPaga(rs.getString("formaPaga"));
                diz.setMes(rs.getString("mes"));
                diz.setAno(rs.getInt("ano"));
                diz.setValor(rs.getFloat("valor"));
                Membro m = new MembroDao().getMembro(Integer.parseInt(rs.getString("idMembro")));
                diz.setMembro(m);
                lista.add(diz);
            }

            con.close();
            stm.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar. " + ex);

        }
        return lista;
    }
    
     // RETORNA TODOS OS USUARIOS ///////////////////////////////////////////////
    public ArrayList<Dizimo> getListaDizimosIDeAno(int codigo, int ano) {
        ArrayList<Dizimo> lista = new ArrayList<>();
        String sql = "SELECT dizimo.idDizimo, membro.idMembro, dizimo.formaPaga, dizimo.dataCadastro, membro.nome, dizimo.ano, dizimo.mes, dizimo.valor "
                + "FROM dizimo JOIN membro ON dizimo.idMembro = membro.idMembro WHERE membro.idMembro = ? AND dizimo.ano = ? ORDER BY membro.nome";
        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, codigo);
            stm.setInt(2, ano);
            rs = stm.executeQuery();
            while (rs.next()) {
                Dizimo diz = new Dizimo();
                diz.setIdDizimo(rs.getInt("idDizimo"));
                try {
                    diz.setDataCadastro(sdf.parse(rs.getString("dataCadastro")));
                } catch (ParseException ex) {

                }
                 diz.setFormaPaga(rs.getString("formaPaga"));
                diz.setMes(rs.getString("mes"));
                diz.setAno(rs.getInt("ano"));
                diz.setValor(rs.getFloat("valor"));
                Membro m = new MembroDao().getMembro(Integer.parseInt(rs.getString("idMembro")));
                diz.setMembro(m);
                lista.add(diz);
            }

            con.close();
            stm.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar. " + ex);

        }
        return lista;
    }
    
            // RETORNA ID POR NOME ////////////////////////////////////////////////////
    public int verificaSeJaPagou(int id, String mes, int ano) {
        int codigo = 0;
        String sql = "SELECT * FROM dizimo WHERE idMembro = ? and mes = ? and ano=?";

        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, id);
            stm.setString(2, mes);
            stm.setInt(3, ano);
            rs = stm.executeQuery();

            if (rs.next()) {
                codigo = rs.getInt("idMembro");
            }

            stm.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar dizimista. " + e);

        }

        return codigo;
    }

}
