package dto;

import com.shen.test.common.model.TabUser;

//dto:接受客户端（页面）传来的全部参数

public class TabUserDTO extends TabUser {
    private String cc;

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }
}
