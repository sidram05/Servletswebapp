package trng.webapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import trng.webpojo.Customer;

/**
 * Servlet implementation class customerServlet
 */
public class customerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public customerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*	int customerId = Integer.parseInt(s)(request.getParameter("customerId"));
		int customerId = Long.parseLong(request.getParameter("customerId"));*/
		String fname = request.getParameter("fname");
		String lname =  request.getParameter("lname");
		String email = request.getParameter("email");
		Integer cardNumber = Integer.parseInt(request.getParameter("cardNo"));
		String cardName = request.getParameter("cardName");
		String bState = request.getParameter("bstate");
		Integer bzip = Integer.parseInt(request.getParameter("bzip"));
		String bCountry = request.getParameter("bcountry");
		String sStreet = request.getParameter("sstreet");
		String scity = request.getParameter("scity");
		String sState = request.getParameter("sstate");
		Integer szip = Integer.parseInt(request.getParameter("szip"));
		String sCountry = request.getParameter("scountry");
		String other = request.getParameter("other");
		
		
		Customer customer = new Customer(fname, lname, email, cardNumber, cardName, bState, bzip, bCountry, sStreet, scity, sState, szip, sCountry, other);
//		response.getWriter().println(customer);
		request.setAttribute("customer", customer);
		RequestDispatcher rd = request.getRequestDispatcher("/views/customerDetails.jsp");
		rd.forward(request, response);
	}

}
