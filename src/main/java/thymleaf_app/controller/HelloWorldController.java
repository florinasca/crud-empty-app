package thymleaf_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    //metoda pentru a afisa formularul HTML initial

    @RequestMapping
   public String showForm() {
        return "helloword-form";
    }

    //metoda care se ocupa de procesarea datelor in formularul HTML
    @RequestMapping
    public String showForm() {
        return "helloword-form";
}
