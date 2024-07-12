package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView showView()
    {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        mv.addObject("message",
                "GeeksForGeeks Welcomes "
                        + "you to Spring!");
        return mv;
    }
}