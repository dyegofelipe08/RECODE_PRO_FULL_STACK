package controles;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelos.Funcionario;

/**
 * Servlet implementation class FuncionarioControle
 */
@WebServlet("/controle.funcionario")
public class FuncionarioControle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FuncionarioControle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Funcionario func = new Funcionario();
		
		func.setNome(request.getParameter("txtNome"));
		func.setMatricula(request.getParameter("txtMatricula"));
		func.setSalario_bruto(Double.parseDouble(request.getParameter("txtSalarioBruto")));
		
		request.setAttribute("objFuncionario", func);
		
		RequestDispatcher despacho = request.getRequestDispatcher("resultado.jsp");
		despacho.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
