package com.simple.controller;

import com.simple.pojo.UserInfo;
import com.simple.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/getUserMsg")
    @ResponseBody
    public Map<String, Object> getUserMsg(String userId){
        Map<String, Object> map = new HashMap<String, Object>();
        if (isEmpty(userId)){
            map.put("errorNo","-1");
            map.put("errorInfo","参数异常！");
            return map;
        }
        try {
            UserInfo userInfo = userServiceImpl.selectUser(userId);
            map.put("userInfo",userInfo);

        }catch (Exception e){
            e.printStackTrace();
            map.put("errorNo","-1");
            map.put("errorInfo","系统异常！");
        }
        return map;
    }

    @RequestMapping("/gotoPage")
    public ModelAndView gotoPage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user");
        return mv;
    }














    private boolean isEmpty(String str){
        if (str == null || "".equals(str) || "null".equals(str))
            return true;
        return false;
    }
}
