package com.Project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaymentController {
    // i want to hook this up with square let me look more into this
    // they offer other services that could be useful
    @RequestMapping("/paymentPage")
    public String getPaymentPage(){
        return "paymentPage.html";
    }
}

