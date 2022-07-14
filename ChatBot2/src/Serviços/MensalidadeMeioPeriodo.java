package Serviços;

import Aplicacao.Aluno;
import Interfaces.Mensalidade;

public class MensalidadeMeioPeriodo extends Aluno implements Mensalidade {

	@Override
	public void cobrarValor(double valor) {

		valor = valor / 2;

	}

}
