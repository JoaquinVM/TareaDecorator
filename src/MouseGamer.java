public class MouseGamer extends Decorator {

    private int precio;

    public MouseGamer(IComputadora component) {
        super(component);
        precio = 15;
    }

    @Override
    public int getPrecio(){
        System.out.println("Sumando precio de Mouse Gamer (+" + this.precio + ")");
        return super.getPrecio() + this.precio;
    }
}
