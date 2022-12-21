package ADMIN.ADMINCOVOIT_back.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "utilisateurs")
public class Utilisateur  implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_utilisateur", nullable = false)
    private Integer id_utilisateur;

    @Column(name = "nom", nullable = false, length = 50)
    private String nom;

    @Column(name = "prenom", nullable = false, length = 50)
    private String prenom;

    @Column(name = "telephone", length = 10)
    private String telephone;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "mdp", nullable = false)
    private String mdp;

    @Column(name = "presentation", length = 300)
    private String presentation;

    @Column(name = "lien_image", nullable = false, length = 150)
    private String lienImage;

    @Column(name = "manger")
    private Integer manger;

    @Column(name = "fumer")
    private Integer fumer;

    @Column(name = "musique")
    private Integer musique;

    @Column(name = "masque", nullable = false)
    private Integer masque;

    @Column(name = "afficher_numero", nullable = false)
    private Integer afficher_Numero;

    @Column(name = "statut", length = 10)
    private String statut;

    @Column(name = "date_creation")
    private Instant dateCreation;

    @Column(name = "infos", length = 50)
    private String infos;

    public Utilisateur() {
    }

    public Utilisateur(Integer id_utilisateur, String nom, String prenom, String telephone, String email, String mdp, Instant dateCreation) {
        this.id_utilisateur = id_utilisateur;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.mdp = mdp;
        this.dateCreation = dateCreation;
    }

    public Integer getid_utilisateur() {
        return id_utilisateur;
    }

    public void setid_utilisateur(Integer id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getLienImage() {
        return lienImage;
    }

    public void setLienImage(String lienImage) {
        this.lienImage = lienImage;
    }

    public Integer getManger() {
        return manger;
    }

    public void setManger(Integer manger) {
        this.manger = manger;
    }

    public Integer getFumer() {
        return fumer;
    }

    public void setFumer(Integer fumer) {
        this.fumer = fumer;
    }

    public Integer getMusique() {
        return musique;
    }

    public void setMusique(Integer musique) {
        this.musique = musique;
    }

    public Integer getMasque() {
        return masque;
    }

    public void setMasque(Integer masque) {
        this.masque = masque;
    }

    public Integer getAfficher_Numero() {
        return afficher_Numero;
    }

    public void setAfficherNumero(Integer afficherNumero) {
        this.afficher_Numero = afficherNumero;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Instant getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Instant dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getInfos() {
        return infos;
    }

    public void setInfos(String infos) {
        this.infos = infos;
    }

//    @Override
//    public String toString() {
//        return "Utilisateur{" +
//                "id=" + id +
//                ", nom='" + nom + '\'' +
//                ", prenom='" + prenom + '\'' +
//                ", telephone='" + telephone + '\'' +
//                ", email='" + email + '\'' +
//                ", mdp='" + mdp + '\'' +
//                ", presentation='" + presentation + '\'' +
//                ", lienImage='" + lienImage + '\'' +
//                ", manger=" + manger +
//                ", fumer=" + fumer +
//                ", musique=" + musique +
//                ", masque=" + masque +
//                ", afficherNumero=" + afficherNumero +
//                ", statut='" + statut + '\'' +
//                ", dateCreation=" + dateCreation +
//                ", infos='" + infos + '\'' +
//                '}';
//    }

}