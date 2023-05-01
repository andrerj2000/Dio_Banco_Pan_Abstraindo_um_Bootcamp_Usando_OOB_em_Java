import br.com.bancopandio.BootCamp;
import br.com.bancopandio.Curso;
import br.com.bancopandio.Dev;
import br.com.bancopandio.Mentoria;

import java.time.LocalDate;

public class AppBancoPanOobJava {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso1.setTitulo("Desenvolvimento Java");
        curso1.setDescricao("Curso basico de desenvolvimento Java.");
        curso1.setCargaHoraria(10);

       // System.out.println(curso1.toString());


        curso2.setTitulo("Desenvolvimento C#");
        curso2.setDescricao("Curso basico de desenvolvimento C#.");
        curso2.setCargaHoraria(5);

       // System.out.println(curso2.toString());

        mentoria.setTitulo("Mentoria Java.");
        mentoria.setDescricao("Suporte nas duvidas dos alunos e colaboradores do curso.");
        mentoria.setData(LocalDate.now());

        //System.out.println(mentoria.toString());

        BootCamp bootCamp = new BootCamp();

        bootCamp.setNome("Desenvolviemnto Java");
        bootCamp.setDescricao("Descrição curso Java");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devAndre = new Dev();
        devAndre.setNome("Andre luis Pereira");
        devAndre.inscreverBootCamp(bootCamp);

        devAndre.progredir();
        devAndre.progredir();
        devAndre.progredir();
        //devAndre.getConteudosConcluidos().add(curso2);
        System.out.println("Conteudos Inscritos " + devAndre.getNome()+ ": " + devAndre.getConteudosInscritos());
        System.out.println("Conteudos Concluido " + devAndre.getNome()+ ": " + devAndre.getConteudosConcluidos());




    }
}
