package dk.kea.columbus.Model;

import javax.persistence.*;

@Entity
@Table(name="temp_exp_tiles")
public class Temp_Exp_Tile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_temp_exp_tiles;
    @Column
    private int x_pos;
    @Column
    private int y_pos;
    @Column
    private int id_player;

    public Temp_Exp_Tile(){
    }

    public Temp_Exp_Tile(Long id_temp_exp_tiles, int x_pos, int y_pos, int id_player) {
        this.id_temp_exp_tiles = id_temp_exp_tiles;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.id_player = id_player;
    }

    public Temp_Exp_Tile(int x_pos, int y_pos, int id_player) {
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.id_player = id_player;
    }

    public Long getId_temp_exp_tiles() {
        return id_temp_exp_tiles;
    }

    public void setId_temp_exp_tiles(Long id_temp_exp_tiles) {
        this.id_temp_exp_tiles = id_temp_exp_tiles;
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

    public int getId_player() {
        return id_player;
    }

    public void setId_player(int id_player) {
        this.id_player = id_player;
    }
}
