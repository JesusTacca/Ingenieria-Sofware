package dominio.Servicio;

import dominio.Modelo.Admin;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControlarAdminTest {
    Admin ad,ad2,ad3,ad4,ad5,ad6;
    public ControlarAdminTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ad= new Admin(199, "testUser1", "testUser", "testUser@gmail.com", 66666666, "testUser", "testUser");
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCrearAdmin() {
        System.out.println("crearAdmin");
        ControlarAdmin instance = new ControlarAdmin();
        boolean expResult = true;
        boolean result = instance.crearAdmin(ad);
        assertEquals(expResult, result);

    }

    /**
     * Test of autentificarAdmin method, of class ControlarAdmin.
     */

    @Test
    public void testAutentificarAdmin() {
        System.out.println("autentificarAdmin");
        String user = "efrain";
        String pass = "1234";
        ControlarAdmin instance = new ControlarAdmin();
        boolean expResult = true;
        boolean result = instance.autentificarAdmin(user, pass);
        assertEquals(expResult, result);

    }

    /**
     * Test of getAllAdmin method, of class ControlarAdmin.
     
    @Test
    public void testGetAllAdmin() {
        System.out.println("getAllAdmin");
        ControlarAdmin instance = new ControlarAdmin();
        ArrayList<Admin> expResult = null;
        ArrayList<Admin> result = instance.getAllAdmin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    
    /**
     * Test of actualizarAdmin method, of class ControlarAdmin.
     */
    @Test
    public void testActualizarAdmin() {
        System.out.println("actualizarAdmin");
        Admin p = new Admin(12, "EditadoManuelito", "EditadoManuelito", "EditadoManuelito@gmail.com", 234234, "EditadoManuelito", "EditadoManuelito");
        ControlarAdmin instance = new ControlarAdmin();
        boolean expResult = true;
        boolean result = instance.actualizarAdmin(p);
        assertEquals(expResult, result);

    }

    /**
     * Test of eliminarAdmin method, of class ControlarAdmin.
     */
    @Test
    public void testEliminarAdmin() {
        System.out.println("eliminarAdmin");
        int id = 199;
        ControlarAdmin instance = new ControlarAdmin();
        boolean expResult = true;
        boolean result = instance.eliminarAdmin(id);
        assertEquals(expResult, result);

    }

    /**
     * Test of getAdminId method, of class ControlarAdmin.
    
    @Test
    public void testGetAdminId() {
        System.out.println("getAdminId");
        int id = 0;
        ControlarAdmin instance = new ControlarAdmin();
        String expResult = "";
        String result = instance.getAdminId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     */
}
