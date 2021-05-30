/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modelo.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

/**
 *
 * @author Tony
 */
public class UsuarioDaoTest {

    public UsuarioDaoTest() {
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
     * Test of inserirNovo method, of class UsuarioDao.
     */
    @Test
    @Ignore
    public void testInserirNovo() {
        System.out.println("inserirNovo");
        Usuario usuario = new Usuario();
        usuario.setNome("TONI");
        UsuarioDao instance = new UsuarioDao();
        boolean expResult = false;
        boolean result = instance.inserirNovo(usuario);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterar method, of class UsuarioDao.
     */
    @Test
    @Ignore
    public void testAlterar() {
        System.out.println("alterar");
        Usuario usuario = null;
        UsuarioDao instance = new UsuarioDao();
        boolean expResult = false;
        boolean result = instance.alterar(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class UsuarioDao.
     */
    @Test
    //@Ignore
    public void testExcluir() {
        System.out.println("excluir");
        int codigo = 13;
        UsuarioDao instance = new UsuarioDao();
        boolean expResult = true;
        boolean result = instance.excluir(codigo);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class UsuarioDao.
     */
    @Test
    @Ignore
    public void testGetUsuario() {
        System.out.println("getUsuario");
        int codigo = 1;
        UsuarioDao instance = new UsuarioDao();
        Usuario expResult = null;
        Usuario result = instance.getUsuario(codigo);
        System.out.println(result.getNome());
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaUsuarios method, of class UsuarioDao.
     */
    @Test
    @Ignore
    public void testGetListaUsuarios() {
        System.out.println("getListaUsuarios");
        String nome = "";
        UsuarioDao dao = new UsuarioDao();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = dao.getListaUsuarios(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuarioAutenticado method, of class UsuarioDao.
     */
    @Test
    @Ignore
    public void testGetUsuarioAutenticado() {
        System.out.println("getUsuarioAutenticado");
        String login = "";
        String senha = "";
        UsuarioDao instance = new UsuarioDao();
        Usuario expResult = null;
        Usuario result = instance.getUsuarioAutenticado(login, senha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
