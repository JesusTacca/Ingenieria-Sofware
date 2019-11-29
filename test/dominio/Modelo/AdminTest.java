package dominio.Modelo;

import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;
import static org.junit.Assert.*;

public class AdminTest extends TestCase{
    Admin ad;
    @Before
    public void setUp() {
        ad= new Admin(1, "testUsername", "testPassword", "test@gmail.com"
                ,1234567, "testName", "TestApellido");
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
