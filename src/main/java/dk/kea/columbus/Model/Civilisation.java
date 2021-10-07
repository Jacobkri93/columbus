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
    private String attitude_player_one;
    @Column
    private String attitude_player_two;
    @Column
    private String attitude_player_three;
    @Column
    private String attitude_player_four;
    @Column
    private int x_pos;
    @Column
    private int y_pos;

    public Civilisation(){}

    public Civilisation(Long id_civilisation, String civilisation_name, String attitude_player_one, String attitude_player_two, String attitude_player_three, String attitude_player_four, int x_pos, int y_pos) {
        this.id_civilisation = id_civilisation;
        this.civilisation_name = civilisation_name;
        this.attitude_player_one = attitude_player_one;
        this.attitude_player_two = attitude_player_two;
        this.attitude_player_three = attitude_player_three;
        this.attitude_player_four = attitude_player_four;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
    }

    public Civilisation(String civilisation_name, String attitude_player_one, String attitude_player_two, String attitude_player_three, String attitude_player_four, int x_pos, int y_pos) {
        this.civilisation_name = civilisation_name;
        this.attitude_player_one = attitude_player_one;
        this.attitude_player_two = attitude_player_two;
        this.attitude_player_three = attitude_player_three;
        this.attitude_player_four = attitude_player_four;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
    }

    public int getX_pos() {
        return x_pos;
    }

    public void setX_pos(int x_pos) {
        this.x_pos = x_pos;
    }

    public int getY_pos() {
        return y_pos;
    }

    public void setY_pos(int y_pos) {
        this.y_pos = y_pos;
    }

    public String getAttitude_player_one() {
        return attitude_player_one;
    }

    public void setAttitude_player_one(String attitude_player_one) {
        this.attitude_player_one = attitude_player_one;
    }

    public String getAttitude_player_two() {
        return attitude_player_two;
    }

    public void setAttitude_player_two(String attitude_player_two) {
        this.attitude_player_two = attitude_player_two;
    }

    public String getAttitude_player_three() {
        return attitude_player_three;
    }

    public void setAttitude_player_three(String attitude_player_three) {
        this.attitude_player_three = attitude_player_three;
    }

    public String getAttitude_player_four() {
        return attitude_player_four;
    }

    public void setAttitude_player_four(String attitude_player_four) {
        this.attitude_player_four = attitude_player_four;
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

    }
