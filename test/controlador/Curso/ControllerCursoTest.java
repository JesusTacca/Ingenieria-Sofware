/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.Curso;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
public class ControllerCursoTest {
    int id,codProf,Semestre;
    String action;
    private Object request;
    public ControllerCursoTest() {
        this.action = request.toString();
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
     * Test of processRequest method, of class ControllerCurso.
     */
    @Test
    public void testProcessRequest() throws Exception {
        System.out.println("Requerimiento");
        id=Integer.parseInt(request.toString());
            Semestre=Integer.parseInt(request.toString());
            String nom=request.toString();
            int idesc =Integer.parseInt(request.toString());
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        ControllerCurso instance = new ControllerCurso();
        instance.processRequest(request, response);
        // TODO review the generated test code and remove the default call to fail.
        if(!response.equals(request)){
            fail("El Test es incorrecto");
        }
    }

    /**
     * Test of doGet method, of class ControllerCurso.
     */
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        ControllerCurso instance = new ControllerCurso();
        instance.doGet(request, response);
        // TODO review the generated test code and remove the default call to fail.
        if(!response.equals(request)){
            fail("El Test es incorrecto");
        }
    }

    /**
     * Test of doPost method, of class ControllerCurso.
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        ControllerCurso instance = new ControllerCurso();
        instance.doPost(request, response);
        // TODO review the generated test code and remove the default call to fail.
        if(!response.equals(request)){
            fail("El Test es incorrecto");
        }
    }

    /**
     * Test of getServletInfo method, of class ControllerCurso.
     */
    @Test
    public void testGetServletInfo() {
        System.out.println("getServletInfo");
        ControllerCurso instance = new ControllerCurso();
        String expResult = "";
        String result = instance.getServletInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
            fail("El Test es incorrecto");
        }
    }
    
}
