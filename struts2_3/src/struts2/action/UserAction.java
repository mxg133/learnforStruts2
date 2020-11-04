package struts2.action;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * @author 孟享广
 * @date 2020-11-04 3:22 下午
 * @description
 */
public class UserAction implements SessionAware, ApplicationAware {
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String execute() {
        sessionMap.put("username", username);
        Integer count = (Integer) applicationMap.get("count");
        if (count == null) {
            count = 0;
        }
        count++;
        applicationMap.put("count", count);
        return "login-success";
    }

    public String logout() {
        Integer count = (Integer) applicationMap.get("count");
        if (count > 0 && count != null) {
            count--;
            applicationMap.put("count", count);
        }

        ((SessionMap)sessionMap).invalidate();
        return "logout-success";
    }

    private Map<String, Object> sessionMap;
    @Override
    public void setSession(Map<String, Object> map) {
        this.sessionMap = map;
    }

    private Map<String, Object> applicationMap;
    @Override
    public void setApplication(Map<String, Object> map) {
        this.applicationMap = map;
    }
}
