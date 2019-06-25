package cn.xh;

import cn.xh.controller.UserController;
import cn.xh.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: springboot_day1
 * @description: 测试
 * @author: luyn
 * @create: 2019-06-19 15:05
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class MySpringBootApplicationTest {

    @Autowired
    private UserController userController;

    @Test
    public void test1(){
        List<String> param = new ArrayList<>();
        param.add("1");
        param.add("2");
        String list = "1,2";
        List<User> userList = userController.getUserList(list);
        System.out.println(userList.size());
    }
}
