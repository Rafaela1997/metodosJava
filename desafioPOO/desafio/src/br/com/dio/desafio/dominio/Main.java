package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo(" Curso: Java");
		curso1.setDescricao("Descrição do curso de Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo(" Curso: JavaScript");
		curso2.setDescricao("Descrição do curso de JavaScript");
		curso2.setCargaHoraria(10);
			
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescricao("descrição da mentoria Java");
		mentoria.setData(LocalDate.now());
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootecamp dev java");
		bootcamp.setDescricao("descrição do bootcamp");
		bootcamp.getConteudos().add(mentoria);
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		
		Dev devRafaela = new Dev();
		
		devRafaela.setNome("Rafaela Sanatana");
		devRafaela.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos" + devRafaela.getConteudoInscritos());
		devRafaela.progredir();
		System.out.println("Conteudos concluidos" + devRafaela.getConteudosConcluidos());

		
		Dev devJose = new Dev();
		devJose.setNome("Jose Silva");
		devJose.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos" + devJose.getConteudoInscritos());
		devJose.progredir();
		System.out.println("Conteudos concluidos" + devRafaela.getConteudosConcluidos());

		
	}
}
