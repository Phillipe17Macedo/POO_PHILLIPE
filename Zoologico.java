import java.util.ArrayList;

public class Zoologico {
    public static void main(String[] args) {
        Principal zoo = new Principal();

        // Adicionando animais
        zoo.getMamiferos().add("\nLeão");
        zoo.getMamiferos().add("Elefante");
        zoo.getMamiferos().add("Girafa");
        zoo.getMamiferos().add("Macaco");
        zoo.getMamiferos().add("Urso");
        zoo.getPeixes().add("Tubarão");
        zoo.getPeixes().add("Baleia");
        zoo.getPeixes().add("Peixe-palhaço");
        zoo.getPeixes().add("Atum");
        zoo.getPeixes().add("Sardinha");
        zoo.getAves().add("Águia");
        zoo.getAves().add("Pombo");
        zoo.getAves().add("Pato");
        zoo.getAves().add("Galinha");
        zoo.getAves().add("Falcão");

        // Verificando quantidade total de animais
        int totalAnimais = zoo.getMamiferos().size() + zoo.getPeixes().size() + zoo.getAves().size();
        System.out.println("O zoológico possui " + totalAnimais + " animais.");

        // Listando todos os animais do zoológico
        System.out.println("\n--- PRIMEIRA APRESENTACAO ---");
        System.out.println(" -- Mamiferos --");
        for (int i = 0; i < zoo.getMamiferos().size(); i++) {
            System.out.println(zoo.getMamiferos().get(i));
            System.out.println("**************************");
        }
        System.out.println("\n -- Peixes --");
        
        for (int i = 0; i < zoo.getPeixes().size(); i++) {
            System.out.println("**************************");
            System.out.println(zoo.getPeixes().get(i));
        }
        System.out.println("\n -- Aves --");
        
        for (int i = 0; i < zoo.getAves().size(); i++) {
            System.out.println("**************************");
            System.out.println(zoo.getAves().get(i));
        }

        // Excluindo duas aves do zoológico
        zoo.getAves().remove("Pombo");
        zoo.getAves().remove("Falcão");

        
        //Listando os Animais novamente após a alteração
        System.out.println("\n--- SEGUNDA APRESENTACAO ---");
        System.out.println(" -- Mamiferos --");
        for (int i = 0; i < zoo.getMamiferos().size(); i++) {
            System.out.println(zoo.getMamiferos().get(i));
            System.out.println("**************************");
        }
        System.out.println("\n -- Peixes --");
        
        for (int i = 0; i < zoo.getPeixes().size(); i++) {
            System.out.println("**************************");
            System.out.println(zoo.getPeixes().get(i));
        }
        System.out.println("\n -- Aves --");
        
        for (int i = 0; i < zoo.getAves().size(); i++) {
            System.out.println("**************************");
            System.out.println(zoo.getAves().get(i));
        }
        int totalAnimaisfin = zoo.getMamiferos().size() + zoo.getPeixes().size() + zoo.getAves().size();
        System.out.println("\nApos a alteracao no numero de animais");
        System.out.println("O zoológico possui " + totalAnimaisfin + " animais.");
    }
}
