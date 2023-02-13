package br.com.springdockerterraformaws.contactook.service.client;

import br.com.springdockerterraformaws.contactook.service.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viaCep", path = "${viacep.endpoint}")
public interface ViaCepClient {

    @GetMapping(value = "/{cep}/json")
    AddressResponse getAddress(@PathVariable(value = "cep") String cep);
}