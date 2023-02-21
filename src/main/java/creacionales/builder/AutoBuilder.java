package creacionales.builder;

public class AutoBuilder {
    Automovil auto;

    public AutoBuilder(String marca) {
        auto = new Automovil();
        auto.marca = marca;
    }

    public AutoBuilder setPuertas(int puertas){
        auto.puertas = puertas;
        return this;
    }

    public AutoBuilder setMotor(String motor){
        auto.motor = motor;
        return this;
    }

    public Automovil build(){
        return this.auto;
    }
}
