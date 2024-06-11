import java.time.LocalDate;

import br_com_dio_desafio.br_com_dio_desafio_dominio.Curso;
import br_com_dio_desafio.br_com_dio_desafio_dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
       Curso curso1 = new Curso();
       curso1.setTitulo("java");
       curso1.setDescricao("Descrição curso java");
       curso1.setCargaHoraria(59);

       Curso curso2 = new Curso();
       curso2.setTitulo("javaScript");
       curso2.setDescricao("Descrição curso js");
       curso2.setCargaHoraria(100);

       System.out.println(curso1);
       System.out.println(curso2);

       Mentoria mentoria1 = new Mentoria();
       mentoria1.setTitulo("mentoria de java");
       mentoria1.setDescricao("descrtição mentoria de java");
       mentoria1.setData(LocalDate.now());
       System.out.println(mentoria1);
       

    }
}
