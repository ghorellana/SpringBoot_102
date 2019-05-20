package templates;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class HomeController {
@ModelAttribute

@RequestMapping("/")
public String homepage(Model model){
        model.addAttribute("myvar", "Say Hello to the people.");
        return "hometemplate";
    }
}
