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
    @Column
    private int xPos;
    @Column
    private int yPos;

    public Civilisation(){}


    public Civilisation(Long idCivilisation, String civilisationName, String attitudePlayerOne, String attitudePlayerTwo, String attitudePlayerThree, String attitudePlayerFour, int xPos, int yPos) {
        this.idCivilisation = idCivilisation;
        this.civilisationName = civilisationName;
        this.attitudePlayerOne = attitudePlayerOne;
        this.attitudePlayerTwo = attitudePlayerTwo;
        this.attitudePlayerThree = attitudePlayerThree;
        this.attitudePlayerFour = attitudePlayerFour;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public Civilisation(String civilisationName, String attitudePlayerOne, String attitudePlayerTwo, String attitudePlayerThree, String attitudePlayerFour, int xPos, int yPos) {
        this.civilisationName = civilisationName;
        this.attitudePlayerOne = attitudePlayerOne;
        this.attitudePlayerTwo = attitudePlayerTwo;
        this.attitudePlayerThree = attitudePlayerThree;
        this.attitudePlayerFour = attitudePlayerFour;
        this.xPos = xPos;
        this.yPos = yPos;
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

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}
