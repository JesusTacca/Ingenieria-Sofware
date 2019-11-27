/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import dominio.Modelo.curso;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gino
 */
public class cursoDAOTest {
    
    public cursoDAOTest() {
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
     * Test of obtenerid method, of class cursoDAO.
     */
    @Test
    public void testObtenerid() {
        System.out.println("obtenerid");
        String usuario = "";
        cursoDAO instance = new cursoDAO();
        int expResult = 0;
        int result = instance.obtenerid(usuario);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of add method, of class cursoDAO.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int cod = 0;
        int semestre = 0;
        String nombre = "";
        int cod_es = 0;
        cursoDAO instance = new cursoDAO();
        boolean expResult = false;
        boolean result = instance.add(cod, semestre, nombre, cod_es);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of edit method, of class cursoDAO.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        curso _curso = new curso();
        cursoDAO instance = new cursoDAO();
        boolean expResult = false;
        boolean result = instance.edit(_curso);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of eliminar method, of class cursoDAO.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        int id = 0;
        cursoDAO instance = new cursoDAO();
        boolean expResult = false;
        boolean result = instance.eliminar(id);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCurso method, of class cursoDAO.
     */
    
    @Test
    public void testGetCurso() {
        System.out.println("getCurso");
        int cod = 0;
        cursoDAO instance = new cursoDAO();
        curso expResult = null;
        curso result = instance.getCurso(cod);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addprof_curso method, of class cursoDAO.
     */
    @Test
    public void testAddprof_curso() {
        System.out.println("addprof_curso");
        int codprof = 0;
        int codcurso = 0;
        cursoDAO instance = new cursoDAO();
        boolean expResult = false;
        boolean result = instance.addprof_curso(codprof, codcurso);
        assertEquals(expResult, result);
        
    }

}
