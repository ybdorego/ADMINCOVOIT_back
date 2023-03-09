package ADMIN.ADMINCOVOIT_back.DAO;

import ADMIN.ADMINCOVOIT_back.Model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UtilisateurDAO extends JpaRepository<Utilisateur, Integer> {

    @Override
    Optional<Utilisateur> findById(Integer id);


    Optional<Utilisateur> findUtilisateurByEmail(String mail);
    @Query(value = "SELECT * FROM utilisateurs u WHERE u.email = :email and statut = 'admin'", nativeQuery = true)
    Optional<Utilisateur> rechercheByMail(@Param("email") String email);
}
