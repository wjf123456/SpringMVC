package controller;


import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;

@Controller
@SessionAttributes({"name"})
public class HomeController {

    @RequestMapping("/")
    public String home(Model model)
    {
        model.addAttribute("name");
        return "home";
    }

    @RequestMapping("/date")
    public String session(Date date){
        System.out.println("=========="+date);
        return "home";
    }

    @RequestMapping("/toUser")
    public String toUser(Model model){
        model.addAttribute(new User());
        return "home";
    }

    @RequestMapping("/user")
    public String user(User user){
        System.out.println(user);
        return "home";
    }

//    @RequestMapping("/other/{a}")
//    public String other(@PathVariable @ModelAttribute int a )
//    {
////        model.addAttribute("a",++a);
//        ++a;
//        int i=1/0;
//        return "home";
//    }
//    @RequestMapping("/other1")
//    public String other1( @RequestParam(value = "a",required = false) Integer name)
//    {
//        System.out.print(name);
//        return "home";
//    }
//
//    @ModelAttribute
//    public int IncrAge(@PathVariable int a){
//        System.out.println("=============");
//        return 10;
//    }
//
//    @ExceptionHandler(ArithmeticException.class)
//    public String handlerException(RuntimeException e){
//        return "error";
//    }
}
