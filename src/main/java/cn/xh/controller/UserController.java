package cn.xh.controller;

import cn.xh.dao.UserDao;
import cn.xh.entity.User;
import cn.xh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: heima_java
 * @description: 控制层
 * @author: luyn
 * @create: 2019-06-17 19:42
 **/
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    @ResponseBody
    public Map<String, Object> dologin(String name,String pwd) {
        System.out.println("用户名："+name+"密码"+pwd);
        String id = "1";
        Map<String, Object> map = new HashMap<>();
        map = userService.login(id);
        return map;
    }

    @RequestMapping("index")
    public String index(){
        System.out.println("qingqiu");
        return "index";
    }

    @RequestMapping("getUserName")
    @ResponseBody
    public User getUserName(){
        return userService.getUserName();
    }

    @RequestMapping("getUserList")
    @ResponseBody
    public List<User> getUserList(String param){
        System.out.println(param);
        String[] strList = param.split(",");
        List<String> list = new ArrayList<>();
        for(int i = 0; i < strList.length; i++) {
            list.add(strList[i]);
        }
        List<User> userList = new ArrayList<>();
        System.out.println(list);
        userList = userService.getUserList(list);
        for(User user : userList) {
            System.out.println(user.getName());
        }
        return userList;
    }

    public List<User> findUserList(){
        return userService.findUserList();
    }
}
