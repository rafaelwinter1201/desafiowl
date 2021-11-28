package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.funcionario;


@WebServlet("/cadastraFuncionario")
public class cadastraFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public cadastraFuncionario() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset-UTF-8");
		
	}
	
	
	String item;
	String nome;
	String cpf;
	String mensagem;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String item = request.getParameter("item");
		
		if(nome != null && cpf != null && item != null) {
			String mensagem = "<div class=\"alert alert-success\" role=\"alert\">\r\n"
					+ "  Cadastrado com sucesso!\r\n"
					+ "</div>";
			request.setAttribute("mensagem", mensagem);
			RequestDispatcher dispatcher = request.getRequestDispatcher("cadastra-funcionario.jsp");
			dispatcher.forward(request, response);
			funcionario Funcionario = new funcionario(nome, cpf, item);
			
			Funcionario.salvar();
			
		} else {
			String mensagem ="<div class=\"alert alert-danger\" role=\"alert\">\r\n"
					+ "  Houve um erro no cadastro, um ou mais campos inválido(s)/vazio(s)\r\n"
					+ "</div>" + cpf;
			request.setAttribute("mensagem", mensagem);
			RequestDispatcher dispatcher = request.getRequestDispatcher("cadastra-funcionario.jsp");
			dispatcher.forward(request, response);
			
		}
	}

}
