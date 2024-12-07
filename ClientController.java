package com.klef.springboot.jfsd;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClientController {

    @GetMapping("/welcome")
    public String welcome() {
        return "test";
    }

    @GetMapping("/showInfo")
    public String showInfo(@RequestParam int id, @RequestParam String name, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "showInfo";
    }

    @GetMapping("/calculateSum/{num1}/{num2}")
    public String calculateSum(@PathVariable int num1, @PathVariable int num2, Model model) {
        model.addAttribute("sum", num1 + num2);
        return "calculate";
    }

    @GetMapping("/employeeForm")
    public String employeeForm() {
        return "employeeForm";
    }

    @GetMapping("/addNumbers")
    public String addNumbers(@RequestParam int num1, @RequestParam int num2, Model model) {
        model.addAttribute("sum", num1 + num2);
        return "addNumbers";
    }

    @GetMapping("/combine")
    public String combine(@RequestParam String str1, @RequestParam String str2, Model model) {
        model.addAttribute("result", str1 + " " + str2);
        return "combine";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2, Model model) {
        model.addAttribute("sum", num1 + num2);
        model.addAttribute("product", num1 * num2);
        return "calculate";
    }
}

