import java.time.LocalDate;

import br_com_dio_desafio.br_com_dio_desafio_dominio.Bootcamp;
import br_com_dio_desafio.br_com_dio_desafio_dominio.Conteudo;
import br_com_dio_desafio.br_com_dio_desafio_dominio.Curso;
import br_com_dio_desafio.br_com_dio_desafio_dominio.Dev;
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

       Mentoria mentoria1 = new Mentoria();
       mentoria1.setTitulo("mentoria de java");
       mentoria1.setDescricao("descrtição mentoria de java");
       mentoria1.setData(LocalDate.now());
     

       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp Java Developer");
       bootcamp.setDescricao("Descrição Bootcamp Java Developer");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria1);

       Dev devTaina = new Dev();
       devTaina.setNome("Tainá");
       devTaina.inscreverBootcamp(bootcamp);
       System.out.println("Conteudo Inscritos Tainá: "+ devTaina.getConteudosInscritos());
       devTaina.progredir();
       devTaina.progredir();
       System.out.println("-------");
       System.out.println("Conteudo Inscritos Tainá: "+ devTaina.getConteudosInscritos());
       System.out.println("Conteudo Concluídos"+ devTaina.getConteudosConcluidos());
       System.out.println("XP: "+ devTaina.calcularTotalXp());

       System.out.println("\n\n");

       Dev devPedro = new Dev();
       devPedro.setNome("Pedro");
       devPedro.inscreverBootcamp(bootcamp);
       System.out.println("Conteudo Inscritos Pedro: "+ devPedro.getConteudosInscritos());
       devPedro.progredir();
       devPedro.progredir();
       devPedro.progredir();
       System.out.println("-------");
       System.out.println("Conteudo Inscritos Pedro: "+ devPedro.getConteudosInscritos());
       System.out.println("Conteudo Concluídos Pedro: "+ devPedro.getConteudosConcluidos());
       System.out.println("XP: " + devPedro.calcularTotalXp());



       


    }
}
