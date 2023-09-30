package springboot.webapp.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Scope("request")
public class PageController {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String simplePage(Model model){
        model.addAttribute("name", "Mate");
        return "simplepage";
    }
}
