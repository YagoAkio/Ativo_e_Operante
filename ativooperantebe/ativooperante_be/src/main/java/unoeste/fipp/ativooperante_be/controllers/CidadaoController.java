package unoeste.fipp.ativooperante_be.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unoeste.fipp.ativooperante_be.services.OrgaoService;

@RequestMapping("apis/cidadao")
@RestController
public class CidadaoController {
    @Autowired
    OrgaoService orgaoService;

    @GetMapping("get-all-orgaos")
    ResponseEntity<Object> getAllOrgaos()
    {
        return ResponseEntity.ok(orgaoService.getAll());
    }
}
