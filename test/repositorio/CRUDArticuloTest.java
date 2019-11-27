/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import dominio.Proyecto.Articulo;
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
public class CRUDArticuloTest {
    
    public CRUDArticuloTest() {
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
     * Test of Listar_PdfVO method, of class CRUDArticulo.
     */
    @Test
    public void testListar_PdfVO() {
        System.out.println("Listar_PdfVO");
        CRUDArticulo instance = new CRUDArticulo();
        ArrayList<Articulo> expResult = null;
        ArrayList<Articulo> result = instance.Listar_PdfVO();
        assertEquals(expResult, result);
    }
    /**
     * Test of Agregar_PdfVO method, of class CRUDArticulo.
     */
    @Test
    public void testAgregar_PdfVO() {
        System.out.println("Agregar_PdfVO");
        Articulo vo = new Articulo();
        vo.setCodigo(11);
        vo.setTitulo("IS");
        vo.setFecha("17/08/19");
        byte[] p={100,-50,3};
        vo.setArchivo2(p);
        CRUDArticulo instance = new CRUDArticulo();
        instance.Agregar_PdfVO(vo);
    }

    /**
     * Test of Modificar_PdfVO method, of class CRUDArticulo.
     */
    @Test
    public void testModificar_PdfVO() {
        System.out.println("Modificar_PdfVO");
        Articulo vo = null;
        CRUDArticulo instance = new CRUDArticulo();
        instance.Modificar_PdfVO(vo);
    }

    /**
     * Test of Modificar_PdfVO2 method, of class CRUDArticulo.
     */
    @Test
    public void testModificar_PdfVO2() {
        System.out.println("Modificar_PdfVO2");
        Articulo vo = new Articulo();
        vo.setTitulo("EDA");
        CRUDArticulo instance = new CRUDArticulo();
        instance.Modificar_PdfVO2(vo);
    }

    /**
     * Test of Eliminar_PdfVO method, of class CRUDArticulo.
     */
    @Test
    public void testEliminar_PdfVO() {
        System.out.println("Eliminar_PdfVO");
        int id = 0;
        CRUDArticulo instance = new CRUDArticulo();
        instance.Eliminar_PdfVO(id);
    }

}
