import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		
		Curso java = new Curso();
		java.setTitulo("Curso Java");
		java.setDescricao("Java Orientado a Objeto");
		java.setCargaHoraria(16);
		
		Curso logica = new Curso();
		logica.setTitulo("Curso L�gica de Programa��o");
		logica.setDescricao("Aula pr�tica de l�gica de programa��o");
		logica.setCargaHoraria(16);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Como me Tornar um Programador?");
		mentoria.setDescricao("Informa��es b�sica de como iniciar na programa��o");
		mentoria.setData(LocalDate.now());
		
	
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
        bootcamp.getConteudos().add(java);
        bootcamp.getConteudos().add(logica);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conte�dos Inscritos Camila:" + devCamila.getConteudoInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conte�dos Inscritos Camila:" + devCamila.getConteudoInscritos());
        System.out.println("Conte�dos Conclu�dos Camila:" + devCamila.getConteudoConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalxp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conte�dos Inscritos Jo�o:" + devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conte�dos Inscritos Jo�o:" + devJoao.getConteudoInscritos());
        System.out.println("Conte�dos Concluidos Jo�o:" + devJoao.getConteudoConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalxp());

	
	
	}
}


	
	