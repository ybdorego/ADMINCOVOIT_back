package ADMIN.ADMINCOVOIT_back.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @Column(name = "id_contact", nullable = false)
    private Integer id;

    @Column(name = "mail_requeteur", length = 100)
    private String mailRequeteur;

    @Column(name = "objet_requete", length = 50)
    private String objetRequete;

    @Column(name = "requete", length = 300)
    private String requete;

    @Column(name = "date_creation", nullable = false)
    private Instant dateCreation;

    @Column(name = "infos", length = 50)
    private String infos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMailRequeteur() {
        return mailRequeteur;
    }

    public void setMailRequeteur(String mailRequeteur) {
        this.mailRequeteur = mailRequeteur;
    }

    public String getObjetRequete() {
        return objetRequete;
    }

    public void setObjetRequete(String objetRequete) {
        this.objetRequete = objetRequete;
    }

    public String getRequete() {
        return requete;
    }

    public void setRequete(String requete) {
        this.requete = requete;
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