package cn.xh.dao;

import cn.xh.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @program: heima_java
 * @description: 用户数据层
 * @author: luyn
 * @create: 2019-06-17 19:35
 **/
public interface UserDao {
    public Map<String, Object> getUser(@Param("id") String id);

    public User getUserName();

    //foreach练习
    public List<User> getUserList(@Param("list") List<String> list);

    public List<User> findUserList();
}
