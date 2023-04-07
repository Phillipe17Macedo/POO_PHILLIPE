import java.util.ArrayList;

public class Principal {
    private ArrayList<String> mamiferos;
    private ArrayList<String> peixes;
    private ArrayList<String> aves;

    public Principal() {
        this.mamiferos = new ArrayList<>();
        this.peixes = new ArrayList<>();
        this.aves = new ArrayList<>();
    }

    public ArrayList<String> getMamiferos() {
        return this.mamiferos;
    }

    public void setMamiferos(ArrayList<String> mamiferos) {
        this.mamiferos = mamiferos;
    }

    public ArrayList<String> getPeixes() {
        return this.peixes;
    }

    public void setPeixes(ArrayList<String> peixes) {
        this.peixes = peixes;
    }

    public ArrayList<String> getAves() {
        return this.aves;
    }

    public void setAves(ArrayList<String> aves) {
        this.aves = aves;
    }
}
