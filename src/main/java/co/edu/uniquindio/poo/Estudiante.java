package co.edu.uniquindio.poo;

public record Estudiante(String nombres, String apellidos, String numeroIdentificacion, String correo, String telefono, byte edad) {

    public Estudiante{
        assert nombres !=null && !nombres.isBlank():"El nombre del estudiante no puede ser nulo";
        assert apellidos !=null && !apellidos.isBlank(): "El apellido del estudiante no puede ser nulo";
        assert numeroIdentificacion !=null && !numeroIdentificacion.isBlank(): "El número de identificación del estudiante no puede ser nulo";
        assert correo !=null && !correo.isBlank() && correo.contains("@"): "El correo del estudiante no puede ser nulo";
        assert telefono !=null && !telefono.isBlank():"El teléfono del estudiante no puede ser nulo";
        assert edad >0;
    }
    
}


