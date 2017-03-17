package org.unleash;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model, HttpServletRequest request) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String sessionId = request.getSession().getId();
        boolean isLoggedIn = isLoggedIn(auth);
        String userId = isLoggedIn ? auth.getName() : null;

        boolean enabled = false;

        model.addAttribute("userId", userId);
        model.addAttribute("sessionId", sessionId);
        model.addAttribute("toggle", enabled);
        model.addAttribute("isLoggedIn", isLoggedIn);
        return "home";
    }

    private boolean isLoggedIn(Authentication auth) {
        return ! (auth instanceof AnonymousAuthenticationToken);
    }

}
