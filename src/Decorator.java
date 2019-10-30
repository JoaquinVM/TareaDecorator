public class Decorator implements IComputadora {

    private IComputadora component;

    public Decorator(IComputadora component){
        this.component = component;
    }

    @Override
    public int getPrecio() {
        return  component.getPrecio();
    }
}
