package ADMIN.ADMINCOVOIT_back.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "reserver")
public class Reserver {
    @Id
    @Column(name = "id_reservation", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_utilisateur", nullable = false)
    private Utilisateur idUtilisateur;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_trajet", nullable = false)
    private Trajet idTrajet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_etape")
    private Etape idEtape;

    @Column(name = "acceptation")
    private Integer acceptation;

    @Column(name = "date_reservation")
    private Instant dateReservation;

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

    public Etape getIdEtape() {
        return idEtape;
    }

    public void setIdEtape(Etape idEtape) {
        this.idEtape = idEtape;
    }

    public Integer getAcceptation() {
        return acceptation;
    }

    public void setAcceptation(Integer acceptation) {
        this.acceptation = acceptation;
    }

    public Instant getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Instant dateReservation) {
        this.dateReservation = dateReservation;
    }

    public String getInfos() {
        return infos;
    }

    public void setInfos(String infos) {
        this.infos = infos;
    }

}