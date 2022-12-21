package ADMIN.ADMINCOVOIT_back.Service;

import ADMIN.ADMINCOVOIT_back.DAO.UtilisateurDAO;
import ADMIN.ADMINCOVOIT_back.Model.Utilisateur;
import ADMIN.ADMINCOVOIT_back.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UtilisateurService {

    private final UtilisateurDAO utilisateurDAO;

    @Autowired
    public UtilisateurService(UtilisateurDAO utilisateurDAO) {
        this.utilisateurDAO = utilisateurDAO;
    }

    public Utilisateur addUtilisateur(Utilisateur utilisateur) {
        return utilisateurDAO.save(utilisateur);
    }

    public List<Utilisateur> findAllUtilisateurs() {
        return utilisateurDAO.findAll();
    }

    public Utilisateur UpdateUtilisateur(Utilisateur utilisateur){
        return utilisateurDAO.save(utilisateur);
    }

    public void deleteUtilisateur(Integer id){
        utilisateurDAO.deleteById(id);
    }

    public Utilisateur findUtilisateurById(Integer id_utilisateur) {
        return utilisateurDAO.findById(id_utilisateur).orElseThrow(() -> new UserNotFoundException("l'id " + id_utilisateur + "inconu " ));
    }


}
