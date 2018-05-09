package trng.webapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import trng.webpojo.ProductOrder;

/**
 * Servlet implementation class newOrderServlet
 */
public class newOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				String pname = request.getParameter("pname");
				String cname =  request.getParameter("cname");
				Integer quantity = Integer.parseInt(request.getParameter("quantity"));
				System.out.println("Inside orderServlet");
				ProductOrder porder = new ProductOrder(pname, cname, quantity);
//				response.getWriter().println(customer);
				request.setAttribute("customer", porder);
				RequestDispatcher rd = request.getRequestDispatcher("/views/displayOrder.jsp");
				rd.forward(request, response);
	}
}
