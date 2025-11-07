package kr.co.bnk.bnk_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class fundController {

    @GetMapping("/fund/depositGuide")
    public String depositGuide() {
        return "fund/depositGuide"; // templates/fund/depositGuide.html
    }
}
