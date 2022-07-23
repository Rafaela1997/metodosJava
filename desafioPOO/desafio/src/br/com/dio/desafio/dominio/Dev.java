package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String nome;
	private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();;

	void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudoInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
		
	}
	void progredir() {
		Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudoInscritos.remove(conteudo.get());
		}else {
			System.err.println("Você não esta matriculado");
		}
			
	}
	private void calcularTotalXp() {
		this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp())
		.sum();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Conteudo> getConteudoInscritos() {
		return conteudoInscritos;
	}
	public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
		this.conteudoInscritos = conteudoInscritos;
	}
	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}
	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
	@Override
	public int hashCode() {
		return Objects.hash(conteudoInscritos, conteudosConcluidos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev dev = (Dev) obj;
		return Objects.equals(conteudoInscritos, dev.conteudoInscritos)
				&& Objects.equals(conteudosConcluidos, dev.conteudosConcluidos) && Objects.equals(nome, dev.nome);
	}
	
	
	
	
}
