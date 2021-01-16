package ru.mskomarov.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "CatalogServlet", urlPatterns = "/catalog_servlet")
public class CatalogServlet implements Servlet {
    private static Logger logger = LoggerFactory.getLogger(CatalogServlet.class);
    private transient ServletConfig servletConfig;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        logger.info("New request to CatalogServlet");
        servletResponse.getWriter().println("<h1>Catalog Servlet content</h1>");
    }

    @Override
    public String getServletInfo() {
        return "CatalogServlet";
    }

    @Override
    public void destroy() {
        logger.info("Servlet {} destroyed", getServletInfo());
    }
}
