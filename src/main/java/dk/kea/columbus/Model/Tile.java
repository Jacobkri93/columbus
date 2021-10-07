package dk.kea.columbus.Model;

import javax.persistence.*;

@Entity
@Table(name="tiles")
public class Tile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tile;

    @Column(nullable = true) // idk
    private int x_pos;

    @Column(nullable = true) // idk
    private int y_pos;

    @Column(nullable = true) // idk
    private boolean tile_at_point_one;

    @Column(nullable = true) // idk
    private boolean tile_at_point_two;

    @Column(nullable = true) // idk
    private boolean tile_at_point_three;

    @Column(nullable = true) // idk
    private boolean tile_at_point_four;

    @Column(nullable = true) // idk
    private boolean tile_at_point_five;

    @Column(nullable = true) // idk
    private boolean tile_at_point_six;

    @Column(nullable = false) // idk
    private int tile_type;

    public Tile() {

    }

    public Tile(int x_pos, int y_pos, boolean tile_at_point_one, boolean tile_at_point_two, boolean tile_at_point_three, boolean tile_at_point_four, boolean tile_at_point_five, boolean tile_at_point_six, int tile_type, String tile_type_name, int movement_points, int id_civilisation, String civilisation_name, String attitude) {
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.tile_at_point_one = tile_at_point_one;
        this.tile_at_point_two = tile_at_point_two;
        this.tile_at_point_three = tile_at_point_three;
        this.tile_at_point_four = tile_at_point_four;
        this.tile_at_point_five = tile_at_point_five;
        this.tile_at_point_six = tile_at_point_six;
        this.tile_type = tile_type;

    }

    public Tile(Long id_tile, int x_pos, int y_pos, boolean tile_at_point_one, boolean tile_at_point_two, boolean tile_at_point_three, boolean tile_at_point_four, boolean tile_at_point_five, boolean tile_at_point_six, int tile_type, String tile_type_name, int movement_points, int id_civilisation, String civilisation_name, String attitude) {
        this.id_tile = id_tile;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.tile_at_point_one = tile_at_point_one;
        this.tile_at_point_two = tile_at_point_two;
        this.tile_at_point_three = tile_at_point_three;
        this.tile_at_point_four = tile_at_point_four;
        this.tile_at_point_five = tile_at_point_five;
        this.tile_at_point_six = tile_at_point_six;
        this.tile_type = tile_type;

    }

    public Long getId_tile() {
        return id_tile;
    }

    public void setId_tile(Long id) {
        this.id_tile = id;
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

    public boolean isTile_at_point_one() {
        return tile_at_point_one;
    }

    public void setTile_at_point_one(boolean tile_at_point_one) {
        this.tile_at_point_one = tile_at_point_one;
    }

    public boolean isTile_at_point_two() {
        return tile_at_point_two;
    }

    public void setTile_at_point_two(boolean tile_at_point_two) {
        this.tile_at_point_two = tile_at_point_two;
    }

    public boolean isTile_at_point_three() {
        return tile_at_point_three;
    }

    public void setTile_at_point_three(boolean tile_at_point_three) {
        this.tile_at_point_three = tile_at_point_three;
    }

    public boolean isTile_at_point_four() {
        return tile_at_point_four;
    }

    public void setTile_at_point_four(boolean tile_at_point_four) {
        this.tile_at_point_four = tile_at_point_four;
    }

    public boolean isTile_at_point_five() {
        return tile_at_point_five;
    }

    public void setTile_at_point_five(boolean tile_at_point_five) {
        this.tile_at_point_five = tile_at_point_five;
    }

    public boolean isTile_at_point_six() {
        return tile_at_point_six;
    }

    public void setTile_at_point_six(boolean tile_at_point_six) {
        this.tile_at_point_six = tile_at_point_six;
    }

    public int getTile_type() {
        return tile_type;
    }

    public void setTile_type(int tile_type) {
        this.tile_type = tile_type;
    }


    @Override
    public String toString() {
        return "Tile{" +
                "id=" + id_tile +
                ", x_pos=" + x_pos +
                ", y_pos=" + y_pos +
                ", tile_at_point_one=" + tile_at_point_one +
                ", tile_at_point_two=" + tile_at_point_two +
                ", tile_at_point_three=" + tile_at_point_three +
                ", tile_at_point_four=" + tile_at_point_four +
                ", tile_at_point_five=" + tile_at_point_five +
                ", tile_at_point_six=" + tile_at_point_six +
                ", tile_type=" + tile_type +
                '}';
    }
}