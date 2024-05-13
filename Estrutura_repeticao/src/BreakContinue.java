public class BreakContinue {
    public static void main(String[] args) {
	//Break significa quebrar, parar, frear, interromper.
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            
            System.out.println(numero);
            
        }
        //Qual a saída no console ?
    
        //Continue, como o nome diz, ele 'continua' o laço. 
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;
            
            System.out.println(numero);
            
        }
    }      
}
