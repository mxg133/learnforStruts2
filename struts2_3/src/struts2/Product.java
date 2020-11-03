package struts2;

/**
 * @author 孟享广
 * @date 2020-11-03 11:34 上午
 * @description
 */
public class Product {
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
        System.out.println("save" + this);
        return "details";
    }

    public String test() {
        System.out.println("test");
        return "success";
    }
}
