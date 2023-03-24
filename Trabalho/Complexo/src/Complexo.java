public class Complexo {
    private int numeroReal1;
    private int numeroReal2;
    private int numeroImaginario1;
    private int numeroImaginario2;

    public Complexo(int numeroReal1, int numeroReal2, int numeroImaginario1, int numeroImaginario2) {
        this.numeroReal1 = numeroReal1;
        this.numeroReal2 = numeroReal2;
        this.numeroImaginario1 = numeroImaginario1;
        this.numeroImaginario2 = numeroImaginario2;
    }

    public int getNumeroReal1() {
        return numeroReal1;
    }

    public void setNumeroReal1(int numeroReal1) {
        this.numeroReal1 = numeroReal1;
    }

    public int getNumeroReal2() {
        return numeroReal2;
    }

    public void setNumeroReal2(int numeroReal2) {
        this.numeroReal2 = numeroReal2;
    }

    public int getNumeroImaginario1() {
        return numeroImaginario1;
    }

    public void setNumeroImaginario1(int numeroImaginario1) {
        this.numeroImaginario1 = numeroImaginario1;
    }

    public int getNumeroImaginario2() {
        return numeroImaginario2;
    }

    public void setNumeroImaginario2(int numeroImaginario2) {
        this.numeroImaginario2 = numeroImaginario2;
    }

    public String somaComplexo() {
        int real = this.numeroReal1 + this.numeroReal2;
        int imaginario = this.numeroImaginario1 + this.numeroImaginario2;
        String resultado = real + "+" + imaginario + "i";
        return resultado;
    }
}
