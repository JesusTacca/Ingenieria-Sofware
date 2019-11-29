package dominio.Modelo;

import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;
import static org.junit.Assert.*;

public class ProfesorTest extends TestCase{
    Profesor po;
    @Before
    public void setUp() {
        po= new Profesor(300, "TestProfesor", "TestProfesor"
                , "TestProfesor@gmail.com", 123123, "TestProfesor"
                , "TestProfesor", "TestProfesor", "TestProfesor");
    }
    @Test
    public void testGetGrado() {
        String expResult = "TestProfesor";
        String result = po.getGrado();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetGrado() {
        String grado = "";
        po.setGrado(grado);
    }
    @Test
    public void testGetEspecialidad() {
        String expResult = "TestProfesor";
        String result = po.getEspecialidad();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetEspecialidad() {
        String especialidad = "especialidad nueva";
        po.setEspecialidad(especialidad);

    }
    
}
