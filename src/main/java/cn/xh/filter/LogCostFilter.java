package cn.xh.filter;


import javax.servlet.*;
import javax.servlet.FilterConfig;
import java.io.IOException;

/**
 * @program: springboot_day1
 * @description: 过滤器
 * @author: luyn
 * @create: 2019-06-20 14:14
 **/
public class LogCostFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Execute cost="+(System.currentTimeMillis()-start));
    }

    @Override
    public void destroy() {

    }
}
