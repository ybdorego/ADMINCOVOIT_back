package ADMIN.ADMINCOVOIT_back.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "etapes")
public class Etape {
    @Id
    @Column(name = "id_etape", nullable = false)
    private Integer id;

    @Column(name = "latitude_etape", nullable = false)
    private Float latitudeEtape;

    @Column(name = "longitude_etape", nullable = false)
    private Float longitudeEtape;

    @Column(name = "date_creation")
    private Instant dateCreation;

    @Column(name = "infos", length = 50)
    private String infos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_trajet")
    private Trajet idTrajet;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getLatitudeEtape() {
        return latitudeEtape;
    }

    public void setLatitudeEtape(Float latitudeEtape) {
        this.latitudeEtape = latitudeEtape;
    }

    public Float getLongitudeEtape() {
        return longitudeEtape;
    }

    public void setLongitudeEtape(Float longitudeEtape) {
        this.longitudeEtape = longitudeEtape;
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

    public Trajet getIdTrajet() {
        return idTrajet;
    }

    public void setIdTrajet(Trajet idTrajet) {
        this.idTrajet = idTrajet;
    }

}