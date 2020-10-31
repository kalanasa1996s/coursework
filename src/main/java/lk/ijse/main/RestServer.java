package lk.ijse.main;

import lk.ijse.main.api.ResourceAccessRest;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class RestServer {
    private Server server;

    public void start() throws Exception {
        Server server = new Server(5000);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");

        context.addServlet(ResourceAccessRest.class, "/hello");
        server.setHandler(context);
        server.start();
        server.join();
    }
}
