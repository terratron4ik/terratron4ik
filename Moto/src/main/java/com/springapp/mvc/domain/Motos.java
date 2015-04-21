package com.springapp.mvc.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by vlad on 21.04.2015.
 */
public class Motos implements Serializable {

    private List<Moto> motos;

    public Motos(){}

    public Motos(List<Moto> motos){
        this.motos = motos;
    }

    public List<Moto> getMotos() {
        return motos;
    }

    public void setMotos(List<Moto> motos) {
        this.motos = motos;
    }
}
