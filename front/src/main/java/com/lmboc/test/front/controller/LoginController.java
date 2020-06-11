package com.lmboc.test.front.controller;

import com.shen.test.common.biz.TabUserService;
import com.shen.test.common.controller.BaseController;
import com.shen.test.common.model.BaseDO;
import com.shen.test.common.model.BaseExample;
import com.shen.test.common.model.TabUser;
import com.shen.test.common.model.TabUserExample;
import com.shen.test.common.util.ResultMap;
import com.shen.test.common.util.utils.VerifyCodeUtils;
import dto.TabUserDTO;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sun.swing.StringUIClientPropertyKey;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping(value = "login")   //登录
public class LoginController<T extends BaseDO,E extends BaseExample> extends BaseController<T,E> {
    @Autowired
    private TabUserService tabUserService;

    @RequestMapping(value = "/login.html")
    public ModelAndView gotoLogin(ModelAndView mv) {
        mv.setViewName("login");
        return mv;
    }

    @RequestMapping(value = "login.json")
    public ResultMap login(TabUserDTO tabUserDTO,HttpSession session) {
        ResultMap  resultMap = new ResultMap();
        String cc = tabUserDTO.getCc();
        if (StringUtils.isNotBlank(cc)){
            if (cc.equals(session.getAttribute("cc"))){
                resultMap.setRet(0); //0表示失败
                resultMap.setError("验证码不正确！");
                return resultMap;
            }
        }

        String username = tabUserDTO.getUsername();
        String psd = tabUserDTO.getPassword();

        TabUserExample tabUserExample = new TabUserExample();
        TabUserExample.Criteria criteria = tabUserExample.createCriteria();    //criteria相当于where
        criteria.andUsernameEqualTo(username);//
        criteria.andUsernameEqualTo(psd);    //例：相当于 select * from tab_user where username='admin' and password='123456'

        tabUserService.setEntityMapper(tabUserService.getTabUserMapper());
        tabUserService.setEntity((T) new TabUser());

        List list = tabUserService.selectByExample(tabUserExample);
        if (list != null && list.size() > 0){
            TabUser tabUser = (TabUser) list.get(0);
            session.setAttribute("userid",tabUser.getUid());
            session.setAttribute("username",tabUser.getUsername());

            resultMap.setRet(1);
            resultMap.setSuccess("登录成功！");
            resultMap.put("username",tabUser.getUsername());
        }
        return resultMap;
    }

    @RequestMapping(value="/ccImg")    //处理验证码
    public void getCC(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");

        //存入会话session
        HttpSession session = request.getSession();
        //删除以前的
        session.removeAttribute("cc");

        String code = VerifyCodeUtils.generateVerifyCode(4);
        try {
            VerifyCodeUtils.outputImage(80, 26, response.getOutputStream(), code);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        session.setAttribute("cc",code);
    }
}
