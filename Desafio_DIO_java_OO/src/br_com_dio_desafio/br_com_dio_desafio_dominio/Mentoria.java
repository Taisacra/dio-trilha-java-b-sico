package br_com_dio_desafio.br_com_dio_desafio_dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    
    private LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate Data) {
        this.data = Data;
    }
    
    @Override
    public String toString() {
        return "Mentoria{ " +
        "Titulo= " + getTitulo() +
        "\nDescrição= " + getDescricao() +
        "\nCarga Horaria= " + data + "}";
    }
}
