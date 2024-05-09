public class Usuario {
    
    public static void main(String[] args){
        SmartTV smartTV = new SmartTV();

        System.out.println("Tv liga? " + smartTV.ligada);
        System.out.println("Canal atual? " + smartTV.canal);
        System.out.println("Volume atual? " + smartTV.volume);
        
        smartTV.estadoTv(true);
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        smartTV.canal(11);
    }
}
