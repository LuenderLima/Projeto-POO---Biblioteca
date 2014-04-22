package br.ufpb.dce.poo.projetopack;

public class Aluno extends Usuario {
	
	public Aluno(String nome, String matricula, String cpf, String curso, String periodoIngresso){
		super(nome, matricula, cpf);
		this.curso = curso;
		this.periodoIngresso = periodoIngresso;
	}

	public int getQuantDiasEmprestimo() {
		return Configuracao.getInstance().getDiasEmprestimoAluno();
	}
	
}
