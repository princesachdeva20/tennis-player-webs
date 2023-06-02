import io.datajek.springmvc.tennisplayerwebs.Player;
import io.datajek.springmvc.tennisplayerwebs.PlayerService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/*
@WebServlet(urlPatterns = "/player.do")
public class PlayerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String player-firstName = request.getParameter("firstname");
        System.out.println(player-firstName);
        String player-lastName = request.getParameter("lastname");
        System.out.println(player-firstName);
        request.setAttribute("firstname", player-firstName);
        request.setAttribute("lastname", player-lastName);
        request.setAttribute("fullname", player firstname +" " + player-lastName);
        request.getRequestDispatcher("/WEB-INF/views/olderWelcome.jsp").forward(request, response);
    }
    */
@WebServlet(urlPatterns = "/player.do")
public class PlayerServlet extends HttpServlet {

    private PlayerService service = new PlayerService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String playerName = request.getParameter("name");

        Player player = service.getPlayerByName(playerName);

        request.setAttribute("name", playerName);
        request.setAttribute("country", player.getNationality());
        request.setAttribute("dob", player.getBirthDate());
        request.setAttribute("titles", player.getTitles());
        request.getRequestDispatcher("/WEB-INF/views/info.jsp").forward(request, response);
    }
}
