package br_com_dio_desafio.br_com_dio_desafio_dominio;

public class Curso extends Conteudo{
   
    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }
    
    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public String toString() {
        return "Curso{ " +
        "Titulo= " + getTitulo() +
        "\nDescrição= " + getDescricao() +
        "\nCarga Horaria= " + cargaHoraria + "}";
    }

    
}
