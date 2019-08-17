package com.ssh.action;

import com.opensymphony.xwork2.Action;
import com.ssh.bean.User;
import com.ssh.dao.UserDao;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userAction")
public class UserAction implements Action {
    private String username;
    private String password;
    @Resource
    private UserDao userDao = new UserDao();
    @Override
    public String execute() throws Exception {
        User user = new User();
        user.setUserName(username);
        user.setPassWord(password);
        userDao.userSave(user);
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
