package dk.kea.columbus.Model;

import javax.persistence.*;

@Entity
@Table(name="civilisations")
public class Civilisation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_civilisation;
    @Column
    private String civilisation_name;
    @Column
    private String attitude;

    public Civilisation(){}

    public Civilisation(Long id_civilisation, String civilisation_name, String attitude) {
        this.id_civilisation = id_civilisation;
        this.civilisation_name = civilisation_name;
        this.attitude = attitude;
    }

    public Long getId_civilisation() {
        return id_civilisation;
    }

    public void setId_civilisation(Long id_civilisation) {
        this.id_civilisation = id_civilisation;
    }

    public String getCivilisation_name() {
        return civilisation_name;
    }

    public void setCivilisation_name(String civilisation_name) {
        this.civilisation_name = civilisation_name;
    }

    public String getAttitude() {
        return attitude;
    }

    public void setAttitude(String attitude) {
        this.attitude = attitude;
    }
}
