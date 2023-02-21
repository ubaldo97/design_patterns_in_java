package creacionales.factory;

public class PrecioEUR implements PrecioService{

    @Override
    public double getPrecio(double cantidad) {
        return cantidad*19.71;
    }
}
