public class TarjetaVideoGamer extends Decorator {

    private int precio;

    public TarjetaVideoGamer(IComputadora component) {
        super(component);
        precio = 25;
    }

    @Override
    public int getPrecio(){
        System.out.println("Sumando precio de Tarjeta de Video Gamer (+" + this.precio + ")");
        return super.getPrecio() + this.precio;
    }
}
