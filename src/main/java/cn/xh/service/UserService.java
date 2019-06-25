package cn.xh.service;

import cn.xh.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @program: heima_java
 * @description:
 * @author: luyn
 * @create: 2019-06-17 19:35
 **/
public interface UserService {
    public Map<String, Object> login(String id);

    public User getUserName();

    public List<User> getUserList(List<String> list);

    public List<User> findUserList();
}
