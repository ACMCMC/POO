package testExcepcion;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Coche coche1 = new Coche(120, "Seat");
        String piezaEquipaje = "Maleta";
        coche1.addPiezaEquipaje(piezaEquipaje);
        coche1.addPiezaEquipaje("Gafas");
        coche1.imprimirEquipaje();

        String marcaCoche1 = coche1.getMarca();
        System.out.println(marcaCoche1);

        Moto moto1 = new Moto(false, "Hyunday");
        moto1.imprimirDerrape();
    }
}
