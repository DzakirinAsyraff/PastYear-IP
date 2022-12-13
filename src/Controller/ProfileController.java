package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Customer;

/**
 * Servlet implementation class ProfileController
 */
@WebServlet("/ProfileController")
public class ProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.getRequestDispatcher("updateProfile.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// get the session attribute
		String username =  (String) request.getSession().getAttribute("username");
		String phone =  (String) request.getSession().getAttribute("phone");
		String address = request.getParameter("address");
		// create cookie
		Cookie cookie = new Cookie("address", address);
		// create a customer object
		Customer customer = new Customer(
			username,
			request.getParameter("fullname"),
			request.getParameter("gender"),
			request.getParameter("email"),
			request.getParameter("payment"),
			address,
			phone,
			request.getParameterValues("interest")
		);
		// print a h1 tag with "hello world"
		response.getWriter().append("<h1>Welcome" + customer.getFullname()+ "</h1><br>");
		// print the customer object as response page
		// should use toString() method
		response.getWriter().append("<p>User Name:" + customer.getUsername() + "</p><br>");
		response.getWriter().append("<p>Contact No:" + customer.getPhone() + "</p><br>");
		response.getWriter().append("<p>Email:" + customer.getEmail() + "</p><br>");
		response.getWriter().append("<p>Gender:" + customer.getGender() + "</p><br>");
		response.getWriter().append("<p>Payment Method:" + customer.getPayment() + "</p><br>");
		response.getWriter().append("<p>Delivery Address:" + customer.getAddress() + "</p><br>");
		response.getWriter().append("<p>Your shopping interests include:</p><br>");
		response.getWriter().append("<ul>");
		for (String interest : customer.getInterest()) {
			response.getWriter().append("<li>" + interest + "</li><br>");
		}
		response.getWriter().append("</ul>");
		// print a link button
		response.getWriter().append("<a href=\"uniformOrder.html\">Back to Order</a>");



	}

}
