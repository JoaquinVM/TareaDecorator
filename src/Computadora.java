public class Computadora implements IComputadora {

    private int precio;

    public Computadora(){
        this.precio = 100;
    }

    @Override
    public int getPrecio() {
        System.out.println("Sumando precio de Computadora (+" + this.precio + ")");
        return this.precio;
    }
}
