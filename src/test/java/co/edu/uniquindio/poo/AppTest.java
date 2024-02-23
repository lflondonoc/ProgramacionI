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
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Prueba para verificar los datos completos 
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

    @Test
    public void datosNulos() {
        LOG.info("Iniciando test datosNulos");

        assertThrows(Throwable.class, ()-> new Estudiante(null, null, null, null, null, (byte) 0) );        
        
        LOG.info("Finalizando test datosNulos");
    }

    @Test
    public void datosVacios() {
        LOG.info("Iniciando test datosVacios");

        assertThrows(Throwable.class, ()-> new Estudiante(" ", " ", " ", " ", " ", (byte) 0) );        
        
        LOG.info("Finalizando test datosVacios");
    }
    @Test
    public void edadNegativa() {
        LOG.info("Iniciando test edadNegativa");

        assertThrows(Throwable.class, ()-> new Estudiante("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co", "315635674",(byte) -18));        
        
        LOG.info("Finalizando test edadNegativa");
    }
    @Test
    public void correoNoValido() {
        LOG.info("Iniciando test correoNoValido");

        assertThrows(Throwable.class, ()-> new Estudiante("Camila", "Alzate Rios", "109453264", "cami", "315635674",(byte)18));        
        
        LOG.info("Finalizando test correoNoValido");
    }
    
    
}
