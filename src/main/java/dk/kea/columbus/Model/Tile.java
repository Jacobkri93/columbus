package dk.kea.columbus.Model;

import javax.persistence.*;

@Entity
@Table(name="tiles")
public class Tile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTile;

    @Column(name = "x_pos") // idk
    private int tileXPos;

    @Column(name = "y_pos") // idk
    private int tileYPos;

    @Column(nullable = true, name = "tile_at_point_one") // idk
    private String tileAtPointOne;

    @Column(nullable = true, name = "tile_at_point_two") // idk
    private String tileAtPointTwo;

    @Column(nullable = true, name = "tile_at_point_three") // idk
    private String tileAtPointThree;

    @Column(nullable = true, name = "tile_at_point_four") // idk
    private String tileAtPointFour;

    @Column(nullable = true, name = "tile_at_point_five") // idk
    private String tileAtPointFive;

    @Column(nullable = true, name = "tile_at_point_six") // idk
    private String tileAtPointSix;

    @Column(nullable = false, name = "id_tile_type") // idk
    private int idTileType;

    public Tile() {

    }

    public Tile(int tileXPos, int tileYPos, String tileAtPointOne, String tileAtPointTwo, String tileAtPointThree, String tileAtPointFour, String tileAtPointFive, String tileAtPointSix, int idTileType) {
        this.tileXPos = tileXPos;
        this.tileYPos = tileYPos;
        this.tileAtPointOne = tileAtPointOne;
        this.tileAtPointTwo = tileAtPointTwo;
        this.tileAtPointThree = tileAtPointThree;
        this.tileAtPointFour = tileAtPointFour;
        this.tileAtPointFive = tileAtPointFive;
        this.tileAtPointSix = tileAtPointSix;
        this.idTileType = idTileType;
    }

    public Tile(Long idTile, int tileXPos, int tileYPos, String tileAtPointOne, String tileAtPointTwo, String tileAtPointThree, String tileAtPointFour, String tileAtPointFive, String tileAtPointSix, int idTileType) {
        this.idTile = idTile;
        this.tileXPos = tileXPos;
        this.tileYPos = tileYPos;
        this.tileAtPointOne = tileAtPointOne;
        this.tileAtPointTwo = tileAtPointTwo;
        this.tileAtPointThree = tileAtPointThree;
        this.tileAtPointFour = tileAtPointFour;
        this.tileAtPointFive = tileAtPointFive;
        this.tileAtPointSix = tileAtPointSix;
        this.idTileType = idTileType;
    }

    public Long getIdTile() {
        return idTile;
    }

    public void setIdTile(Long idTile) {
        this.idTile = idTile;
    }

    public int getTileXPos() {
        return tileXPos;
    }

    public void setTileXPos(int tileXPos) {
        this.tileXPos = tileXPos;
    }

    public int getTileYPos() {
        return tileYPos;
    }

    public void setTileYPos(int tileYPos) {
        this.tileYPos = tileYPos;
    }

    public String getTileAtPointOne() {
        return tileAtPointOne;
    }

    public void setTileAtPointOne(String tileAtPointOne) {
        this.tileAtPointOne = tileAtPointOne;
    }

    public String getTileAtPointTwo() {
        return tileAtPointTwo;
    }

    public void setTileAtPointTwo(String tileAtPointTwo) {
        this.tileAtPointTwo = tileAtPointTwo;
    }

    public String getTileAtPointThree() {
        return tileAtPointThree;
    }

    public void setTileAtPointThree(String tileAtPointThree) {
        this.tileAtPointThree = tileAtPointThree;
    }

    public String getTileAtPointFour() {
        return tileAtPointFour;
    }

    public void setTileAtPointFour(String tileAtPointFour) {
        this.tileAtPointFour = tileAtPointFour;
    }

    public String getTileAtPointFive() {
        return tileAtPointFive;
    }

    public void setTileAtPointFive(String tileAtPointFive) {
        this.tileAtPointFive = tileAtPointFive;
    }

    public String getTileAtPointSix() {
        return tileAtPointSix;
    }

    public void setTileAtPointSix(String tileAtPointSix) {
        this.tileAtPointSix = tileAtPointSix;
    }

    public int getIdTileType() {
        return idTileType;
    }

    public void setIdTileType(int idTileType) {
        this.idTileType = idTileType;
    }
}

