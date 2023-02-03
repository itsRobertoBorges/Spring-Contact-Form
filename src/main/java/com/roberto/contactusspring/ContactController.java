package com.roberto.contactusspring;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ContactController {

    // This shows the contact form
    @GetMapping("/contact")
    public String showContactForm(ContactForm contactForm) {
        return "contact";
    }

    // Handling the form submission
    @PostMapping("/contact")
    public String submitContactForm(@Valid ContactForm contactForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "error";
        }
        return "success";
    }
}





