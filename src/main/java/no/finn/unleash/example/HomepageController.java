package no.finn.unleash.example;

import javax.servlet.http.HttpServletRequest;

import no.finn.unleash.Unleash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomepageController {

    // Inject Unleash here!

    @RequestMapping("/")
    public String index(Model model, HttpServletRequest request) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String sessionId = request.getSession().getId();
        boolean isLoggedIn = isLoggedIn(auth);
        String userId = isLoggedIn ? auth.getName() : null;

        boolean enabled = false;

        model.addAttribute("userId", userId);
        model.addAttribute("sessionId", sessionId);
        model.addAttribute("awesomeFeature", enabled);
        model.addAttribute("isLoggedIn", isLoggedIn);
        return "homepage";
    }

    private boolean isLoggedIn(Authentication auth) {
        return ! (auth instanceof AnonymousAuthenticationToken);
    }

}
