import Domain.Cursos;

import java.time.LocalDate;

import Domain.Bootcamp;
import Domain.Devs;
import Domain.Mentorias;

public class main {

    public static void main(String[] args) {

        main print = new main();
        Cursos curso1 = new Cursos();

        curso1.setTitulo("ED");
        curso1.setCargaHoraria(8);
        curso1.setDescricao("Básico ao avançado em estruturas de dados");

        Cursos curso2 = new Cursos();

        curso2.setTitulo("Java");
        curso2.setCargaHoraria(16);
        curso2.setDescricao("Básico ao avançado na linguagem de programação Java");

        Mentorias mentoria1 = new Mentorias();

        mentoria1.setData(LocalDate.now());
        mentoria1.setDescricao("Live 2");
        mentoria1.setTitulo("Entendendo a linguagem orientada a objeto");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Maratona de estudo para se tornar um dev Java!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Devs devCamila = new Devs();
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.setNome("Camila");

        Devs devPedro = new Devs();
        devPedro.inscreverBootcamp(bootcamp);
        devPedro.setNome("Pedro");

        print.impressora(2, devPedro);
        print.impressora(2, devCamila);

        devCamila.progredir();
        devCamila.progredir();
        devPedro.progredir();

        print.impressora(0, devPedro);

        print.impressora(1, devCamila);
        System.out.println("XP Camila: " + devCamila.calcularTotalXP());

        print.impressora(1, devPedro);
        System.out.println("XP Pedro: " + devPedro.calcularTotalXP());

    }

    public void impressora(int i, Devs dev) {

        if (i == 1) {

            System.out.println("********************************************************");
            System.out.println("Conteudos Concluidos" + dev.getNome() + ": \n" + dev.getConteudosConcluidos() + "\n");

        } else if (i == 2) {

            System.out.println("********************************************************");
            System.out.println("Conteudos Inscritos" + dev.getNome() + ": \n" + dev.getConteudosInscritos() + "\n");

        } else {
            System.out.println("********************************************************");
            System.out.println();
            System.out.println("------------------");
            System.out.println("*após progressão*");
            System.out.println("------------------");
            System.out.println();
        }

    }
}
