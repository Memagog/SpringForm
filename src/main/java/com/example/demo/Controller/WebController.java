package com.example.demo.Controller;


import com.example.demo.emplyonee.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class WebController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String userForm(Model model){
        model.addAttribute("index", new User());
            return "index";

    }
    @RequestMapping(value ="/index", method = RequestMethod.POST)
    public String formSubmit(@ModelAttribute User user, Model model) {
        model.addAttribute("userdata", user);
        return "result";
    }


}
