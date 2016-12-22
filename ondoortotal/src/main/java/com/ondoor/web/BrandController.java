package com.ondoor.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ondoor.model.Brand;
import com.ondoor.service.BrandService;

@Controller
@RequestMapping(value = "/brand")
public class BrandController {

    @Autowired
    private BrandService  brandService;



    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(/*@ModelAttribute("brandForm")*/ Brand brand, BindingResult bindingResult, Model model) {
    	System.out.println("brand controller ------------>>>");

    	brandService.add(brand);
//        securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());
        return "welcome";
    }

}
