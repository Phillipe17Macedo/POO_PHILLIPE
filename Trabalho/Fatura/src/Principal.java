public class Principal {
    public static void main(String[] args) {
        //Primeira Compra
        Fatura compra_1 = new Fatura();
        compra_1.numeroItem = 1;
        compra_1.descricao = "Doritos";
        compra_1.quantidadeComprada = 2;
        compra_1.valorUnitario = 5.00;
        
        
        //Segunda Compra
        Fatura compra_2 = new Fatura();
        compra_2.numeroItem = 2;
        compra_2.descricao = "Coca-Cola";
        compra_2.quantidadeComprada = 12;
        compra_2.valorUnitario = 3.75;
        
        
        //Terceira Compra
        Fatura compra_3 = new Fatura();
        compra_3.numeroItem = 3;
        compra_3.descricao = "Chocolate";
        compra_3.quantidadeComprada = 3;
        compra_3.valorUnitario = 5.78;
        
        
        
        //Area de Print das Informações 
        System.out.println(compra_1.mostraInfo());
        System.out.println("* Valor Total da Compra: " + compra_1.valorFatura());
        System.out.println(compra_2.mostraInfo());
        System.out.println("* Valor Total da Compra: " + compra_2.valorFatura());
        System.out.println(compra_3.mostraInfo());
        System.out.println("* Valor Total da Compra: " + compra_3.valorFatura());
        
        compra_1.getDescricao();
        compra_2.getDescricao();
        compra_3.getDescricao();
        
    }
    
}
