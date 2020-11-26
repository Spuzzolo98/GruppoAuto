
package classi;

public class Automobile {  
    private String marca, modello;
    private float costo;
    private int releasedate;
    
    public void Automobile(String Marca, String Modello, float Costo, int Releasedate){
        this.marca = Marca;
        this.modello = Modello;
        this.costo = Costo;
        this.releasedate = Releasedate;      
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(int releasedate) {
        this.releasedate = releasedate;
    }
    
}
