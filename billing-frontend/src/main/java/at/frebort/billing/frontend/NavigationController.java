package at.frebort.billing.frontend;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import at.frebort.billing.backend.service.CustomerService;

@Controller
public class NavigationController {

    private final CustomerService service;

    @Autowired
    public NavigationController(final CustomerService service) {
        this.service = service;
    }

    @RequestMapping
    public String index() {
        return "index.jsp";
    }

    @RequestMapping("/customerOverview")
    public String customerOverview(final HttpSession session) {
        session.setAttribute("customerEntries", this.service.getCustomers());
        return "customerOverview.jsp";
    }

    @RequestMapping("/initializeDatabase")
    private String initializeDatabase() {
        this.service.insertCustomers();
        return "index.jsp";
    }
}
