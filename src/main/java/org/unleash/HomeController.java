package org.unleash;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(@RequestParam(value="userId", required=false, defaultValue="unknown") String userId, Model model, HttpServletRequest request) {
        String sessionId = request.getSession().getId();

        boolean enabled = false;

        model.addAttribute("userId", userId);
        model.addAttribute("sessionId", sessionId);
        model.addAttribute("toggle", enabled);
        return "unleash";
    }

}
