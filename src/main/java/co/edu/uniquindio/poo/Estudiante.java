package co.edu.uniquindio.poo;

public record Estudiante(String nombres, String apellidos, String numeroIdentificacion, String correo, String telefono, byte edad) {

    public Estudiante{
        assert nombres !=null && !nombres.isBlank();
        assert apellidos !=null && !apellidos.isBlank();
        assert numeroIdentificacion !=null && !numeroIdentificacion.isBlank();
        assert correo !=null && correo.isBlank() && correo.contains("@");
        assert telefono !=null && telefono.isBlank();
        assert edad >0;
        

    }
    
}
