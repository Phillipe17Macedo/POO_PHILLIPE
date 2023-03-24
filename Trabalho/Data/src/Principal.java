public class Principal {
    
    public static void main(String[] args) {
        
        //PRIMEIRO OBJETO 
        Data certo = new Data();
        certo.dia = 31;
        certo.mes = 03;
        certo.ano = 2023;
        
        //SEGUNDO OBJETO
        Data errado = new Data();
        errado.dia = 21;
        errado.mes = 05;
        errado.ano = 2023;
        
        //TERCEIRO OBJETO
        Data niver = new Data();
        niver.dia = 17;
        niver.mes = 9;
        niver.ano = 2002;
        
        //METODO DE IMPRIMIR AS INFORMAÇÕES DAS CLASSES
        System.out.println("\nA Data Completa e " + certo.mostrarInfo() + certo.proximoDia());
        System.out.println("\nA Data Completa e " + errado.mostrarInfo() + errado.proximoDia());
        System.out.println("\nA Data Completa e " + niver.mostrarInfo() + niver.proximoDia());
        
    }
}
