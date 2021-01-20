package pl.javastart.webPageDemoAndEmailsSender;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebPageController {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("pagesList", WebPageList.values());
        return "home";
    }

    @GetMapping("/regulamin")
    public String reg(Model model){
        //model.addAttribute("pagesList", WebPageList.values());
        return "regulamin";
    }
}
