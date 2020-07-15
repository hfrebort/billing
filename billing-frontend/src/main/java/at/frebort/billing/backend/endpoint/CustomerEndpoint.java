package at.frebort.billing.backend.endpoint;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import at.frebort.billing.backend.dto.Customer;
import at.frebort.billing.backend.service.CustomerService;

/**
 * The Class CustomerEndpoint.
 */
@WebServlet("/customerOverview")
public class CustomerEndpoint extends HttpServlet {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The service. */
    private final CustomerService service = new CustomerService();

    @Override
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        final List<Customer> cutomerEntries = this.service.getCustomers();
        final RequestDispatcher dispatcher = request.getRequestDispatcher("customerOverview.jsp");
        request.setAttribute("customerEntries", cutomerEntries);
        dispatcher.forward(request, response);
    }

}
