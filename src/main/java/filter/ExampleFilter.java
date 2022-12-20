package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class ExampleFilter
 */
@WebFilter("/*")
public class ExampleFilter extends HttpFilter implements Filter {
       
	private String encording = "UTF-8";
	
    /**
     * @see HttpFilter#HttpFilter()
     */
    public ExampleFilter() {

    }

	/**
	 * @see Filter#destroy()
	 */
    @Override
	public void destroy() {

	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
    @Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// place your code here
    	request.setCharacterEncoding(encording);
    	response.setContentType("text/html; charset=" + encording);
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
    @Override
	public void init(FilterConfig fConfig) throws ServletException {

	}

}
