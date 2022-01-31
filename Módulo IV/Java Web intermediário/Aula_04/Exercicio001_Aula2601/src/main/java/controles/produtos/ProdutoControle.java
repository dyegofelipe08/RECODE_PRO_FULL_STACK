package controles.produtos;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.persistencia.DAOProduto;
import modelos.pessoal.Produto;

/**
 * Servlet implementation class ProdutoControle
 */
@WebServlet("/controle.produto")
public class ProdutoControle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdutoControle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			DAOProduto daoProduto = new DAOProduto();
			Produto produto = new Produto();
			produto.setId(Integer.parseInt(request.getParameter("txtId")));
			produto.setCodigo(request.getParameter("txtCodigo"));
			produto.setDescricao(request.getParameter("txtDescricao"));
			
			daoProduto.incluir(produto);
			
			RequestDispatcher despacho = request.getRequestDispatcher("saidaInclusao");
			despacho.forward(request, response);
			
		}catch (Exception e) {
			e.printStackTrace();
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
