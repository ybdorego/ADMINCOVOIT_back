package ADMIN.ADMINCOVOIT_back.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "messages")
public class Message {
    @Id
    @Column(name = "id_message", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_recepteur", nullable = false)
    private Utilisateur idRecepteur;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_emetteur", nullable = false)
    private Utilisateur idEmetteur;

    @Column(name = "message", length = 300)
    private String message;

    @Column(name = "date_heure_message", nullable = false)
    private Instant dateHeureMessage;

    @Column(name = "vu")
    private Integer vu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Utilisateur getIdRecepteur() {
        return idRecepteur;
    }

    public void setIdRecepteur(Utilisateur idRecepteur) {
        this.idRecepteur = idRecepteur;
    }

    public Utilisateur getIdEmetteur() {
        return idEmetteur;
    }

    public void setIdEmetteur(Utilisateur idEmetteur) {
        this.idEmetteur = idEmetteur;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Instant getDateHeureMessage() {
        return dateHeureMessage;
    }

    public void setDateHeureMessage(Instant dateHeureMessage) {
        this.dateHeureMessage = dateHeureMessage;
    }

    public Integer getVu() {
        return vu;
    }

    public void setVu(Integer vu) {
        this.vu = vu;
    }

}