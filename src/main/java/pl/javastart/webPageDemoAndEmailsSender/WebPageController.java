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

    @GetMapping("/HOME_PAGE")
    public String pageHomeBis() {
        return "redirect:/";
    }

    @GetMapping("/WHY_VAZZA")
    public String pageWhy(Model model) {
        model.addAttribute("pagesList", WebPageList.values());
        model.addAttribute("activePage", WebPageList.WHY_VAZZA);
        return "why_vazza";
    }

    @GetMapping("/VALUES")
    public String pageValues(Model model) {
        model.addAttribute("pagesList", WebPageList.values());
        model.addAttribute("activePage", WebPageList.VALUES);
        return "values";
    }

    @GetMapping("/CONTACT")
    public String pageContact(Model model) {
        model.addAttribute("contactPerson", new ContactPerson());
        model.addAttribute("pagesList", WebPageList.values());
        model.addAttribute("activePage", WebPageList.CONTACT);
        return "contact";
    }

    @PostMapping("/CONTACT")
    public String pageContact(ContactPerson contactPerson) {
        mailService.sendMail(contactPerson.getEmail(), "test_javascript@ovo.slask.pl"
                , "Wiadomość ze strony od " + contactPerson.getName(), contactPerson.getMessage());
        mailService.sendMailConfirmationToGuest("test_javascript@ovo.slask.pl", contactPerson.getEmail()
                , contactPerson.getName());
        return "redirect:/CONTACT";
    }
}
