package br.com.springdockerterraformaws.contactook.service.interfaces;

import br.com.springdockerterraformaws.contactook.entity.Contact;

import java.util.Optional;

public interface ContactbookService {
    Contact save(Contact contact);

    Optional<Contact> getByName(String name);
}