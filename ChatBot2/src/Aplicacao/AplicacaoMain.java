package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Interfaces.Mensalidade;
import Serviços.MensalidadeIntegral;
import Serviços.MensalidadeMeioPeriodo;

public class AplicacaoMain {

	public static void main(String[] args) {

		Scanner imput = new Scanner(System.in);
		List<Aluno> alunos = new ArrayList<Aluno>();
		MensalidadeIntegral mensalidadeIntegral = new MensalidadeIntegral();
		MensalidadeMeioPeriodo mensalidadeMeioPeriodo = new MensalidadeMeioPeriodo();

		Aluno aluno1 = new Aluno("João", 20, 123, 50, "Nada Consta");
		
		Disciplina disciplinas = new Disciplina();

		int quantDisciplinas = 3;

		for (int pos = 1; pos <= quantDisciplinas; pos++) {
			System.out.println("Disciplina " + pos);
		   imput.nextLine();

			String nomeDisciplina = imput.nextLine();
			System.out.println("Nota da Disciplina " + pos);
			double notaDisciplina = imput.nextDouble();

			Disciplina disciplina = new Disciplina();
			disciplina.setNomeDisciplina(nomeDisciplina);
			disciplina.setNotaDisciplina(notaDisciplina);

			aluno1.getDisciplinas().add(disciplina);

		}

		System.out.println("Digite:");
		System.out.println("1 Para Disciplinas");
		System.out.println("2 Para RU");
		System.out.println("3 Para Bibliotéca");
		System.out.println("4 Para Pagar Mensalidade");

		int escolha = imput.nextInt();

		switch (escolha) {

		case 1:

			System.out.println("Digite:");
			System.out.println("1 Para Disciplinas e Notas");
			System.out.println("2 Para Situação do Semestre");

			int escolha1 = imput.nextInt();

			if (escolha1 == 1) {
									
				System.out.println("Disciplinas:" + aluno1.disciplinas);
				
			}  else if (escolha == 2) {
				System.out.println("Média das notas:" + aluno1.mediaNota());
				System.out.println("Aluno aprovado?" + aluno1.aprovado());
			}

			break;

		case 2:
			System.out.println("Créditos RU:" + aluno1.getCreditos_RU());
			break;

		case 3:
			System.out.println("Sua situação na bibliotéca é: " + aluno1.getSituacaoBiblioteca());
			break;

		case 4:
			System.out.println("Digite : I Para Integral ou M Para Meio Período");
			String escolhaHorario = imput.nextLine();

			//aluno1.setIntegral(escolhaHorario);

			if (escolhaHorario == "I") {
				aluno1.setMensalidade(mensalidadeIntegral);
				aluno1.cobrarValor();
				System.out.println(" Mensaildade integral cobrada.");
			} else if(escolhaHorario == "M") {

				aluno1.setMensalidade(mensalidadeMeioPeriodo);
				aluno1.cobrarValor();
				System.out.println("Meia mensalidade cobrada.");

			}

			break;
		default:
			System.out.println("Opção invalida, tente novamente.");
			escolha = imput.nextInt();
		}

		imput.close();

	}

}
