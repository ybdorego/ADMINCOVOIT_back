package ADMIN.ADMINCOVOIT_back.DAO;

import ADMIN.ADMINCOVOIT_back.Model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtilisateurDAO extends JpaRepository<Utilisateur, Integer> {

    @Override
    Optional<Utilisateur> findById(Integer id);



}
