package Aplicacao;

import java.util.ArrayList;
import java.util.List;

import Interfaces.Mensalidade;

public class Aluno extends Pessoa {
//
	//
	private int matricula;
	protected String integral;
	private double creditos_RU;
	private String situacaoBiblioteca;
	private Mensalidade mensalidade;
	
	List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas(){
		return disciplinas;
	}
	
	public Aluno() {
		
	}

	public Aluno(String nome, int idade, int matricula,  double creditos_RU, String situacaoBiblioteca) {
		super(nome, idade);
		this.matricula = matricula;
		this.integral = integral;
		this.creditos_RU = creditos_RU;
		this.situacaoBiblioteca = situacaoBiblioteca;
	}
	
   public void cobrarValor() {
	   
   }

	public double mediaNota() {
		double somaNotas = 0.0;
		for(Disciplina disc : disciplinas) {
			somaNotas += disc.getNotaDisciplina();
		}
		return somaNotas / disciplinas.size();
	}
	
	public boolean aprovado() {
		double media = this.mediaNota();
		if(media > 7) {
			return true;
		}else {
			return false;
		}
	}
	

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String isIntegral() {
		return integral;
	}

	public void setIntegral(String integral) {
		this.integral = integral;
	}

	public double getCreditos_RU() {
		return creditos_RU;
	}

	public void setCreditos_RU(double creditos_RU) {
		this.creditos_RU = creditos_RU;
	}

	public String getSituacaoBiblioteca() {
		return situacaoBiblioteca;
	}

	public void setSituacaoBiblioteca(String situacaoBiblioteca) {
		this.situacaoBiblioteca = situacaoBiblioteca;
	}

	public Mensalidade getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(Mensalidade mensalidade) {
		this.mensalidade = mensalidade;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", integral=" + integral + ", creditos_RU=" + creditos_RU
				+ ", situacaoBiblioteca=" + situacaoBiblioteca + ", mensalidade=" + mensalidade + ", disciplinas="
				+ disciplinas + "]";
	}

	

	
}
