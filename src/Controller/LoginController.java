package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private boolean isValidUser(String username, String password) {
		if (username.equals("shopper") && password.equals("shop123")) {
			return true;
		}
		return false;
	}

    /**
     * Default constructor. 
     */
    public LoginController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		// Check if the username and password are equal to "shopper" and "shop123" respectively
		if (isValidUser(username, password)) {
			// set the session attribute
			session.setAttribute("username", username);
			session.setAttribute("phone", phone);
			// console log the session id
			System.out.println(session.getId());
			System.out.println(session.getAttribute("username"));
			System.out.println(session.getAttribute("phone"));
			response.sendRedirect("uniformOrder.html");
		} else {
			request.setAttribute("error", "Invalid username or password");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		// if (username.equals("shopper") && password.equals("shop123")) {
		// 	// If they are, redirect to the home page
		// 	response.sendRedirect("uniformOrder.html");
		// } else {
		// 	// If they are not, send the user back to the login page with an error message
		// 	request.setAttribute("errorMessage", "Invalid username or password");
		// 	System.out.println("errorMessage");
		// 	request.getRequestDispatcher("index.jsp").forward(request, response);
			
		// }
		
	}

}
