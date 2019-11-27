/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import dominio.Proyecto.Proyecto;
import java.util.ArrayList;
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
public class CRUDProyectoTest {
    
    public CRUDProyectoTest() {
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
     * Test of Agregar_PdfVO method, of class CRUDProyecto.
     */
    @Test
    public void testAgregar_PdfVO() {
        System.out.println("Agregar_PdfVO");
        Proyecto vo = null;
        CRUDProyecto instance = new CRUDProyecto();
        instance.Agregar_PdfVO(vo);
    }

    /**
     * Test of Modificar_PdfVO method, of class CRUDProyecto.
     */
    @Test
    public void testModificar_PdfVO() {
        System.out.println("Modificar_PdfVO");
        Proyecto vo = null;
        CRUDProyecto instance = new CRUDProyecto();
        instance.Modificar_PdfVO(vo);
    }

    /**
     * Test of Modificar_PdfVO2 method, of class CRUDProyecto.
     */
    @Test
    public void testModificar_PdfVO2() {
        System.out.println("Modificar_PdfVO2");
        Proyecto vo = null;
        CRUDProyecto instance = new CRUDProyecto();
        instance.Modificar_PdfVO2(vo);
    }

    /**
     * Test of Eliminar_PdfVO method, of class CRUDProyecto.
     */
    @Test
    public void testEliminar_PdfVO() {
        System.out.println("Eliminar_PdfVO");
        int id = 0;
        CRUDProyecto instance = new CRUDProyecto();
        instance.Eliminar_PdfVO(id);
    }

    
    
}
