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
;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import modelo.Congregacao;
import modelo.Membro;



public class MembroDao {

    DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


    Connection con;
    PreparedStatement stm = null;
    ResultSet rs;
    CongregacaoDao congregacaoDao = new CongregacaoDao();

    // INSERINDO NOVO CADASTRO /////////////////////////////////////////////////    
    public boolean insert(Membro membro) {

        String sql = "INSERT INTO membro (nome, dataNascimento, escolaridade, profissao, endereco, numero, bairro,"
                + "cidade, estado, cep, telefone, naturalidade, rg, cpf, celular, pai, mae, estadoCivil, conjuge, cargo,"
                + "foto, observacao, dataCadastro, status, igrejaBatismo, dataBatismo, pastorBatismo,sexo,email, idCongregacao, "
                + "dizimista,dataInicioIgreja) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1, membro.getNome());
            stm.setString(2, sdf.format(membro.getDataNascimento()));
            stm.setString(3, membro.getEscolaridade());
            stm.setString(4, membro.getProfissao());
            stm.setString(5, membro.getEndereco());
            stm.setString(6, membro.getNumero());
            stm.setString(7, membro.getBairro());
            stm.setString(8, membro.getCidade());
            stm.setString(9, membro.getEstado());
            stm.setString(10, membro.getCep());
            stm.setString(11, membro.getTelefone());
            stm.setString(12, membro.getNaturalidade());
            stm.setString(13, membro.getRg());
            stm.setString(14, membro.getCpf());
            stm.setString(15, membro.getCelular());
            stm.setString(16, membro.getPai());
            stm.setString(17, membro.getMae());
            stm.setString(18, membro.getEstadoCivil());
            stm.setString(19, membro.getConjuge());
            stm.setString(20, membro.getCargo());
            stm.setBytes(21, membro.getFoto());
            stm.setString(22, membro.getObservacao());
            if (membro.getDataCadastro() != null) {
                stm.setString(23, sdf.format(membro.getDataCadastro()));
            } else {
                stm.setString(23, "");
            }

            stm.setString(24, membro.getStatus());
            stm.setString(25, membro.getIgrejaBatismo());

            if (membro.getDataBatismo() != null) {
                stm.setString(26, sdf.format(membro.getDataBatismo()));
            } else {
                stm.setString(26, "");
            }

            stm.setString(27, membro.getPastorBatismo());
            stm.setString(28, membro.getSexo());
            stm.setString(29, membro.getEmail());
            stm.setInt(30, membro.getCongregacao().getIdCongregacao());
            stm.setString(31, membro.getDizimista());
            if (membro.getDataInicio() != null) {
                stm.setString(32, sdf.format(membro.getDataInicio()));
            } else {
                stm.setString(32, "");
            }

            stm.execute();
            con.close();
            stm.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Dao. " + ex);
            return false;
        }

    }

    // ALTERA CADASTRO /////////////////////////////////////////////////////////    
    public boolean update(Membro membro) {

        String sql = "UPDATE membro SET nome=?, dataNascimento=?, escolaridade=?, profissao=?, endereco=?, numero=?, bairro=?,"
                + "cidade=?, estado=?, cep=?, telefone=?, naturalidade=?, rg=?, cpf=?, celular=?, pai=?, mae=?, estadoCivil=?, conjuge=?, cargo=?,"
                + "foto=?, observacao=?, dataCadastro=?, status=?, igrejaBatismo=?, dataBatismo=?, pastorBatismo=?, sexo=?, email=?,"
                + "idCongregacao=?, dizimista=?, dataInicioIgreja=? WHERE idMembro=?";

        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1, membro.getNome());
            stm.setString(2, sdf.format(membro.getDataNascimento()));
            stm.setString(3, membro.getEscolaridade());
            stm.setString(4, membro.getProfissao());
            stm.setString(5, membro.getEndereco());
            stm.setString(6, membro.getNumero());
            stm.setString(7, membro.getBairro());
            stm.setString(8, membro.getCidade());
            stm.setString(9, membro.getEstado());
            stm.setString(10, membro.getCep());
            stm.setString(11, membro.getTelefone());
            stm.setString(12, membro.getNaturalidade());
            stm.setString(13, membro.getRg());
            stm.setString(14, membro.getCpf());
            stm.setString(15, membro.getCelular());
            stm.setString(16, membro.getPai());
            stm.setString(17, membro.getMae());
            stm.setString(18, membro.getEstadoCivil());
            stm.setString(19, membro.getConjuge());
            stm.setString(20, membro.getCargo());
            stm.setBytes(21, membro.getFoto());
            stm.setString(22, membro.getObservacao());
            stm.setString(23, sdf.format(membro.getDataCadastro()));
            stm.setString(24, membro.getStatus());
            stm.setString(25, membro.getIgrejaBatismo());
            stm.setString(26, sdf.format(membro.getDataBatismo()));
            stm.setString(27, membro.getPastorBatismo());
            stm.setString(28, membro.getSexo());
            stm.setString(29, membro.getEmail());
            stm.setInt(30, membro.getCongregacao().getIdCongregacao());
            stm.setString(31, membro.getDizimista());
            stm.setString(32, sdf.format(membro.getDataInicio()));
            stm.setInt(33, membro.getIdMembro());

            stm.execute();
            con.close();
            stm.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar Dao. " + ex);
            return false;
        }
    }

    // EXCLUIR CADASTRO ////////////////////////////////////////////////////////
    public boolean delete(int codigo) {
        String sql = "DELETE FROM membro WHERE idMembro= ?";

        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, codigo);
            stm.executeUpdate();
            stm.close();
            con.close();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Dao. " + e);
            return false;
        }
    }

    // RETORNA UMA BUSCAS //////////////////////////////////////////////////////
    public Membro getMembro(int codigo) {
        Membro men = null;
        String sql = "SELECT * from membro where idMembro= ?";

        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, codigo);
            rs = stm.executeQuery();

            if (rs.next()) {
                men = new Membro();
                men.setIdMembro(rs.getInt("idMembro"));
                men.setNome(rs.getString("nome"));
                if (rs.getString("dataNascimento") != null) {
                    men.setDataNascimento(sdf.parse(rs.getString("dataNascimento")));
                } else {
                    men.setDataNascimento(null);
                }
                men.setEscolaridade(rs.getString("escolaridade"));
                men.setProfissao(rs.getString("profissao"));
                men.setEndereco(rs.getString("endereco"));
                men.setNumero(rs.getString("numero"));
                men.setBairro(rs.getString("bairro"));
                men.setCidade(rs.getString("cidade"));
                men.setEstado(rs.getString("estado"));
                men.setTelefone(rs.getString("telefone"));
                men.setNaturalidade(rs.getString("naturalidade"));
                
                men.setCep(rs.getString("cep"));
                men.setRg(rs.getString("rg"));
                men.setCpf(rs.getString("cpf"));
                men.setCelular(rs.getString("celular"));
                men.setPai(rs.getString("pai"));
                men.setMae(rs.getString("mae"));
                men.setEstadoCivil(rs.getString("estadoCivil"));
                men.setConjuge(rs.getString("conjuge"));
                men.setCargo(rs.getString("cargo"));
                men.setFoto(rs.getBytes("foto"));
                men.setObservacao(rs.getString("observacao"));

                if (rs.getString("dataCadastro") != null) {
                    men.setDataCadastro(sdf.parse(rs.getString("dataCadastro")));
                } else {
                    men.setDataCadastro(null);
                }

                men.setStatus(rs.getString("status"));
                men.setIgrejaBatismo(rs.getString("igrejaBatismo"));

                if (rs.getString("dataBatismo") != null) {
                    men.setDataBatismo(sdf.parse(rs.getString("dataBatismo")));
                } else {
                    men.setDataBatismo(null);
                }
                men.setPastorBatismo(rs.getString("pastorBatismo"));
                men.setSexo(rs.getString("sexo"));
                men.setEmail(rs.getString("email"));
                //-------------------------------------------
                Congregacao congregacao = congregacaoDao.getCongregacao(rs.getInt("idCongregacao"));
                //-------------------------------------------
                men.setCongregacao(congregacao);
                men.setDizimista(rs.getString("dizimista"));
                if (rs.getString("dataInicioIgreja") != null) {
                    men.setDataInicio(sdf.parse(rs.getString("dataInicioIgreja")));
                } else {
                    men.setDataInicio(null);
                }

            }

            stm.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar 1 usuario Dao. " + e);

        } catch (ParseException ex) {
            Logger.getLogger(MembroDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return men;
    }

    // RETORNA UMA TODOS ///////////////////////////////////////////////////////
    public ArrayList<Membro> getListagem(String nome) {
        ArrayList<Membro> lista = new ArrayList<>();
        Membro men;
        String sql = "SELECT * from membro where nome LIKE ?";

        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1, "%" + nome + "%");
            rs = stm.executeQuery();

            while (rs.next()) {
                men = new Membro();
                men.setIdMembro(rs.getInt("idMembro"));
                men.setNome(rs.getString("nome"));
                if (rs.getString("dataNascimento") != null) {
                    men.setDataNascimento(sdf.parse(rs.getString("dataNascimento")));
                } else {
                    men.setDataNascimento(null);
                }
                men.setEscolaridade(rs.getString("escolaridade"));
                men.setProfissao(rs.getString("profissao"));
                men.setEndereco(rs.getString("endereco"));
                men.setNumero(rs.getString("numero"));
                men.setBairro(rs.getString("bairro"));
                men.setCidade(rs.getString("cidade"));
                men.setEstado(rs.getString("estado"));
                 men.setTelefone(rs.getString("telefone"));
                men.setNaturalidade(rs.getString("naturalidade"));
                men.setCep(rs.getString("cep"));
                men.setRg(rs.getString("rg"));
                men.setCpf(rs.getString("cpf"));
                men.setCelular(rs.getString("celular"));
                men.setPai(rs.getString("pai"));
                men.setMae(rs.getString("mae"));
                men.setEstadoCivil(rs.getString("estadoCivil"));
                men.setConjuge(rs.getString("conjuge"));
                men.setCargo(rs.getString("cargo"));
                men.setFoto(rs.getBytes("foto"));
                men.setObservacao(rs.getString("observacao"));

                if (rs.getString("dataCadastro") != null) {
                    men.setDataCadastro(sdf.parse(rs.getString("dataCadastro")));
                } else {
                    men.setDataCadastro(null);
                }

                men.setStatus(rs.getString("status"));
                men.setIgrejaBatismo(rs.getString("igrejaBatismo"));

                if (rs.getString("dataBatismo") != null) {
                    men.setDataBatismo(sdf.parse(rs.getString("dataBatismo")));
                } else {
                    men.setDataBatismo(null);
                }
                men.setPastorBatismo(rs.getString("pastorBatismo"));
                men.setSexo(rs.getString("sexo"));
                men.setEmail(rs.getString("email"));
                //-------------------------------------------
                Congregacao congregacao = congregacaoDao.getCongregacao(rs.getInt("idCongregacao"));
                //-------------------------------------------
                men.setCongregacao(congregacao);
                men.setDizimista(rs.getString("dizimista"));
                if (rs.getString("dataInicioIgreja") != null) {
                    men.setDataInicio(sdf.parse(rs.getString("dataInicioIgreja")));
                } else {
                    men.setDataInicio(null);
                }

                lista.add(men);

            }

            stm.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar lista membro Dao. " + e);

        } catch (ParseException ex) {
            Logger.getLogger(MembroDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    // RETORNA ID POR NOME ////////////////////////////////////////////////////
    public int getIdMembro(String nome) {
        int codigo = 0;
        String sql = "SELECT * from membro where nome = ?";

        try {
            con = conexao.ConexaoSqLite.getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1, nome);
            rs = stm.executeQuery();

            if (rs.next()) {
                codigo = rs.getInt("idMembro");

            }

            stm.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar 1 usuario Dao. " + e);

        }

        return codigo;
    }

}
