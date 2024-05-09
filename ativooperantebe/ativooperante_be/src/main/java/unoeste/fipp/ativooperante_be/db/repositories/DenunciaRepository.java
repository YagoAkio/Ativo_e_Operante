package unoeste.fipp.ativooperante_be.db.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import unoeste.fipp.ativooperante_be.db.entities.Denuncia;
import unoeste.fipp.ativooperante_be.db.entities.Usuario;

import java.util.List;

public interface DenunciaRepository extends JpaRepository<Denuncia,Long> {
    public List<Denuncia> findAllByUsuario(Usuario usuario);
}

