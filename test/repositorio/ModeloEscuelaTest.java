/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import dominio.Modelo.Escuela;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class ModeloEscuelaTest {
    Escuela Base;
    @Before
    public void setUp() {
        Base = new Escuela(124,"CS");
    }
    

    @Test
    public void testCrearEscuela() {
        System.out.println("crearEscuela");
        Escuela a = Base;
        ModeloEscuela instance = new ModeloEscuela();
        boolean expResult = false;
        boolean result = instance.crearEscuela(a);
        assertEquals(expResult, result);
    }

    @Test
    public void testDeleteEscuela() {
        System.out.println("deleteEscuela");
        int idEscuela = 20;
        ModeloEscuela instance = new ModeloEscuela();
        boolean expResult = false;
        boolean result = instance.deleteEscuela(idEscuela);
        assertEquals(expResult, result);
    }

    @Test
    public void testUpdateEscuela() {
        System.out.println("updateEscuela");
        Escuela a = Base;
        ModeloEscuela instance = new ModeloEscuela();
        boolean expResult = false;
        boolean result = instance.updateEscuela(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of listar method, of class ModeloEscuela.
     */
    /*
    @Test
    public void testListar() {
        System.out.println("listar");
        ModeloEscuela instance = new ModeloEscuela();
        ArrayList<Escuela> expResult = null;
        ArrayList<Escuela> result = instance.listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
