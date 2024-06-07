package map.ordenacaoNosMap;

public class Evento {
    private String nomeEvento;
    private String nomeAtracao;

    public Evento(String nomeEvento,String nomeAtracao){
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
    }

    public String getNomeEvento(){
        return nomeEvento;
    }

    public String getNomeAtracao(){
        return nomeAtracao;
    }

    @Override
    public String toString() {
        return "Eventos: {" +
        "\nEvento: " + nomeEvento +
        "\nAtração: "+ nomeAtracao + "\n}";
    }
}
