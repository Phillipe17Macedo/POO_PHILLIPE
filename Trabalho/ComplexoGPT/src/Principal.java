public class Principal {
    public static void main(String[] args) {
        Complexo c1 = new Complexo(3, 5, 2, 1);
        System.out.println("Soma do primeiro número complexo: " + c1.somaComplexo());

        Complexo c2 = new Complexo(4, 8, 6, 3);
        System.out.println("Soma do segundo número complexo: " + c2.somaComplexo());

        Complexo c3 = new Complexo(2, 3, 5, 7);
        System.out.println("Soma do terceiro número complexo: " + c3.somaComplexo());
    }
}
