package com.ssh.dao;

import com.mysql.cj.Query;
import com.ssh.bean.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import util.HibernateUtil;

import javax.annotation.Resource;

@Repository("userDao")
public class UserDao {

//    @Resource(name="sessionFactory")
//    private SessionFactory sessionFactory;

    public void userSave(User user) {
//        Query<User> list = (Query<User>) HibernateUtil.getSession().createQuery("select * from tab_user",User.class);
//        HibernateUtil.getSession().get
        Session session = HibernateUtil.getSession();
        session.save(user);
        session.beginTransaction().commit();
        session.close();
    }


}
