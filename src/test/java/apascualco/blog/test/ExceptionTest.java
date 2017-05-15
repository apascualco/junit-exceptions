package apascualco.blog.test;

import apascualco.blog.dominio.Persona;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.LinkedList;
import java.util.List;

public class ExceptionTest {

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void nullPointerException(){
        expected.expect(NullPointerException.class);
        Persona persona = null;
        persona.getNombre();
    }

    @Test
    public void nullPointerExceptionInRule(){
        List<Persona> personas = new LinkedList<>();
        expected.expect(IndexOutOfBoundsException.class);
        expected.expectMessage("Index: 1, Size: 0");
        personas.get(1);
    }

    @Test(expected = NullPointerException.class)
    public void nullPointerExceptionInAnnotationTest(){
        Persona persona = null;
        persona.getNombre();
    }

}
