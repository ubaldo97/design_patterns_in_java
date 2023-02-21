package creacionales.prototype;

public class Automovil implements Cloneable {
    public String marca;
    public String modelo;
    public int puertas;

    public Automovil(){}

    public Automovil clonar() throws CloneNotSupportedException {
      return (Automovil) this.clone();
    }
}
