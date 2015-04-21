package com.springapp.mvc.dao;

import com.springapp.mvc.domain.Moto;

import java.util.List;

/**
 * Created by vlad on 21.04.2015.
 */
public interface MotoDao {

    void add(Moto moto);

    void update(Moto moto);

    void delete(int id);

    List<Moto> findAll();



}
