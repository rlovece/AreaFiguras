public class Rectangulo extends Figura{
    private float base;

    private float altura;

    ///region Constructor
    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo (){}
    ///endregion

    ///region G y S

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    ///endregion

    @Override
    public float calcularArea() {
        return (this.altura * this.base) ;
    }
}
