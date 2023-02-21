package creacionales.prototype;

public class Automovil {
    public String marca;
    public String modelo;
    public int puertas;

    public Automovil(){}

    public Automovil clonar(){
        Automovil clon = new Automovil();
        clon.marca = this.marca;
        clon.modelo = this.modelo;
        clon.puertas = this.puertas;
        return clon;
    }
}
