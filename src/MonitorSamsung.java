public class MonitorSamsung extends Decorator {

    private int precio;

    public MonitorSamsung(IComputadora component) {
        super(component);
        this.precio = 50;
    }

    @Override
    public int getPrecio(){
        System.out.println("Sumando precio de Monitor Samsung (+" + this.precio + ")");
        return super.getPrecio() + this.precio;
    }
}
