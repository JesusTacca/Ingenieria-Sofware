/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import dominio.Modelo.Estudiante;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fernando
 */
public class CrudEstudianteTest {
    
    public CrudEstudianteTest() {
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
     * Test of crearEstudiante method, of class CrudEstudiante.
     */
    @Test
    public void testCrearEstudiante() {
        System.out.println("crearEstudiante");
        Estudiante u = null;
        CrudEstudiante instance = new CrudEstudiante();
        boolean expResult = false;
        boolean result = instance.crearEstudiante(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarestudiante method, of class CrudEstudiante.
     */
    @Test
    public void testActualizarestudiante() {
        System.out.println("actualizarestudiante");
        Estudiante u = null;
        CrudEstudiante instance = new CrudEstudiante();
        boolean expResult = false;
        boolean result = instance.actualizarestudiante(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of autentificarEstudiante method, of class CrudEstudiante.
     */
    @Test
    public void testAutentificarEstudiante() {
        System.out.println("autentificarEstudiante");
        String user = "";
        String pass = "";
        CrudEstudiante instance = new CrudEstudiante();
        boolean expResult = false;
        boolean result = instance.autentificarEstudiante(user, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarEstudiante method, of class CrudEstudiante.
     */
    @Test
    public void testEliminarEstudiante() {
        System.out.println("eliminarEstudiante");
        int cod = 0;
        CrudEstudiante instance = new CrudEstudiante();
        boolean expResult = false;
        boolean result = instance.eliminarEstudiante(cod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllEstudiantes method, of class CrudEstudiante.
     */
    @Test
    public void testGetAllEstudiantes() {
        System.out.println("getAllEstudiantes");
        CrudEstudiante instance = new CrudEstudiante();
        ArrayList<Estudiante> expResult = null;
        ArrayList<Estudiante> result = instance.getAllEstudiantes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of asignarCurso_Estudiante method, of class CrudEstudiante.
     */
    @Test
    public void testAsignarCurso_Estudiante() {
        System.out.println("asignarCurso_Estudiante");
        int cod = 0;
        int es = 0;
        int c = 0;
        CrudEstudiante instance = new CrudEstudiante();
        boolean expResult = false;
        boolean result = instance.asignarCurso_Estudiante(cod, es, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEstudiante method, of class CrudEstudiante.
     */
    @Test
    public void testGetEstudiante() {
        System.out.println("getEstudiante");
        int id = 0;
        CrudEstudiante instance = new CrudEstudiante();
        Estudiante expResult = null;
        Estudiante result = instance.getEstudiante(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
