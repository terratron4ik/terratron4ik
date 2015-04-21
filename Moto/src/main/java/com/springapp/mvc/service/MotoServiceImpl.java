package com.springapp.mvc.service;

import com.springapp.mvc.dao.MotoDao;
import com.springapp.mvc.domain.Moto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class MotoServiceImpl implements MotoService {

    private MotoDao motoDao;

    public MotoDao getMotoDao() {
        return motoDao;
    }

    public void setMotoDao(MotoDao motoDao) {
        this.motoDao = motoDao;
    }

    @Transactional(readOnly = true)
    @Override
    public void add(Moto moto) {
        motoDao.add(moto);
    }

    @Transactional(readOnly = true)
    @Override
    public void update(Moto moto) {
        motoDao.update(moto);
    }

    @Transactional(readOnly = true)
    @Override
    public void delete(int id) {
        motoDao.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Moto> findAll() {
        return motoDao.findAll();
    }
}
