package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 801174
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String button = request.getParameter("button");

        request.setAttribute("first", first);
        request.setAttribute("second", second);

        if (first == null || first.equals("") || first.matches("[a-zA-Z]+")
                || second == null || second.equals("") || second.matches("[a-zA-Z]+")) {
            request.setAttribute("result", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        } 
        else {
            switch(button) {
                case "+":
                    request.setAttribute("result", Integer.parseInt(first) + Integer.parseInt(second));
                    break;
                case "-":
                    request.setAttribute("result", Integer.parseInt(first) - Integer.parseInt(second));
                    break;
                case "*":
                    request.setAttribute("result", Integer.parseInt(first) * Integer.parseInt(second));
                    break;
                case "%":
                    request.setAttribute("result", Integer.parseInt(first) % Integer.parseInt(second));
                    break;
            }
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
    }
}
