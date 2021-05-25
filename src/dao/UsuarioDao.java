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
import modelo.Usuario;

/**
 *
 * @author Tony
 */
public class UsuarioDao {

    Connection con;
    PreparedStatement stm = null;
    ResultSet rs;

    //INSERIR NOVO /////////////////////////////////////////////////////////////
    public boolean inserirNovo(Usuario usuario) {
        String sql = "INSERT INTO usuario (nome, login, senha, previlegio, status, dataCadastro) VALUES (?,?,?,?,?,?)";

        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);

            stm.setString(1, usuario.getNome());
            stm.setString(2, usuario.getLogin());
            stm.setString(3, usuario.getSenha());
            stm.setString(4, usuario.getPrevilegio());
            stm.setString(5, usuario.getStatus());
            stm.setString(6, usuario.getDataCadastro());

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
    public boolean alterar(Usuario usuario) {
        String sql = "UPDATE usuario SET nome=?, login=?, senha=?, previlegio=?, status=?, dataCadastro=? "
                + "WHERE idUsuario=?";

        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);

            stm.setString(1, usuario.getNome());
            stm.setString(2, usuario.getLogin());
            stm.setString(3, usuario.getSenha());
            stm.setString(4, usuario.getPrevilegio());
            stm.setString(5, usuario.getStatus());
            stm.setString(6, usuario.getDataCadastro());
            stm.setInt(7, usuario.getIdUsuario());

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
        String sql = "UPDATE usuario SET status=? WHERE idUsuario=?";

        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);

            stm.setString(1, "Inativo");
            stm.setInt(2, codigo);

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
    public Usuario getUsuario(int codigo) {
        Usuario usuario = null;
        String sql = "SELECT * FROM usuario WHERE idUsuario=" + codigo + "";
        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setPrevilegio(rs.getString("previlegio"));
                usuario.setStatus(rs.getString("status"));
                usuario.setSenha(rs.getString("dataCadastro"));
            }
           
            con.close();
            stm.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar. " + ex);

        }
        return usuario;
    }

    // RETORNA TODOS OS USUARIOS ///////////////////////////////////////////////
    public ArrayList<Usuario> getListaUsuarios(String nome) {
        ArrayList<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuario WHERE nome LIKE ? and status ='Ativo' ORDER BY nome";
        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1, "%" + nome + "%");
            rs = stm.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setPrevilegio(rs.getString("previlegio"));
                usuario.setStatus(rs.getString("status"));
                usuario.setSenha(rs.getString("dataCadastro"));
                lista.add(usuario);
            }
            
            con.close();
            stm.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar. " + ex);

        }
        return lista;
    }

    // RETORNA UM USUARIO AUTENTICADO //////////////////////////////////////////
    public Usuario getUsuarioAutenticado(String login, String senha) {
        Usuario usuario = null;
        String sql = "SELECT * FROM usuario WHERE login=? and senha=?";
        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);

            stm.setString(1, login);
            stm.setString(2, senha);

            rs = stm.executeQuery();

            if (rs.next()) {
                usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setPrevilegio(rs.getString("previlegio"));
                usuario.setStatus(rs.getString("status"));
                usuario.setSenha(rs.getString("dataCadastro"));
            }
            
            con.close();
            stm.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao BUSCAR USUARIO. " + ex);

        }
        return usuario;
    }

}
