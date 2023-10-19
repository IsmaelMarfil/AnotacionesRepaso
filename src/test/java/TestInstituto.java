import org.example.Alumno;
import org.example.Instituto;
import org.example.UtilContexto;
import org.junit.Assert;
import org.junit.Test;

public class TestInstituto {
    @Test
    public void testInstituto(){
        Instituto instituto= new Instituto();
        UtilContexto.cargadorContexto(instituto);
        for (Alumno alumno: instituto.getAlumnos()
             ) {
            if(alumno.getApellido().equalsIgnoreCase("gomez")){
                Assert.assertEquals("Pepe", alumno.getNombre());
            }else{
                Assert.assertEquals("Pepa", alumno.getNombre());
            }
        }
    }
}
