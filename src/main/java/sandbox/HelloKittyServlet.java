package sandbox;

import com.google.inject.Inject;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Created by joeabrams on 3/3/16.
 */

@WebServlet(value="/hello", name="hello-servlet", loadOnStartup = 1)
public class HelloKittyServlet extends BaseServlet {

    @Inject
    HelloService helloService;

    public void service(ServletRequest req, ServletResponse res)
            throws IOException, ServletException
    {
        res.getWriter().println(helloService.sayHey());
    }
}