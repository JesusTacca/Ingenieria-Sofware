/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.Servicio;

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
public class ControlarEstudianteTest {
    
    public ControlarEstudianteTest() {
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
     * Test of getEstudianteid method, of class ControlarEstudiante.
     */
    @Test
    public void testGetEstudianteid() {
        System.out.println("getEstudianteid");
        int id = 0;
        ControlarEstudiante instance = new ControlarEstudiante();
        String expResult = "";
        String result = instance.getEstudianteid(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listarEC method, of class ControlarEstudiante.
     */
    @Test
    public void testListarEC() {
        System.out.println("listarEC");
        int cod = 0;
        ControlarEstudiante instance = new ControlarEstudiante();
        ArrayList<Estudiante> expResult = null;
        ArrayList<Estudiante> result = instance.listarEC(cod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
