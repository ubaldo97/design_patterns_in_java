package creacionales.factory;

public class PrecioFactory {

    private PrecioService precioService;

    private PrecioFactory() {}

    public PrecioFactory(String pais){
        if(pais.equalsIgnoreCase("EUR")){
            System.out.println("EUR -> MXN");
            this.precioService = new PrecioEUR();
        }else{
            System.out.println("USD -> MXN");
            this.precioService = new PrecioUSD();
        }
    }

    public double getPrecio(double cantidad){
        return precioService.getPrecio(cantidad);
    }
}
