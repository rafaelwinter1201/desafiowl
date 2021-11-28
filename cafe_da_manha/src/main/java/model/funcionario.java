package model;

import dao.FuncionarioDAO;

public class funcionario {
	private String cpf;
	private String nome;
	private String item;
	
	public funcionario(){
		
	}
	public funcionario (String cpf,String nome,String item) {
		this.cpf = cpf;
		this.nome = nome;
		this.item = item;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	
	public void salvar() {
		new FuncionarioDAO().cadastraFuncionario(this);
	}
	
}
