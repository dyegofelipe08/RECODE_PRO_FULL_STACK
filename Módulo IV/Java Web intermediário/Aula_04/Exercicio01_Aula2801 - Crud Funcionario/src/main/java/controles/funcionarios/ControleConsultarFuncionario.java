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
 * Servlet implementation class ControleConsultarFuncionario
 */
@WebServlet("/ControleConsultarFuncionario")
public class ControleConsultarFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleConsultarFuncionario() {
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
			
		
			funcionario.setMatricula(request.getParameter("txtMatricula"));
			daoFuncionario.consultar(funcionario);
			
			request.setAttribute("dadosFuncionario", funcionario);
			despacho = request.getRequestDispatcher("saidaConsulta.jsp");

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
