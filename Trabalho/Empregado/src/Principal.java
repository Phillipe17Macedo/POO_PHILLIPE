public class Principal {
    
    public static void main(String[] args) {
        
        //Funcionario Chefe
        Empregado phillipe = new Empregado();
        phillipe.primeiroNome = "Phillipe";
        phillipe.sobrenome = "Macedo";
        phillipe.salarioMensal = 38700.00;
        
        //funcionario numero 1
        Empregado funcionario_1 = new Empregado();
        funcionario_1.primeiroNome = "Joao Vitor";
        funcionario_1.sobrenome = "Oliveira";
        funcionario_1.salarioMensal = 18900.00;
        
        //Funcionario numero 2
        Empregado funcionario_2 = new Empregado();
        funcionario_2.primeiroNome = "Gabriela";
        funcionario_2.sobrenome = "Oliveira";
        funcionario_2.salarioMensal = 27488.00;
        
        //Area de print na tela as informações dos funcionarios
        
        //Funcionario Chefe
        System.out.println("\n--> Funcionario Chefe <-- " + phillipe.mostrarInfo() 
                + "\nSalario Anual R$:" + phillipe.calcularsalarioAnual() + 
                "\nAumento de Salario com 10%: " + phillipe.ajusteSalario());
        
        //Funcionario Numero 1
        System.out.println("\n--> Funcionario Programador NV4 <--" + funcionario_1.mostrarInfo() + 
                "\nSalario Anual R$:" + funcionario_1.calcularsalarioAnual() + 
                "\nAumento de Salario com 10%: " + funcionario_1.ajusteSalario());
        
        //Funcionario Numero 2
        System.out.println("\n--> Funcionario Gestor Senior <--" + funcionario_2.mostrarInfo() + 
                "\nSalario Anual R$:" + funcionario_2.calcularsalarioAnual() + 
                "\nAumento de Salario com 10%: " + funcionario_2.ajusteSalario());
        
    }
}
 