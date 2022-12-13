package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Item;

/**
 * Servlet implementation class ProcessOrder
 */
@WebServlet("/ProcessOrder")
public class ProcessOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessOrder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("uniformOrder.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getParameter("Set1Checkbox") != null) {
			Item item1 = new Item();
			item1.setName(request.getParameter("Set1Checkbox"));
			item1.setSize(request.getParameter("Set1Size"));
			item1.setQuantity(Integer.parseInt(request.getParameter("Set1Quantity")));
			
		}
		if(request.getParameter("Set2Checkbox") != null) {
			request.getSession().setAttribute("Set2Checkbox", "checked");
		}
		if(request.getParameter("Set3Checkbox") != null) {
			request.getSession().setAttribute("Set3Checkbox", "checked");
		}
	}

}
