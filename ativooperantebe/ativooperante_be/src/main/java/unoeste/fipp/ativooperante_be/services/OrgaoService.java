package unoeste.fipp.ativooperante_be.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unoeste.fipp.ativooperante_be.db.entities.Orgao;
import unoeste.fipp.ativooperante_be.db.repositories.OrgaoRepository;

import java.util.List;

@Service
public class OrgaoService {
    @Autowired
    OrgaoRepository repo;
    public List<Orgao> getAll()
    {
        return repo.findAll();
    }

}
