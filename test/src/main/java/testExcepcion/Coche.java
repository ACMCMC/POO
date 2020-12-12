package testExcepcion;

import java.util.HashSet;
import java.util.Set;

public class Coche extends Vehiculo {
    int velocidadMaxima;
    Set<String> equipaje;

    Coche(int velocidadMaxima, String marca) {
        this.setVelocidadMaxima(velocidadMaxima);
        this.equipaje = new HashSet<>(); // El conjunto de equipaje empieza vacío
        this.marca = marca;
    }

    public void addPiezaEquipaje(String pieza) {
        this.equipaje.add(pieza);
    }

    public void imprimirEquipaje() {
        for (String pieza : this.equipaje) {
            System.out.println(pieza);
        }
    }

    public int obtenerVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}
