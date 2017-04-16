package net.kerba.jetty.demowarsecond;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.UUID;

/**
 * @user: kerb
 * @created: 16/04/2017.
 */
public class SecondAppServletInstallerListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("contextInitialized");
        sce.getServletContext().addServlet(UUID.randomUUID().toString(), SecondAppWelcomeServlet.class);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}