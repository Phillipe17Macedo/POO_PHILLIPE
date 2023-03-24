public class Fatura {
   
    public int numeroItem;
    public String descricao;
    public int quantidadeComprada;
    public double valorUnitario;
    public double total;
    

    //GET E SET DO NUMERO ITEM
    public int getNumeroitem(){
        
        return numeroItem;
    }
    public void setNumeroitem(){
   
    }
    
    //GET E SET DA DESCRIÇÃO
    public String getDescricao(){
        System.out.println("\n-->> Descricao do Item: " 
        + descricao + "\n-->> Numero do Item: " + numeroItem);
        return descricao;
    }
    public void setDescricao(){
        
    }
    
    //GET E SET DA QUANTIDADE COMPRADA
    public int getQuantidadeComprada(){
        if(quantidadeComprada < 0){
            quantidadeComprada = 0;
        }
        return quantidadeComprada;
    }
    public void setQuantidadeComprada(){
       
    }
    
    //GET E SET DO VALOR UNITARIO
    public double getValorUnitario(){
        
        return valorUnitario;
    }
    public void setValorUnitario(){
         if(valorUnitario != 5.00){
             valorUnitario = 5.00;
         }
    }
    public double valorFatura(){
        total = (valorUnitario*quantidadeComprada);
        return total;
    }
    public String mostraInfo(){
        String informacoes =
                "\n* Numero do Item: " + numeroItem +
                "\n* Descricao: " + descricao +
                "\n* Qtd Comprada: " + quantidadeComprada +
                "\n* Valor Un.: " + valorUnitario;
        
        return informacoes;
    }
      
}
