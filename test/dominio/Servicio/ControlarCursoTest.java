/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.Servicio;

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
public class ControlarCursoTest {
    
    public ControlarCursoTest() {
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
     * Test of add method, of class ControlarCurso.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int id = 12;
        int semestre = 6;
        String nombre = "IS";
        int cod_es = 1;
        ControlarCurso instance = new ControlarCurso();
        boolean expResult = false;
        boolean result = instance.add(id, semestre, nombre, cod_es);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of addprof_curso method, of class ControlarCurso.
     */
    @Test
    public void testAddprof_curso() {
        System.out.println("addprof_curso");
        int codprof = 0;
        int codcurso = 0;
        ControlarCurso instance = new ControlarCurso();
        boolean expResult = false;
        boolean result = instance.addprof_curso(codprof, codcurso);
        assertEquals(expResult, result);
       
        
    }

    /**
     * Test of edit method, of class ControlarCurso.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        curso _curso = new curso();
        ControlarCurso instance = new ControlarCurso();
        boolean expResult = false;
        boolean result = instance.edit(_curso);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of eliminar method, of class ControlarCurso.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        int id = 0;
        ControlarCurso instance = new ControlarCurso();
        boolean expResult = false;
        boolean result = instance.eliminar(id);
        assertEquals(expResult, result);
       
    }

}
