package creacionales.singleton;

public class Main {
    public static void main(String[] args){
        Singleton sing = Singleton.getInstance();
        sing.setContador(10);
        System.out.println(sing.getContador());
        System.out.println(sing);

        Singleton sing2 = Singleton.getInstance();
        sing2.setContador(20);
        System.out.println(sing2.getContador());
        System.out.println(sing2);

    }
}
