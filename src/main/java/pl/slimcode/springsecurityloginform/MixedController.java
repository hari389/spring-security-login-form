package pl.slimcode.springsecurityloginform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MixedController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/secured")
    public String secured() {
        return "secured";
    }
}
