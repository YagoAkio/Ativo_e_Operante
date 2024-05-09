package unoeste.fipp.ativooperante_be.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unoeste.fipp.ativooperante_be.db.entities.Denuncia;
import unoeste.fipp.ativooperante_be.db.repositories.DenunciaRepository;

import java.util.List;

@Service
public class DenunciaService {
    @Autowired
    DenunciaRepository denucia;

    public List<Denuncia> getAll(){
        return denucia.findAll();
    }
}
