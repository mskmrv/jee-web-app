package ru.mskomarov.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = "/product_servlet")
public class ProductServlet implements Servlet {
    private static Logger logger = LoggerFactory.getLogger(ProductServlet.class);
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
        logger.info("New request to ProductServlet");
        servletResponse.getWriter().println("<h1>Product Servlet content");
    }

    @Override
    public String getServletInfo() {
        return "ProductServlet";
    }

    @Override
    public void destroy() {
        logger.info("Servlet {} destroyed", getServletInfo());
    }
}
