package creacionales.builder;

public class Main {
    public static void main(String[] args) {
        //Ejemplo del patrón builder solo con fines educativos
        Automovil auto = new AutoBuilder("Nissan")
                .setPuertas(4)
                .setMotor("Electrico")
                .build();

        System.out.println("La marca es: "+auto.getMarca()+" y el motor es: "+auto.getMotor());
    }
}
