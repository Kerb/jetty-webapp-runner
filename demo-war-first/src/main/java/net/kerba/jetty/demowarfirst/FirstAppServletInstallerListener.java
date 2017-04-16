package net.kerba.jetty.demowarfirst;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.UUID;

/**
 * @user: kerb
 * @created: 16/04/2017.
 */
public class FirstAppServletInstallerListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("contextInitialized");
        sce.getServletContext().addServlet(UUID.randomUUID().toString(), FirstAppWelcomeServlet.class);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
