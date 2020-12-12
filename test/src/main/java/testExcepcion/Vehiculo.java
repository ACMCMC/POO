package testExcepcion;

public abstract class Vehiculo {
    String marca;

    abstract int obtenerVelocidadMaxima();

    public String getMarca() {
        return this.marca;
    }
}
