package unoeste.fipp.ativooperante_be.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unoeste.fipp.ativooperante_be.db.entities.Usuario;
import unoeste.fipp.ativooperante_be.security.JWTTokenProvider;

@RestController
@RequestMapping("apis/")
public class AccessControler {
    @PostMapping("logar")
    ResponseEntity<Object> logar(@RequestBody Usuario usuario)
    {   String token="NAO AUTENTICADO";
        if(usuario.getSenha()==123)
        {
            token= JWTTokenProvider.getToken(usuario.getEmail(),""+usuario.getNivel());
        }
        return ResponseEntity.ok(token);
    }
}
