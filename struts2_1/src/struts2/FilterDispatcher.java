package struts2;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author 孟享广
 * @date 2020-11-03 11:01 上午
 * @description
 *  Servlet Filter implementation class FilterDispatcher
 * 使用 Filter 作为控制器的好处
 *      使用一个过滤器来作为控制器,
 *      可以方便地在应用程序里对所有资源(包括静态资源)进行控制访问.
 *
 * Servlet 能做的 Filter 是否都可以完成 ? 嗯。
 * Filter 能做的 Servlet 都可以完成吗 ?
 *      拦截资源却不是 Servlet 所擅长的!
 *      Filter 中有一个 FilterChain，这个 API 在 Servlet 中没有！
 */
public class FilterDispatcher implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        //1. 获取 servletPath
        String servletPath = request.getServletPath();
        System.out.println(servletPath);
        String path = null;

        //2. 判断 servletPath, 若其等于 "/product-input.action", 则转发到
        ///WEB-INF/pages/input.jsp
        if ("/product-input.action".equals(servletPath)) {
            path = "/WEB-INF/pages/input.jsp";
        }

        // 3. 若其等于 "/product-save.action", 则
        if ("/product-save.action".equals(servletPath)) {
            //1). 获取请求参数
            String productName = request.getParameter("productName");
            String productDesc = request.getParameter("productDesc");
            String productPrice = request.getParameter("productPrice");

            //2). 把请求信息封装为一个 Product 对象
            Product product = new Product(null, productName, productDesc, Double.parseDouble(productPrice));

            //3). 执行保存操作
            System.out.println("Save product... ->" + product);
            product.setProductId(1101);

            //4). 把 Product 对象保存到 request 中. ${param.productName} -> ${requestScope.product.productName}
            request.setAttribute("product", product);

            path = "/WEB-INF/pages/details.jsp";
        }

        if (path != null) {
            request.getRequestDispatcher(path).forward(req, resp);
            return;
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
