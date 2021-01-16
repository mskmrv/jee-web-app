package ru.mskomarov.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "utf8Filter", urlPatterns = "/*")
public class utf8Filter implements Filter {
    private transient FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        response.setCharacterEncoding("text/html; charset=utf8");
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
