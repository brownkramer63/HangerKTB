package com.Project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServicesController {
    @RequestMapping("/services")
    public String getServicesPage(){
        return "services.html";
    }

}
