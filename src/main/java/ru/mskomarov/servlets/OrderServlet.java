package ru.mskomarov.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "OrderServlet", urlPatterns = "/order_servlet")
public class OrderServlet implements Servlet {
    private static Logger logger = LoggerFactory.getLogger(OrderServlet.class);
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
        logger.info("New request to OrderServlet");
        servletResponse.getWriter().println("<h1>Order Servlet content</h1>");
    }

    @Override
    public String getServletInfo() {
        return "OrderServlet";
    }

    @Override
    public void destroy() {
        logger.info("Servlet {} destroyed", getServletInfo());
    }
}
