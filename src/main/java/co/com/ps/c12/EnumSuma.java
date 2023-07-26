package co.com.ps.c12;

public enum EnumSuma {
    MENSAJE(mensaje: "El resultado de la suma es: ");
    private final String mensaje;

    EnumSuma(String mensaje){
        this.mensaje=mensaje;

    }

    public String getMensaje() {

        return mensaje;
    }
}
