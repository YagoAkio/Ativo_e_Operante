package unoeste.fipp.ativooperante_be.db.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import unoeste.fipp.ativooperante_be.db.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
