package struts2.valuestack;

import com.opensymphony.xwork2.ActionContext;

/**
 * @author 孟享广
 * @date 2020-11-06 5:09 下午
 * @description
 */
public class UserAction {
    private String userId;
    private String userName;
    private String password;
    private String desc;
    private boolean married;

    public UserAction() {
    }

    public UserAction(String userId, String userName, String password, String desc) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.desc = desc;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    @Override
    public String toString() {
        return "UserAction{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", desc='" + desc + '\'' +
                ", married=" + married +
                '}';
    }

    public String save() {
        System.out.println(this);
        UserAction userAction = new UserAction();
        userAction.setUserId("userAction.setUserId");
        userAction.setUserName("serAction.setUserName");
        userAction.setPassword("userAction.setPassword");
        userAction.setDesc("userAction.setDesc");
        ActionContext.getContext().getValueStack().push(userAction);
        return "input";
    }
}
