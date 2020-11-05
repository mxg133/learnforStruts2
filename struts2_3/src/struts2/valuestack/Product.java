package struts2.valuestack;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * @author 孟享广
 * @date 2020-11-03 11:34 上午
 * @description
 */
public class Product implements RequestAware, SessionAware {
    private Integer productId;
    private String productName;
    private String productDesc;
    private double productPrice;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    public String save() {
        //1. 获取值栈
        ValueStack valueStack = ActionContext.getContext().getValueStack();

        //2. 创建 Test 对象, 并为其属性赋值
        Test test = new Test();
        test.setProductName("test-name");
        test.setProductDesc("test-desc");

        //3. 把 Test 对象压入到值栈的栈顶!
        valueStack.push(test);

        //
        sessionMap.put("product", this);
        requestMap.put("test", test);
        return "success";
    }

    private Map<String, Object> requestMap = null;

    @Override
    public void setRequest(Map<String, Object> map) {
        this.requestMap = map;
    }

    private Map<String, Object> sessionMap = null;

    @Override
    public void setSession(Map<String, Object> map) {
        this.sessionMap = map;
    }
}
