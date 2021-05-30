/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modelo.Congregacao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tony
 */
public class CongregacaoDaoTest {
    
    public CongregacaoDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of inserirNovo method, of class CongregacaoDao.
     */
    @Test
    public void testInserirNovo() {
        System.out.println("inserirNovo");
        Congregacao congregacao = null;
        CongregacaoDao instance = new CongregacaoDao();
        boolean expResult = false;
        boolean result = instance.inserirNovo(congregacao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterar method, of class CongregacaoDao.
     */
    @Test
    public void testAlterar() {
        System.out.println("alterar");
        Congregacao congregacao = null;
        CongregacaoDao instance = new CongregacaoDao();
        boolean expResult = false;
        boolean result = instance.alterar(congregacao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class CongregacaoDao.
     */
    @Test
    public void testExcluir() {
        System.out.println("excluir");
        int codigo = 0;
        CongregacaoDao instance = new CongregacaoDao();
        boolean expResult = false;
        boolean result = instance.excluir(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCongregacao method, of class CongregacaoDao.
     */
    @Test
    public void testGetCongregacao_int() {
        System.out.println("getCongregacao");
        int codigo = 0;
        CongregacaoDao instance = new CongregacaoDao();
        Congregacao expResult = null;
        Congregacao result = instance.getCongregacao(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCongregacao method, of class CongregacaoDao.
     */
    @Test
    public void testGetCongregacao_String() {
        System.out.println("getCongregacao");
        String nome = "";
        CongregacaoDao instance = new CongregacaoDao();
        Congregacao expResult = null;
        Congregacao result = instance.getCongregacao(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaCongregacoes method, of class CongregacaoDao.
     */
    @Test
    public void testGetListaCongregacoes() {
        System.out.println("getListaCongregacoes");
        CongregacaoDao instance = new CongregacaoDao();
        ArrayList<Congregacao> expResult = null;
        ArrayList<Congregacao> result = instance.getListaCongregacoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCongregacao method, of class CongregacaoDao.
     */
    @Test
    public void testGetCongregacao_Object() {
        System.out.println("getCongregacao");
        Object selectedItem = null;
        CongregacaoDao instance = new CongregacaoDao();
        Congregacao expResult = null;
        Congregacao result = instance.getCongregacao(selectedItem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
