package pl.javastart.webPageDemoAndEmailsSender;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebPageController {
    private final MailService mailService;

    public WebPageController(MailService mailService) {
        this.mailService = mailService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("pagesList", WebPageList.values());
        model.addAttribute("activePage", WebPageList.HOME_PAGE);
        return "home";
    }

    @GetMapping("/home-page")
    public String pageHomeBis() {
        return "redirect:/";
    }

    @GetMapping("/why-vazza")
    public String pageWhy(Model model) {
        model.addAttribute("pagesList", WebPageList.values());
        model.addAttribute("activePage", WebPageList.WHY_VAZZA);
        return "why-vazza";
    }

    @GetMapping("/values")
    public String pageValues(Model model) {
        model.addAttribute("pagesList", WebPageList.values());
        model.addAttribute("activePage", WebPageList.VALUES);
        return "values";
    }

    @GetMapping("/contact")
    public String pageContact(Model model) {
        model.addAttribute("contactPerson", new ContactPerson());
        model.addAttribute("pagesList", WebPageList.values());
        model.addAttribute("activePage", WebPageList.CONTACT);
        return "contact";
    }

    @PostMapping("/contact")
    public String pageContact(ContactPerson contactPerson) {
        mailService.sendMail(contactPerson);
        mailService.sendMailConfirmationToGuest(contactPerson);
        return "redirect:/contact";
    }
}
