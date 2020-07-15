package at.frebort.billing.backend.endpoint;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import at.frebort.billing.backend.service.InitializeDatabaseService;

/**
 * The Class InitializeDatabaseEndpoint.
 */
@WebServlet("/initializeDatabase")
public class InitializeDatabaseEndpoint extends HttpServlet {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The service. */
    private final InitializeDatabaseService service = new InitializeDatabaseService();

    @Override
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        this.service.createAndImport();
        final RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
}
