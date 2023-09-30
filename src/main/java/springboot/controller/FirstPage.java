package springboot.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Scope("request")
public class FirstPage {

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String simplePage(Model model){
        model.addAttribute("name", "Edgar");
        return "simplepage";
    }

}