package controles.funcionarios;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.persistencia.DAOFuncionario;
import modelos.pessoal.Funcionario;

/**
 * Servlet implementation class ControleAlterarFuncionario
 */
@WebServlet("/funcionario.alterar")
public class ControleAlterarFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleAlterarFuncionario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher despacho = null;

		try {
			DAOFuncionario daoFuncionario = new DAOFuncionario();
			Funcionario funcionario = new Funcionario();
			
			funcionario.setId(Integer.parseInt(request.getParameter("txtId")));
			funcionario.setMatricula(request.getParameter("txtMatricula"));
			funcionario.setNome(request.getParameter("txtNome"));
			funcionario.setSalarioBruto(Double.parseDouble(request.getParameter("txtSalarioBruto")));
			funcionario.getSalarioLiquido();
			
			daoFuncionario.incluir(funcionario);

			despacho = request.getRequestDispatcher("sucesso.jsp");

		} catch (Exception e) {

			despacho = request.getRequestDispatcher("erro.jsp");

		} finally {
			despacho.forward(request, response);
		}
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
