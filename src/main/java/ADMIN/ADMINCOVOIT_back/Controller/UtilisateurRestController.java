package ADMIN.ADMINCOVOIT_back.Controller;

import ADMIN.ADMINCOVOIT_back.Model.Utilisateur;

import ADMIN.ADMINCOVOIT_back.Service.UtilisateurService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
/*import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;*/

import java.util.List;
///import java.util.Optional;

@RestController
@RequestMapping("/utilisateur")
/*@CrossOrigin("*")*/
public class UtilisateurRestController {

    private final UtilisateurService utilisateurService;

    public UtilisateurRestController( UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @GetMapping
    public ResponseEntity<List<Utilisateur>> getallUtulisateur () {
        List<Utilisateur> utilisateurs =  utilisateurService.findAllUtilisateurs();
        return new ResponseEntity<>(utilisateurs, HttpStatus.OK);
    }

    @GetMapping("/find/{id_utilisateur}")
    public ResponseEntity<Utilisateur> getUtilisateurbyId (@PathVariable("id_utilisateur") Integer id_utilisateur) {
        Utilisateur utilisateur = utilisateurService.findUtilisateurById(id_utilisateur);
        return new ResponseEntity<>(utilisateur, HttpStatus.OK);
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<Utilisateur> findUtilisateurByMail (@PathVariable("email") String email) {
        Utilisateur utilisateur = utilisateurService.findUtilisateurByEmail(email);
        return new ResponseEntity<>(utilisateur, HttpStatus.OK);
    }@GetMapping("/email2/{email}")
    public ResponseEntity<Utilisateur> rechercheUtilisateurByEmail (@PathVariable("email") String email) {
        Utilisateur utilisateur = utilisateurService.rechercheUtilisateurByEmail(email);
        return new ResponseEntity<>(utilisateur, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Utilisateur> addUtilisateur (@RequestBody Utilisateur utilisateur){
        Utilisateur newutilisateur = utilisateurService.addUtilisateur(utilisateur);
        return new ResponseEntity<>(newutilisateur, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Utilisateur> updateUtilisateur(@RequestBody Utilisateur utilisateur){
        Utilisateur updatedUtilisateur = utilisateurService.UpdateUtilisateur(utilisateur);
        return new ResponseEntity<>(updatedUtilisateur, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id_utilisateur}")
    public ResponseEntity<?> deleteUtilisateurById(@PathVariable("id_utilisateur") Integer id_utilisateur){
         utilisateurService.deleteUtilisateur(id_utilisateur);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
