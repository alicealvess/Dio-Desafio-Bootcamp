import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		
		Curso java = new Curso();
		java.setTitulo("Curso Java");
		java.setDescricao("Java Orientado a Objeto");
		java.setCargaHoraria(16);
		
		Curso logica = new Curso();
		logica.setTitulo("Curso Lógica de Programação");
		logica.setDescricao("Aula prática de lógica de programação");
		logica.setCargaHoraria(16);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Como me Tornar um Programador?");
		mentoria.setDescricao("Informações básica de como iniciar na programação");
		mentoria.setData(LocalDate.now());
		
	
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(java);
        bootcamp.getConteudos().add(logica);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudoInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudoConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalxp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudoConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalxp());

	
	
	}
}


	
	