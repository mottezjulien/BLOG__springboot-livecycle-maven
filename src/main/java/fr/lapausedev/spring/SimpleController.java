package fr.lapausedev.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SimpleController {

    @GetMapping(path = "/hello")
    @ResponseBody
    public String hello() {
        return "Hello world !!";
    }

}

