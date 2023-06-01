import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/player.do")
public class PlayerServlet extends HttpServlet {
    /*@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String playerfirstName = request.getParameter("firstname");
        System.out.println(playerfirstName);
        String playerlastName = request.getParameter("lastname");
        System.out.println(playerfirstName);
        request.setAttribute("firstname", playerfirstName);
        request.setAttribute("lastname", playerlastName);
        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
    }*/
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String playerName = request.getParameter("name");
        request.setAttribute("name", playerName);
        request.getRequestDispatcher("/WEB-INF/views/info.jsp").forward(request, response);
    }
}
