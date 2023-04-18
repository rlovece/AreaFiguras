public class Main {
    public static void main(String[] args) {

        Circulo c1 = new Circulo();
        Rectangulo r1 = new Rectangulo();

        float radio = Consola.leerFloat("Ingrese el radio del circulo");
        c1.setRadio(radio);
        Consola.escribir("Su circulo tiene Area = " + c1.calcularArea());

        float base = Consola.leerFloat("Ingrese base del rectangulo");
        r1.setBase(base);
        float altura = Consola.leerFloat("Ingrese altura del rectangulo");
        r1.setAltura(altura);
        Consola.escribir("Su rectangulo tiene Area = " + r1.calcularArea());

    }
}