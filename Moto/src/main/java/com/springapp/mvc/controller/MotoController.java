package com.springapp.mvc.controller;

import com.springapp.mvc.domain.Moto;
import com.springapp.mvc.service.MotoService;
import com.springapp.mvc.validation.MotoValid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MotoController {

    private MotoService motoService;
    private MotoValid motoValid;

    @Autowired
    public MotoController(MotoService motoService, MotoValid motoValid){
        this.motoService = motoService;
        this.motoValid = motoValid;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getMotos(Model model) {
        List<Moto> motos = this.motoService.findAll();

        model.addAttribute("motos", motos);

        return "index";
    }

    @RequestMapping(value = "addMoto", method = RequestMethod.GET)
    public String addMoto(Model model){
        model.addAttribute("moto", new Moto());

        return "addMoto";
    }

    @RequestMapping(value = "addMoto", method = RequestMethod.POST)
    public String addMoto(@ModelAttribute ("moto") Moto moto, BindingResult bindingResult){
        this.motoValid.validate(moto, bindingResult);

        if (bindingResult.hasErrors()){
            return "addMoto";
        }

        this.motoService.add(moto);
        return "redirect:/";
    }

    @RequestMapping(value = "deleteMoto/{id}", method = RequestMethod.DELETE)
    public String deleteMoto(@PathVariable int id){
        motoService.delete(id);

        return "redirect:/";
    }
}
