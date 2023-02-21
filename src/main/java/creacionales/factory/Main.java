package creacionales.factory;

public class Main {
    public static void main(String[] args) {
        PrecioFactory precio = new PrecioFactory("eur");
        System.out.println(precio.getPrecio(100));

        PrecioFactory precio2 = new PrecioFactory("USA");
        System.out.println(precio2.getPrecio(100));
    }
}
