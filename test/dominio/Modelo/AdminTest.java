
package dominio.Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Efra
 */
public class AdminTest {
    Admin ad;
    public AdminTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ad= new Admin(1, "testUsername", "testPassword", "test@gmail.com", 1234567, "testName", "TestApellido");
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAdminUsername() {
        String usrname= "testUsername";
        assertEquals(usrname, ad.getUsername());
    }
    
    @Test
    public void testAdminDni() {
        int dni=1234567;
        assertEquals(dni, ad.getDni());
    }
    
    @Test
    public void testAdminEmail() {
        String e="test@gmail.com";
        assertEquals(e, ad.getEmail());
    }
    @Test
    public void testAdminId() {
        int cod = 1;
        assertEquals(cod, ad.getCod());
    }
    
}
