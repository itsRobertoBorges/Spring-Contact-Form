package com.roberto.contactusspring;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class ContactForm {
    //This annotation ensures tht the input is not empty
    @NotEmpty
    private String name;
    //This ensures that the input will have a valid email
    @Email
    @NotEmpty
    private String email;
    @NotEmpty
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
