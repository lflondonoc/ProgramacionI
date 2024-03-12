/**
 * Clase para probar el funcionamiento del proyecto universidad
 * @author Área de programación UQ
 * @since 2024-02
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class EstudianteTest {
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());

    /**
     * Prueba para verificar los datos completos de un estudiante
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciando test datosCompletos");

        Estudiante estudiante = new Estudiante ("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co", "315635674",(byte) 18);
        
        assertEquals("Camila", estudiante.nombres());
        assertEquals("Alzate Rios", estudiante.apellidos());
        assertEquals("109453264", estudiante.numeroIdentificacion());
        assertEquals("camila@uniquindio.edu.co", estudiante.correo());
        assertEquals("315635674", estudiante.telefono());
        assertEquals(18, estudiante.edad());
        
        
        LOG.info("Finalizando test datosCompletos");
    }
    /**
     * Prueba para verificar que los datos de un estudiante no sean nulos
     */
    @Test
    public void datosNulos() {
        LOG.info("Iniciando test datosNulos");

        assertThrows(Throwable.class, ()-> new Estudiante(null, null, null, null, null, (byte) 0) );        
        
        LOG.info("Finalizando test datosNulos");
    }
/**
 * Prueba para verificar que los datos de un estudiante no esten vacios
 */
    @Test
    public void datosVacios() {
        LOG.info("Iniciando test datosVacios");

        assertThrows(Throwable.class, ()-> new Estudiante(" ", " ", " ", " ", " ", (byte) 0) );        
        
        LOG.info("Finalizando test datosVacios");
    }
    /**
     * Prueba para verificar que la edad de un estudiante no sea negativa
     */
    @Test
    public void edadNegativa() {
        LOG.info("Iniciando test edadNegativa");

        assertThrows(Throwable.class, ()-> new Estudiante("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co", "315635674",(byte) -18));        
        
        LOG.info("Finalizando test edadNegativa");
    }
    /**
     * Prueba para verificar que el correo de un estudiante no se válido
     */
    @Test
    public void correoNoValido() {
        LOG.info("Iniciando test correoNoValido");

        assertThrows(Throwable.class, ()-> new Estudiante("Camila", "Alzate Rios", "109453264", "cami", "315635674",(byte)18));        
        
        LOG.info("Finalizando test correoNoValido");
    }
    
    
}
