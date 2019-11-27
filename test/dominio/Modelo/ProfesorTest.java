package dominio.Modelo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProfesorTest {
    Profesor po;
    @Before
    public void setUp() {
        po= new Profesor(300, "TestProfesor", "TestProfesor", "TestProfesor@gmail.com", 123123, "TestProfesor", "TestProfesor", "TestProfesor", "TestProfesor");
    }
    @Test
    public void testGetGrado() {
        System.out.println("getGrado");
        String expResult = "TestProfesor";
        String result = po.getGrado();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGrado method, of class Profesor.
     */
    @Test
    public void testSetGrado() {
        System.out.println("setGrado");
        String grado = "";
        po.setGrado(grado);

    }

    /**
     * Test of getEspecialidad method, of class Profesor.
     */
    @Test
    public void testGetEspecialidad() {
        System.out.println("getEspecialidad");
        String expResult = "TestProfesor";
        String result = po.getEspecialidad();
        assertEquals(expResult, result);

    }

    /**
     * Test of setEspecialidad method, of class Profesor.
     */
    @Test
    public void testSetEspecialidad() {
        System.out.println("setEspecialidad");
        String especialidad = "especialidad nueva";
        po.setEspecialidad(especialidad);

    }
    
}
