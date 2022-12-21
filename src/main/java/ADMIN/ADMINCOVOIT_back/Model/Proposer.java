package ADMIN.ADMINCOVOIT_back.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "proposer")
public class Proposer {
    @Id
    @Column(name = "id_proposition", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_utilisateur", nullable = false)
    private Utilisateur idUtilisateur;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_trajet", nullable = false)
    private Trajet idTrajet;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_vehicule", nullable = false)
    private Vehicule idVehicule;

    @Column(name = "nb_places")
    private Integer nbPlaces;

    @Column(name = "date_proposition")
    private Instant dateProposition;

    @Column(name = "infos", length = 50)
    private String infos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Utilisateur getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Utilisateur idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public Trajet getIdTrajet() {
        return idTrajet;
    }

    public void setIdTrajet(Trajet idTrajet) {
        this.idTrajet = idTrajet;
    }

    public Vehicule getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(Vehicule idVehicule) {
        this.idVehicule = idVehicule;
    }

    public Integer getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(Integer nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public Instant getDateProposition() {
        return dateProposition;
    }

    public void setDateProposition(Instant dateProposition) {
        this.dateProposition = dateProposition;
    }

    public String getInfos() {
        return infos;
    }

    public void setInfos(String infos) {
        this.infos = infos;
    }

}