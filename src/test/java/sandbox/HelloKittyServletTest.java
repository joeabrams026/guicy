package sandbox;

import com.google.inject.Inject;
import org.junit.Test;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.PrintWriter;

import static org.mockito.Mockito.*;

/**
 * Created by joeabrams on 3/4/16.
 */
public class HelloKittyServletTest extends TestBase {

    @Inject
    HelloKittyServlet servlet;

    @Test
    public void testService() throws Exception {
        ServletRequest req = mock(ServletRequest.class);
        ServletResponse resp = mock(ServletResponse.class);
        PrintWriter writer = mock(PrintWriter.class);
        when(resp.getWriter()) .thenReturn(writer);

        servlet.service(req, resp);
        verify(writer).println("Hello Test Kitty 1");
    }
}