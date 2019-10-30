public class TecladoGamer extends Decorator {

    private int precio;

    public TecladoGamer(IComputadora component) {
        super(component);
        this.precio = 10;
    }

    @Override
    public int getPrecio(){
        System.out.println("Sumando precio de Teclado Gamer (+" + this.precio + ")");
       return super.getPrecio() + this.precio;
    }
}
