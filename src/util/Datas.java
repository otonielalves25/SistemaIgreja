/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

/**
 *
 * @author Tony
 */
//CLASSE RESPONSÁVEL POR MANIPULAR DATAS 
public class Datas {

    // RETORNA DATA DE HOJE EM STRING PADRÃO ///////////////////////////////////
    public static String getData() {
        DateFormat strDf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return strDf.format(date);
    }

    // RETORNA DATA PRONTA PARA INSERIR NO SQLITE //////////////////////////////
    public static Date dataParaSqLite(String dataString) {

        String[] dataNova = dataString.split("/");

        int dia = Integer.parseInt(dataNova[0]);
        int mes = Integer.parseInt(dataNova[1]);
        int ano = Integer.parseInt(dataNova[2]);

        Date dataCorrigida = new java.sql.Date(ano, mes, dia);

        return dataCorrigida;
    }

    // RETORNA DATA DE NASCIMENTO //////////////////////////////////////////////
    public static int calcIdade(String dataNascimento) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date hoje = new Date();
        String[] dtHoje = sdf.format(hoje).split("/");

        String[] dtNasc = dataNascimento.split("/");

        int idade = 0;
        idade = Integer.parseInt(dtHoje[2]) - Integer.parseInt(dtNasc[2]);
        if (Integer.parseInt(dtNasc[1]) > Integer.parseInt(dtHoje[1])) {
            idade--;
        } else if (Integer.parseInt(dtNasc[1]) == Integer.parseInt(dtHoje[1]) && Integer.parseInt(dtNasc[0])
                > Integer.parseInt(dtHoje[0])) {
            idade--;
        }
        return idade;
    }
}
