package DynamicTable;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/table")
public class Table extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num=Integer.parseInt(req.getParameter("num"));
		
		for(int i=1;i<=10;i++)
		{
//			n=num1*i;
		
		resp.getWriter().print("<html><body><table border='2px'>"
				+ "        <tr>"
				+ "            <td>"+num+"</td>"
				+ "            <td>x</td>"
				+ "            <td>"+i+"</td>"
				+ "            <td>"+"="+"</td>"
				+ "            <td>"+(num*i)+"</td>"
				+ "        </tr>"
				+ "    </table></body></html>");
		}
	}
}
