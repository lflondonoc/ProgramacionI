package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class CursoTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * prueba para verificar los datos completos del curso
     */
    @Test
    public void datosCompletos(){
        LOG.info("Iniciando test datosCompletos");

        Curso curso= new Curso ("programación I");

        assertEquals("programación I", curso.getNombre());


        LOG.info("Finalizando test datosCompletos");
    }
    @Test
    public void agregarEstudiante(){
        LOG.info("Iniciando test agregarEstudiante");

        Curso curso = new Curso ("Programación I");
        Estudiante estudiante = new Estudiante("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co", "315635674",(byte) 18);

        curso.agregarEstudiante(estudiante);

        assertTrue(curso.getEstudiantes().contains(estudiante));
        assertEquals(1, curso.getEstudiantes().size());

        LOG.info("Finalizando test agregarEstudiante");
    }
    @Test
    public void datosNulos(){
        LOG.info("Iniciando test datosNulos");

        assertThrows(Throwable.class, ()-> new Curso(null));

        LOG.info("Finalizando test datosNulos");
    }
    @Test
    public void agregarEstudianteRepetido(){
        LOG.info("Iniciando test agregarEstudianteRepetido");

        var curso= new Curso("Programación I");
        Estudiante estudiante1 = new Estudiante("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co", "315635674",(byte) 18);
        Estudiante estudiante2 = new Estudiante("Rodrigo", "Calderon", "109453264", "rodrigo@uniquindio.edu.co", "3223451278",(byte) 19);

        curso.agregarEstudiante(estudiante1);

        assertThrows(Throwable.class, ()-> curso.agregarEstudiante(estudiante2));

        LOG.info("Finalizando test agregarEstudianteRepetido");
    }

}
