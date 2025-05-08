package thymleaf_app.controller;


import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class DemoController {

    // aici vom crea mapping-ul pentru "/hello"
    @GetMapping("/hello")
    public String sayHello(Model theModel) {

        //theModel.addText(attributeName: "theDate", LocalDateTime.now());

        return "helloworld";
    }

}