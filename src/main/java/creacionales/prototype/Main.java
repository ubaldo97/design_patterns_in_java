package creacionales.prototype;

public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil();
        auto.puertas=2;
        auto.marca = "BMW";
        auto.modelo = "Coupe";

        System.out.println("El es: "+auto.marca + " "+ auto.modelo+" puertas: "+auto.puertas);
        Automovil clon = auto.clonar();
        clon.puertas = 3;
        System.out.println("El prototipo es : " + clon.marca + " "+ clon.modelo + " puertas: "+ clon.puertas);
    }
}
