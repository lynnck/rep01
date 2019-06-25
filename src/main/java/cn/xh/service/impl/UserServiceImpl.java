package cn.xh.service.impl;

import cn.xh.dao.UserDao;
import cn.xh.entity.User;
import cn.xh.service.UserService;
import cn.xh.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: heima_java
 * @description: 实现
 * @author: luyn
 * @create: 2019-06-17 19:54
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public Map<String, Object> login(String id) {
       // String md5Id = MD5Util.getMD5String(id);// MD5加密
        //System.out.println(md5Id);
        return userDao.getUser(id);
    }

    @Override
    public User getUserName() {
        return userDao.getUserName();
    }

    @Override
    public List<User> getUserList(List<String> list) {
        return userDao.getUserList(list);
    }

    @Override
    public List<User> findUserList() {
        return userDao.findUserList();
    }
}
