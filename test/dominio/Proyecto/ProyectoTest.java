/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.Proyecto;

import java.io.InputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class ProyectoTest {
    
    public ProyectoTest() {
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
     * Test of getCodigo method, of class Proyecto.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Proyecto instance = new Proyecto();
       // instance.setCodigo(0);
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result!=expResult){
            fail("The test case is a prototype.");
        }
    }
    /**
     * Test of getTitulo method, of class Proyecto.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Proyecto instance = new Proyecto();
        instance.setTitulo("IS");
        String expResult = "IS";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getFecha method, of class Proyecto.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Proyecto instance = new Proyecto();
        instance.setFecha("1/1/1");
        String expResult = "1/1/1";
        String result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getArchivo method, of class Proyecto.
     */
    @Test
    public void testGetArchivo() {
        System.out.println("getArchivo");
        Proyecto instance = new Proyecto();
        InputStream expResult = null;
        InputStream result = instance.getArchivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result == null ? expResult != null : !result.equals(expResult)){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setCodigo method, of class Proyecto.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigopdf = 0;
        Proyecto instance = new Proyecto();
        instance.setCodigo(codigopdf);
        // TODO review the generated test code and remove the default call to fail.
        if(codigopdf!=instance.getCodigo()){
            fail("The test case is a prototype.");
        }
        }

    /**
     * Test of setTitulo method, of class Proyecto.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String nombrepdf = "IS";
        Proyecto instance = new Proyecto();
        instance.setTitulo(nombrepdf);
        // TODO review the generated test code and remove the default call to fail.
        if(!nombrepdf.equals(instance.getTitulo()))
            fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Proyecto.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String fecha = "1/1/1";
        Proyecto instance = new Proyecto();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        if(!fecha.equals(instance.getFecha()))
            fail("The test case is a prototype.");
    }

    /**
     * Test of setArchivo method, of class Proyecto.
     */
    @Test
    public void testSetArchivo() {
        System.out.println("setArchivo");
        InputStream archivopdf = null;
        Proyecto instance = new Proyecto();
        instance.setArchivo(archivopdf);
        // TODO review the generated test code and remove the default call to fail.
        if(archivopdf!=instance.getArchivo())
            fail("The test case is a prototype.");
    }

    /**
     * Test of getArchivo2 method, of class Proyecto.
     */
    @Test
    public void testGetArchivo2() {
        System.out.println("getArchivo2");
        Proyecto instance = new Proyecto();
        byte[] expResult = null;
        byte[] result = instance.getArchivo2();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult!=result)
            fail("The test case is a prototype.");
    }

    /**
     * Test of setArchivo2 method, of class Proyecto.
     */
    @Test
    public void testSetArchivo2() {
        System.out.println("setArchivo2");
        byte[] archivopdf2 = null;
        Proyecto instance = new Proyecto();
        instance.setArchivo2(archivopdf2);
        // TODO review the generated test code and remove the default call to fail.
        if(archivopdf2!=instance.getArchivo2())
            fail("The test case is a prototype.");
    }
    
}
