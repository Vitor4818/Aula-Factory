import factory.Poligono;
import factory.PoligonoFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println(PoligonoFactory.getPoligono(0));
        System.out.println(PoligonoFactory.getPoligono(3));
    }
}
