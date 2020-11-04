package struts2.action;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 孟享广
 * @date 2020-11-04 12:13 下午
 * @description
 */
public class TestServletAwareAction implements ServletRequestAware, ServletContextAware, ServletResponseAware {

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {

    }
    private ServletContext servletContext;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    @Override
    public void setServletResponse(HttpServletResponse httpServletResponse) {

    }
}
