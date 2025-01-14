package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookNavigationServlet
 */
@WebServlet("/bookNavigationServlet")
public class BookNavigationServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookNavigationServlet() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		BookHelper bh = new BookHelper();
		String act = request.getParameter("doThisToBook");
		
		String path = "/viewAllBooksServlet";
		
		if(act.equals("Add Book"))
		{
			path = "/addbook.html";
		}
		else if(act.equals("Edit Book"))
		{
			System.out.println("Not implemented yet"); //TODO
		}
		else if(act.equals("Delete Book"))
		{
			System.out.println("Not implemented yet"); //TODO
		}
		
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
