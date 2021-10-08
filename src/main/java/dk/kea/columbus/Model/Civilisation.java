package dk.kea.columbus.Model;

import javax.persistence.*;

@Entity
@Table(name="civilisations")
public class Civilisation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCivilisation;
    @Column
    private String civilisationName;
    @Column
    private String attitudePlayerOne;
    @Column
    private String attitudePlayerTwo;
    @Column
    private String attitudePlayerThree;
    @Column
    private String attitudePlayerFour;
    @Column(name = "x_pos")
    private int civXPos;
    @Column(name = "y_pos")
    private int civYPos;

    public Civilisation(){}


    public Civilisation(Long idCivilisation, String civilisationName, String attitudePlayerOne, String attitudePlayerTwo, String attitudePlayerThree, String attitudePlayerFour, int civXPos, int civYPos) {
        this.idCivilisation = idCivilisation;
        this.civilisationName = civilisationName;
        this.attitudePlayerOne = attitudePlayerOne;
        this.attitudePlayerTwo = attitudePlayerTwo;
        this.attitudePlayerThree = attitudePlayerThree;
        this.attitudePlayerFour = attitudePlayerFour;
        this.civXPos = civXPos;
        this.civYPos = civYPos;
    }

    public Civilisation(String civilisationName, String attitudePlayerOne, String attitudePlayerTwo, String attitudePlayerThree, String attitudePlayerFour, int civXPos, int civYPos) {
        this.civilisationName = civilisationName;
        this.attitudePlayerOne = attitudePlayerOne;
        this.attitudePlayerTwo = attitudePlayerTwo;
        this.attitudePlayerThree = attitudePlayerThree;
        this.attitudePlayerFour = attitudePlayerFour;
        this.civXPos = civXPos;
        this.civYPos = civYPos;
    }

    public Long getIdCivilisation() {
        return idCivilisation;
    }

    public void setIdCivilisation(Long idCivilisation) {
        this.idCivilisation = idCivilisation;
    }

    public String getCivilisationName() {
        return civilisationName;
    }

    public void setCivilisationName(String civilisationName) {
        this.civilisationName = civilisationName;
    }

    public String getAttitudePlayerOne() {
        return attitudePlayerOne;
    }

    public void setAttitudePlayerOne(String attitudePlayerOne) {
        this.attitudePlayerOne = attitudePlayerOne;
    }

    public String getAttitudePlayerTwo() {
        return attitudePlayerTwo;
    }

    public void setAttitudePlayerTwo(String attitudePlayerTwo) {
        this.attitudePlayerTwo = attitudePlayerTwo;
    }

    public String getAttitudePlayerThree() {
        return attitudePlayerThree;
    }

    public void setAttitudePlayerThree(String attitudePlayerThree) {
        this.attitudePlayerThree = attitudePlayerThree;
    }

    public String getAttitudePlayerFour() {
        return attitudePlayerFour;
    }

    public void setAttitudePlayerFour(String attitudePlayerFour) {
        this.attitudePlayerFour = attitudePlayerFour;
    }

    public int getCivXPos() {
        return civXPos;
    }

    public void setCivXPos(int civXPos) {
        this.civXPos = civXPos;
    }

    public int getCivYPos() {
        return civYPos;
    }

    public void setCivYPos(int civYPos) {
        this.civYPos = civYPos;
    }
}
