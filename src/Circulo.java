public class Circulo extends Figura{

    private float radio;

    ///region Constructor
    public Circulo(float radio) {
        this.radio = radio;
    }

    public Circulo (){}
    ///endregion

    ///region G y S
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    ///endregion

    @Override
    public float calcularArea() {
        return (this.radio * (float) Math.pow(Math.PI, 2));
    }
}
