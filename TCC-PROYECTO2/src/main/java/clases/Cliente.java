package clases;

public class Cliente {
    private String nombre;
    private String identificacion;
    private String medioPago;
    private int saldoDisponible;


    public Cliente() {
    }

    public Cliente(String nombre, String identificacion, String medioPago, int saldoDisponible) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.medioPago = medioPago;
        this.saldoDisponible = saldoDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public int getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
}
