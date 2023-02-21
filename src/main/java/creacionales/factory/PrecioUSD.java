package creacionales.factory;

public class PrecioUSD implements PrecioService {

    @Override
    public double getPrecio(double cantidad) {
        return cantidad * 18.48;
    }
}
