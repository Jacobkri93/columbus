package dk.kea.columbus.Model;

import javax.persistence.*;

@Entity
@Table(name="tile_types")
public class TileType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tile_type;
    @Column
    private String tile_type_name;
    @Column
    private int movement_points;
    @Column
    private int id_civilisation;

    public TileType(){}

    public TileType(int id_tile_type, String tile_type_name, int movement_points, int id_civilisation) {
        this.id_tile_type = id_tile_type;
        this.tile_type_name = tile_type_name;
        this.movement_points = movement_points;
        this.id_civilisation = id_civilisation;
    }

    public TileType(String tile_type_name, int movement_points, int id_civilisation) {
        this.tile_type_name = tile_type_name;
        this.movement_points = movement_points;
        this.id_civilisation = id_civilisation;
    }

    public int getId_tile_type() {
        return id_tile_type;
    }

    public void setId_tile_type(int id) {
        this.id_tile_type = id;
    }

    public String getTile_type_name() {
        return tile_type_name;
    }

    public void setTile_type_name(String tile_type_name) {
        this.tile_type_name = tile_type_name;
    }

    public int getMovement_points() {
        return movement_points;
    }

    public void setMovement_points(int movement_points) {
        this.movement_points = movement_points;
    }

    public int getId_civilisation() {
        return id_civilisation;
    }

    public void setId_civilisation(int id_civilisation) {
        this.id_civilisation = id_civilisation;
    }
}
