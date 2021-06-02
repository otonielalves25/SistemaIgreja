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
public class Membro {
    
        private int idMembro;
    private String nome;
    private Date dataNascimento;
    private String escolaridade;
    private String profissao;
    private String endereco;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    private String naturalidade;
    private String rg;
    private String cpf;
    private String celular;
    private String pai;
    private String mae;
    private String estadoCivil;
    private String conjuge;
    private String cargo;
    private byte[] foto;
    private String observacao;
    private Date dataCadastro;
    private String status;
    private String igrejaBatismo;
    private Date dataBatismo;
    private String pastorBatismo;
    private String sexo;
    private String email;
    private String dizimista;
    private Congregacao congregacao;
    private Date dataInicio;

    /**
     * @return the idMembro
     */
    public int getIdMembro() {
        return idMembro;
    }

    /**
     * @param idMembro the idMembro to set
     */
    public void setIdMembro(int idMembro) {
        this.idMembro = idMembro;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the escolaridade
     */
    public String getEscolaridade() {
        return escolaridade;
    }

    /**
     * @param escolaridade the escolaridade to set
     */
    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    /**
     * @return the profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * @param profissao the profissao to set
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the naturalidade
     */
    public String getNaturalidade() {
        return naturalidade;
    }

    /**
     * @param naturalidade the naturalidade to set
     */
    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the pai
     */
    public String getPai() {
        return pai;
    }

    /**
     * @param pai the pai to set
     */
    public void setPai(String pai) {
        this.pai = pai;
    }

    /**
     * @return the mae
     */
    public String getMae() {
        return mae;
    }

    /**
     * @param mae the mae to set
     */
    public void setMae(String mae) {
        this.mae = mae;
    }

    /**
     * @return the estadoCivil
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * @param estadoCivil the estadoCivil to set
     */
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * @return the conjuge
     */
    public String getConjuge() {
        return conjuge;
    }

    /**
     * @param conjuge the conjuge to set
     */
    public void setConjuge(String conjuge) {
        this.conjuge = conjuge;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the foto
     */
    public byte[] getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * @return the dataCadastro
     */
    public Date getDataCadastro() {
        return dataCadastro;
    }

    /**
     * @param dataCadastro the dataCadastro to set
     */
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the igrejaBatismo
     */
    public String getIgrejaBatismo() {
        return igrejaBatismo;
    }

    /**
     * @param igrejaBatismo the igrejaBatismo to set
     */
    public void setIgrejaBatismo(String igrejaBatismo) {
        this.igrejaBatismo = igrejaBatismo;
    }

    /**
     * @return the dataBatismo
     */
    public Date getDataBatismo() {
        return dataBatismo;
    }

    /**
     * @param dataBatismo the dataBatismo to set
     */
    public void setDataBatismo(Date dataBatismo) {
        this.dataBatismo = dataBatismo;
    }

    /**
     * @return the pastorBatismo
     */
    public String getPastorBatismo() {
        return pastorBatismo;
    }

    /**
     * @param pastorBatismo the pastorBatismo to set
     */
    public void setPastorBatismo(String pastorBatismo) {
        this.pastorBatismo = pastorBatismo;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the dizimista
     */
    public String getDizimista() {
        return dizimista;
    }

    /**
     * @param dizimista the dizimista to set
     */
    public void setDizimista(String dizimista) {
        this.dizimista = dizimista;
    }

    /**
     * @return the congregacao
     */
    public Congregacao getCongregacao() {
        return congregacao;
    }

    /**
     * @param congregacao the congregacao to set
     */
    public void setCongregacao(Congregacao congregacao) {
        this.congregacao = congregacao;
    }

    /**
     * @return the dataInicio
     */
    public Date getDataInicio() {
        return dataInicio;
    }
    
        public String getDataInicioFormatada() {
        return new SimpleDateFormat("dd/MM/yyyy").format(this.dataInicio);
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }



    public Membro() {
    }

    public Membro(int idMembro) {
        this.idMembro = idMembro;

    }

    public Membro(int idMembro, String nome) {
        this.idMembro = idMembro;
        this.nome = nome;

    }

    public Membro(int idMembro, String nome, Date dataNascimento, String escolaridade, String profissao, String endereco, String numero, String bairro, String cidade, String estado, String cep, String telefone, String naturalidade, String rg, String cpf, String celular, String pai, String mae, String estadoCivil, String conjuge, String cargo, byte[] foto, String observacao, Date dataCadastro, String status, String igrejaBatismo, Date dataBatismo, String pastorBatismo, String sexo, String email, String dizimista, Congregacao congregacao, Date dataInicio) {
        this.idMembro = idMembro;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.escolaridade = escolaridade;
        this.profissao = profissao;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.naturalidade = naturalidade;
        this.rg = rg;
        this.cpf = cpf;
        this.celular = celular;
        this.pai = pai;
        this.mae = mae;
        this.estadoCivil = estadoCivil;
        this.conjuge = conjuge;
        this.cargo = cargo;
        this.foto = foto;
        this.observacao = observacao;
        this.dataCadastro = dataCadastro;
        this.status = status;
        this.igrejaBatismo = igrejaBatismo;
        this.dataBatismo = dataBatismo;
        this.pastorBatismo = pastorBatismo;
        this.sexo = sexo;
        this.email = email;
        this.dizimista = dizimista;
        this.congregacao = congregacao;
        this.dataInicio = dataInicio;
    }

   

    
}
