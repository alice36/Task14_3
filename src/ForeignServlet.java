import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

@WebServlet("/waluty")
public class ForeignServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String wartosc = request.getParameter("wartosc");
        String waluta = request.getParameter("waluta");
        String day = request.getParameter("day");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.println("Wybrana waluta to " + waluta + " o wartości " + Double.parseDouble(wartosc) + " PLN na date " + Date.valueOf(day));
    }


}
