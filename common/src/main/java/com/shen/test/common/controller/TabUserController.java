package com.shen.test.common.controller;


import com.shen.test.common.biz.TabUserService;
import com.shen.test.common.model.BaseDO;
import com.shen.test.common.model.BaseExample;
import com.shen.test.common.model.TabUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by shen on 2016/10/28.
 */
@Controller
@RequestMapping(value="tabUser")
public class TabUserController<T extends BaseDO,E extends BaseExample> extends BaseController<T,E> {
    @Autowired
    private TabUser tabUser;

    @Autowired
    private TabUserService<T,E> tabUserService;


    @RequestMapping(value="/tab_user_list.html")  //.html:实现页面的跳转
    public ModelAndView selectAllInfo(){
        ModelAndView mv = new ModelAndView("tab_user_list");

        return mv;
    }

    private void setProperties(){
        tabUserService.setEntityMapper(tabUserService.getTabUserMapper());
        tabUserService.setEntity((T)tabUser);
        this.setBizService(tabUserService);
    }
}
