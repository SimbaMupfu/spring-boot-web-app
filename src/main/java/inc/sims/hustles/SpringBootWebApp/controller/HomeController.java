package inc.sims.hustles.SpringBootWebApp.controller;

import inc.sims.hustles.SpringBootWebApp.model.Programmer;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int firstNumber, int num2, ModelAndView mv){
        int result = firstNumber + num2;

        mv.addObject("result", result);
        mv.setViewName("result");

        return mv;
    }

    @RequestMapping("add_programmer")
    public String addProgrammer(@ModelAttribute Programmer programmer){
        return "result";
    }
}
