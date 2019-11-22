package dominio.Servicio;

import dominio.Modelo.Admin;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControlarAdminTest {
    Admin ad;
    @Before
    public void setUp() {
        ad= new Admin(199, "testUser1", "testUser", "testUser@gmail.com", 66666666, "testUser", "testUser");
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
}
