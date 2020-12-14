package ru.mskomarov;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;
import java.io.Serializable;

public class FirstServlet implements Servlet, Serializable {
    private Logger logger = LoggerFactory.getLogger(FirstServlet.class);
    private transient ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        logger.info("New Request: working method service()");
        res.getWriter().println("<h1>Hello World from Servlet<h1>");
    }

    @Override
    public String getServletInfo() {
        return "Invoked method getServletInfo()";
    }

    @Override
    public void destroy() {
        logger.info("FirstServlet object destroyed");
    }
}
