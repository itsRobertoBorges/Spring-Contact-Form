package com.roberto.contactusspring;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;

@Entity
@Table
public class ContactForm {
    @jakarta.persistence.Id
    @Id
        @SequenceGenerator(
                name = "contact_sequence",
                sequenceName = "contact_sequence",
                allocationSize = 1
        )
        @GeneratedValue(
                strategy = GenerationType.SEQUENCE,
                generator = "contact_sequence"
        )
    private long id;
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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
