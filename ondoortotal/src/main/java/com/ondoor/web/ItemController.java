package com.ondoor.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ondoor.model.Item;
import com.ondoor.service.ItemService;

@Controller
//@RequestMapping(value = "/item")
public class ItemController {

    @Autowired
    private ItemService  itemService;



    @RequestMapping(value = "/item/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("itemForm") Item itemForm, BindingResult bindingResult, Model model) {
    	System.out.println("item controller ------------>>>");
//        userValidator.validate(userForm, bindingResult);

        /*if (bindingResult.hasErrors()) {
            return "registration";
        }*/
    	itemService.add(itemForm);
//        securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());
        return "welcome";
    }

}
