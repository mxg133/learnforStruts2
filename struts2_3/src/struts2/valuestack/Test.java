package struts2.valuestack;

/**
 * @author 孟享广
 * @date 2020-11-05 5:29 下午
 * @description
 */
public class Test {
    private String productName;
    private String productDesc;

    public Test() {
    }

    public Test(String productName, String productDesc) {
        this.productName = productName;
        this.productDesc = productDesc;
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

    @Override
    public String toString() {
        return "Test{" +
                "productName='" + productName + '\'' +
                ", productDesc='" + productDesc + '\'' +
                '}';
    }
}
