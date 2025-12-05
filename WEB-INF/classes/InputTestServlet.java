import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InputTestServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException{
        req.setCharacterEncoding("utf-8");

        String username=req.getParameter("name");
        String nationality=req.getParameter("nationality");

        req.setAttribute("name",username);
        req.setAttribute("nationality",nationality);

        RequestDispatcher dispatcher=req.getRequestDispatcher("Result");
        dispatcher.forward(req,res);
    }
}