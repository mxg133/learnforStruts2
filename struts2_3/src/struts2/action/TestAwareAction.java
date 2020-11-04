package struts2.action;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * @author 孟享广
 * @date 2020-11-04 11:13 上午
 * @description
 */
public class TestAwareAction implements ApplicationAware, SessionAware, RequestAware, ParameterAware {
    public String execute() {
        //1. 向 application 中加入一个属性: applicationKey2 - applicationValue2
        application.put("applicationKey2", "applicationValue2");

        //2. 从 application 中读取一个属性 date, 并打印.
        System.out.println(application.get("date"));
        return "success";
    }

    private Map<String, Object> application;

    @Override
    public void setApplication(Map<String, Object> map) {
        this.application = application;
    }


    @Override
    public void setParameters(Map<String, String[]> map) {

    }

    @Override
    public void setRequest(Map<String, Object> map) {

    }

    @Override
    public void setSession(Map<String, Object> map) {

    }
}
