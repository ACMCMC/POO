package testExcepcion;

public class Moto extends Vehiculo {

    boolean puedeDerrapar;

    Moto(boolean puedeDerrapar, String marca) {
        this.puedeDerrapar = puedeDerrapar;
        this.marca = marca;
    }

    public int obtenerVelocidadMaxima() {
        return 80;
    }

    public void imprimirDerrape() {
        if (this.puedeDerrapar) {
            System.out.println("He derrapado");
        } else {
            System.out.println("NO he derrapado");
        }
    }
}
