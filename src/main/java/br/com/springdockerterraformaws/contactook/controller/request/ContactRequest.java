package br.com.springdockerterraformaws.contactook.controller.request;

import br.com.springdockerterraformaws.contactook.entity.Contact;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContactRequest {
    private String name;
    private String phone;
    private String cep;
    private Integer numero;

    public Contact toEntity() {
        return Contact.builder()
                .name(name)
                .phone(phone)
                .cep(cep)
                .numero(numero)
                .build();
    }
}