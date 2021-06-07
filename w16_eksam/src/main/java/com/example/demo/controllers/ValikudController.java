package com.example.demo.controllers;

import com.example.demo.*;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class ValikudController {
    

    @GetMapping("/valikud")
    public ModelAndView showValukud() {
        EnergyPrice energyPrice = new EnergyPrice();
        double currentEnergyPrice = energyPrice.GetCurrentPrice();

        Device1 fridge = new Device1();
        fridge.Used = 50;
        fridge.WorkHourFrom = 10;
        fridge.WorkHourTo = 21;
        fridge.EnergyPriceTotal = EnergyCalculator.CalcEnergyPrice(fridge, currentEnergyPrice);
        fridge.individual = EnergyCalculator.CalcIndividual(fridge.WorkHourFrom, fridge.WorkHourTo, fridge.Used);

        Device1 boiler = new Device1();
        boiler.Used = 50;
        boiler.WorkHourFrom = 8;
        boiler.WorkHourTo = 11;
        boiler.EnergyPriceTotal = EnergyCalculator.CalcEnergyPrice(boiler, currentEnergyPrice);
        boiler.individual = EnergyCalculator.CalcIndividual(boiler.WorkHourFrom, boiler.WorkHourTo, boiler.Used);

        double total = boiler.individual + fridge.individual;
        fridge.individualPercent = Percent.CalcPercent(total, fridge.individual);
        boiler.individualPercent = Percent.CalcPercent(total, fridge.individual);
        


        ModelAndView modelAndView = new ModelAndView("valikud");
        modelAndView.addObject("fridge", fridge);
        modelAndView.addObject("boiler", boiler);
        modelAndView.addObject("price", currentEnergyPrice);

        return modelAndView;
    }

}