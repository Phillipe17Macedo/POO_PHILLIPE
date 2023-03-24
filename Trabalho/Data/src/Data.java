public class Data {
    
        public int dia;
        public int mes;
        public int ano;
        
        
        //GET E SET DO METODO DIA
        public int getdia(){
            
            return dia;
        }
        public void setdia(){
            if(dia <= 1 || dia >= 31){
                dia = 0;
            }
        }
        
        //GET E SET DO METODO MES
        public int getmes(){
            
            return mes;
        }
        public void setmes(){
            if(mes <= 1 || mes >=12){
                mes = 0;
            }
        }
        
        //GET E SET DO METODO ANO
        public int getano(){
            
            return ano;
        }
        public void setano(){
            if(ano <= 2000 || ano >= 2025){
                ano = 0;
            }
        }
        
        
        //METODO DE MOSTRAR O DIA SEGUINTE
        public String proximoDia(){
            
            if(dia >=1 && dia <31){
               dia++;
            }else if(dia == 31 || dia > 31){
                dia = 01;
            }
            String proxDia = 
                    "\nProx Dia: " + dia;          
            return proxDia;
        }
        
        //METODO DE MOSTRAR INFORMAÇÕES DA CLASSE
        public String mostrarInfo(){
            String infos =
                    "\n" + dia +
                    "/" + mes +
                    "/" + ano ;
            return infos;
        }
        
}
