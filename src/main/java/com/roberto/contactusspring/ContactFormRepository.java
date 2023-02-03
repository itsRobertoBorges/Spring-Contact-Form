package com.roberto.contactusspring;

import com.roberto.contactusspring.ContactForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.roberto.contactusspring.ContactForm;

@Repository
public interface ContactFormRepository extends JpaRepository<ContactForm, Long> {

}
