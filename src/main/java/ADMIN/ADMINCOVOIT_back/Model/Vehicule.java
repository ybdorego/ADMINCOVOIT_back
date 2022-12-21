package ADMIN.ADMINCOVOIT_back.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "vehicules")
public class Vehicule {
    @Id
    @Column(name = "id_vehicule", nullable = false)
    private Integer id;

    @Column(name = "marque", length = 30)
    private String marque;

    @Column(name = "modele", length = 30)
    private String modele;

    @Column(name = "couleur", length = 10)
    private String couleur;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_proprietaire", nullable = false)
    private Utilisateur idProprietaire;

    @Column(name = "date_creation")
    private Instant dateCreation;

    @Column(name = "infos", length = 50)
    private String infos;

    public Vehicule() {
    }

    public Vehicule(Integer id, String marque, String modele, String couleur, Utilisateur idProprietaire, Instant dateCreation, String infos) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
        this.idProprietaire = idProprietaire;
        this.dateCreation = dateCreation;
        this.infos = infos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Utilisateur getIdProprietaire() {
        return idProprietaire;
    }

    public void setIdProprietaire(Utilisateur idProprietaire) {
        this.idProprietaire = idProprietaire;
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


    @Override
    public String toString() {
        return "Vehicule{" +
                "id=" + id +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", couleur='" + couleur + '\'' +
                ", idProprietaire=" + idProprietaire +
                ", dateCreation=" + dateCreation +
                ", infos='" + infos + '\'' +
                '}';
    }
}