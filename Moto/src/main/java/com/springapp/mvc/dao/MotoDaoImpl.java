package com.springapp.mvc.dao;

import com.springapp.mvc.domain.Moto;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class MotoDaoImpl implements MotoDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional(readOnly = true)
    public void add(Moto moto) {
         sessionFactory.getCurrentSession().save(moto);
    }

    @Transactional(readOnly = true)
    public void update(Moto moto) {
        sessionFactory.getCurrentSession().update(moto);
    }

    @Transactional(readOnly = true)
    public void delete(int id) {
        Moto moto = (Moto) sessionFactory.getCurrentSession().load(Moto.class, id);
        if (null != moto) {
            sessionFactory.getCurrentSession().delete(moto);
        }
    }

    @Transactional(readOnly = true)
    public List<Moto> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from Moto c").list();
    }
}
