public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void estadoTv(boolean ligada){
       System.out.println("A tv está ligada? " + ligada);
    }

    public void canal(int canal){
        System.out.println("Canal atual: " + canal);
    }

    /*public void aumentarVolume(int volume){
        int aumentar = this.volume  + volume;
        System.out.println("Volume atual: " +  aumentar);
    }

    public void diminuirVolume(int volume){
        int diminuir = this.volume - volume;
        System.out.println("Volume atual: " +  diminuir);

    }*/

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume atual: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume atual: " + volume);
    }


   
}
