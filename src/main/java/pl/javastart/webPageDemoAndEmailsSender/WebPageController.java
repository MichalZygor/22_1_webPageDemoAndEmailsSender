package pl.javastart.webPageDemoAndEmailsSender;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.sql.rowset.Predicate;

@Controller
public class WebPageController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("pagesList", WebPageList.values());
        model.addAttribute("activePage", WebPageList.HOME_PAGE.getDescription());
        return "home";
    }

    @GetMapping("/HOME_PAGE")
    public String pageHomeBis (){
        return "redirect:/";
    }

    @GetMapping("/WHY_VAZZA")
    public String pageWhy(Model model) {
        model.addAttribute("pagesList", WebPageList.values());
        model.addAttribute("activePage", WebPageList.WHY_VAZZA.getDescription());
        return "why_vazza";
    }

    @GetMapping("/VALUES")
    public String pageValues(Model model) {
        model.addAttribute("pagesList", WebPageList.values());
        model.addAttribute("activePage", WebPageList.VALUES.getDescription());
        return "values";
    }

}
