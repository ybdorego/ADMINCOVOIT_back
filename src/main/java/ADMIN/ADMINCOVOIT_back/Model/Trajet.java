package ADMIN.ADMINCOVOIT_back.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "trajets")
public class Trajet {
    @Id
    @Column(name = "id_trajet", nullable = false)
    private Integer id;

    @Column(name = "depart", length = 150)
    private String depart;

    @Column(name = "latitude_depart", nullable = false)
    private Float latitudeDepart;

    @Column(name = "longitude_depart", nullable = false)
    private Float longitudeDepart;

    @Column(name = "arrivee", length = 150)
    private String arrivee;

    @Column(name = "latitude_arrivee", nullable = false)
    private Float latitudeArrivee;

    @Column(name = "longitude_arrivee", nullable = false)
    private Float longitudeArrivee;

    @Column(name = "date_heure_trajet", nullable = false)
    private Instant dateHeureTrajet;

    @Column(name = "date_heure_arrivee", nullable = false)
    private Instant dateHeureArrivee;

    @Column(name = "acceptation_auto")
    private Integer acceptationAuto;

    @Column(name = "manger")
    private Integer manger;

    @Column(name = "fumer")
    private Integer fumer;

    @Column(name = "musique")
    private Integer musique;

    @Column(name = "masque", nullable = false)
    private Integer masque;

    @Column(name = "date_creation")
    private Instant dateCreation;

    @Column(name = "infos", length = 50)
    private String infos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public Float getLatitudeDepart() {
        return latitudeDepart;
    }

    public void setLatitudeDepart(Float latitudeDepart) {
        this.latitudeDepart = latitudeDepart;
    }

    public Float getLongitudeDepart() {
        return longitudeDepart;
    }

    public void setLongitudeDepart(Float longitudeDepart) {
        this.longitudeDepart = longitudeDepart;
    }

    public String getArrivee() {
        return arrivee;
    }

    public void setArrivee(String arrivee) {
        this.arrivee = arrivee;
    }

    public Float getLatitudeArrivee() {
        return latitudeArrivee;
    }

    public void setLatitudeArrivee(Float latitudeArrivee) {
        this.latitudeArrivee = latitudeArrivee;
    }

    public Float getLongitudeArrivee() {
        return longitudeArrivee;
    }

    public void setLongitudeArrivee(Float longitudeArrivee) {
        this.longitudeArrivee = longitudeArrivee;
    }

    public Instant getDateHeureTrajet() {
        return dateHeureTrajet;
    }

    public void setDateHeureTrajet(Instant dateHeureTrajet) {
        this.dateHeureTrajet = dateHeureTrajet;
    }

    public Instant getDateHeureArrivee() {
        return dateHeureArrivee;
    }

    public void setDateHeureArrivee(Instant dateHeureArrivee) {
        this.dateHeureArrivee = dateHeureArrivee;
    }

    public Integer getAcceptationAuto() {
        return acceptationAuto;
    }

    public void setAcceptationAuto(Integer acceptationAuto) {
        this.acceptationAuto = acceptationAuto;
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

}