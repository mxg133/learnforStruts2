package struts2.action;

/**
 * @author 孟享广
 * @date 2020-11-04 4:29 下午
 * @description
 */
public class TestResultAction {

    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public String execute() {
        String result = null;
        //根据请求参数 number 的值, 返回对应的 JSP 页面
        //1. 若 number 是 3 个整数, 返回 success.jsp 页面
        if (number % 4 == 0) {
            result = "success";
        }
        //2. 若 number 除以 3 余 1, 返回 login.jsp
        else if (number % 4 == 1) {
            result = "login";
        }
        //3. 若 number 除以 3 余 2, 返回 index.jsp
        else if (number % 4 == 2) {
            result = "index";
        } else
            result = "test";
        return result;
    }
}
