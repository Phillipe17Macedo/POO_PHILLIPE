public class Empregado {
    
    public String primeiroNome;
    public String sobrenome;
    public double salarioMensal;
    public double salarioAnual;
    public double ajusteSalario;
    
    
    //GET E SET DO PRIMEIRO NOME DO EMPREGADO
    public String getPrimeiroNome(){
        
        return primeiroNome;
    }
    public void setPrimeiroNome(){
        
    }
    
    //GET E SET DO SOBRENOME
    public String getSobrenome(){
        
        return sobrenome;
    }
    public void setSobrenome(){
        
    }
    
    //GET E SET DO SALARIO MENSAL
    public double getSalarioMensal(){
        
        return salarioMensal;
    }
    public void setSalarioMensal(){
        if(salarioMensal < 1320.00){
            salarioMensal = 1320.00;
        }
    }
        

    
    //MÉTODO DE MOSTRAR AS INFORMAÇÕES DA CLASSE
    public String mostrarInfo(){
        String informacoes =
            "\nNome: " + primeiroNome +
            "\nSobrenome: " + sobrenome +
            "\nSalario Mensal R$:" + salarioMensal;
        
        return informacoes;
    }
    
    //Metodo calcular salario anual do funcionario
    public double calcularsalarioAnual(){
        salarioAnual = (salarioMensal * 12);        
        return salarioAnual;
    }
    //Metodo de Ajustr o salario com o aumento de 10%
    public double ajusteSalario(){
        ajusteSalario = (salarioMensal * 10/100);
        ajusteSalario = salarioMensal + ajusteSalario;
        return ajusteSalario;
    }
    
    
}