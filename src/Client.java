public class Client {
    public static void main(String[] args){
        IComputadora computadora = new Computadora();
        computadora = new TecladoGamer(computadora);
        computadora = new MouseGamer(computadora);
        computadora = new TarjetaVideoGamer(computadora);
        computadora = new MonitorSamsung(computadora);

        System.out.println("Precio computadora: " + computadora.getPrecio());

        IComputadora computadora2 = new Computadora();
        computadora2 = new TarjetaVideoGamer(computadora2);
        computadora2 = new MonitorSamsung(computadora2);

        System.out.println("Precio computadora2: " + computadora2.getPrecio());
    }
}
