public class ExemploFor {
    public static void main(String[] args) throws Exception {
        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
       }
       
       //estrutura 2
       //o que importa é somente o bloco condicional
       int carneirinhos = 1;
       for( ; carneirinhos <=20; ) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
            carneirinhos ++;
       }
    }
}