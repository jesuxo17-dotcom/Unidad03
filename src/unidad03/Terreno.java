package unidad03;

public class Terreno {
    // Atributos
    private int numLote;
    private float ancho;
    private float largo;

    // Constructores
    public Terreno() {
        this.numLote = 0;
        this.ancho = 0.0f;
        this.largo = 0.0f;
    }

    public Terreno(int numLote, float ancho, float largo) {
        this.numLote = numLote;
        this.ancho = ancho;
        this.largo = largo;
    }

    // Get y Set
    public int getNumLote() { return numLote; }
    public void setNumLote(int numLote) { this.numLote = numLote; }

    public float getAncho() { return ancho; }
    public void setAncho(float ancho) { this.ancho = ancho; }

    public float getLargo() { return largo; }
    public void setLargo(float largo) { this.largo = largo; }

    // Calculos
    public float calcularPerimetro() { return 2 * (ancho + largo); }
    public float calcularArea() { return ancho * largo; }
}