package sandbox;

import com.google.inject.Injector;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * Created by joeabrams on 3/3/16.
 */

public abstract class BaseServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {

        ServletContext context = config.getServletContext();
        Injector injector = (Injector) context.getAttribute(Injector.class.getName());
        if (injector == null) {
            throw new ServletException("Guice Injector not found");
        }
        injector.injectMembers(this);

    }

}