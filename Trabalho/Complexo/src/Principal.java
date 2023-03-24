public class Principal {
    
    public static void main(String[] args) {
        Complexo c1 = new Complexo(3, 4, 5, -2);
        Complexo c2 = new Complexo(-2, 7, 1, 3);
        Complexo c3 = new Complexo(0, 0, 0, 0);

        System.out.println("Soma do numero complexo c1: " + c1.somaComplexo());
        System.out.println("Soma do numero complexo c2: " + c2.somaComplexo());
        System.out.println("Soma do numero complexo c3: " + c3.somaComplexo());
    }
}
