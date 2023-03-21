package com.Project.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String getloginPage(){
        return "login.html";
    }




//        @GetMapping("/list")
//        public String clientVendorList(Model model){
//            List<ClientVendorDTO> clientVendors= clientVendorService.listAllClientVendors();
//            model.addAttribute("clientVendors",clientVendors);
//            return "clientVendor/clientVendor-list";
//            //should be good
//        }
}
