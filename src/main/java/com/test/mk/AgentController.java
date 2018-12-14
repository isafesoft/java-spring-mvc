package com.test.mk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AgentController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "agent-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "agent-result";
    }

    @RequestMapping("/processForm2")
    public String modelTest(HttpServletRequest request, Model model) {
        String name = request.getParameter("agentName");
        name = name.toUpperCase();
        String res = "Responded, " + name;

        // add message to the model
        model.addAttribute("message", res);
        return "process-model";
    }
}
