package sandbox;

import com.google.inject.Inject;
import com.google.inject.Injector;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * Created by joeabrams on 3/3/16.
 */

@WebServlet(value="/hello", name="hello-servlet", loadOnStartup = 1)
public class HelloKittyServlet extends HttpServlet {

    @Inject
    HelloService helloService;

    @Override
    public void init(ServletConfig config) throws ServletException {

        ServletContext context = config.getServletContext();
        Injector injector = (Injector) context.getAttribute(Injector.class.getName());
        if (injector == null) {
            throw new ServletException("Guice Injector not found");
        }
        injector.injectMembers(this);

    }

    public void service(ServletRequest req, ServletResponse res)
            throws IOException, ServletException
    {
        res.getWriter().println(helloService.sayHey());
    }
}