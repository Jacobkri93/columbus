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
    private boolean tileAtPointOne;

    @Column(nullable = true, name = "tile_at_point_two") // idk
    private boolean tileAtPointTwo;

    @Column(nullable = true, name = "tile_at_point_three") // idk
    private boolean tileAtPointThree;

    @Column(nullable = true, name = "tile_at_point_four") // idk
    private boolean tileAtPointFour;

    @Column(nullable = true, name = "tile_at_point_five") // idk
    private boolean tileAtPointFive;

    @Column(nullable = true, name = "tile_at_point_six") // idk
    private boolean tileAtPointSix;

    @Column(nullable = false, name = "id_tile_type") // idk
    private int idTileType;

    public Tile() {

    }

    public Tile(int tileXPos, int tileYPos, boolean tileAtPointOne, boolean tileAtPointTwo, boolean tileAtPointThree, boolean tileAtPointFour, boolean tileAtPointFive, boolean tileAtPointSix, int idTileType) {
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

    public Tile(Long idTile, int tileXPos, int tileYPos, boolean tileAtPointOne, boolean tileAtPointTwo, boolean tileAtPointThree, boolean tileAtPointFour, boolean tileAtPointFive, boolean tileAtPointSix, int idTileType) {
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

    public boolean isTileAtPointOne() {
        return tileAtPointOne;
    }

    public void setTileAtPointOne(boolean tileAtPointOne) {
        this.tileAtPointOne = tileAtPointOne;
    }

    public boolean isTileAtPointTwo() {
        return tileAtPointTwo;
    }

    public void setTileAtPointTwo(boolean tileAtPointTwo) {
        this.tileAtPointTwo = tileAtPointTwo;
    }

    public boolean isTileAtPointThree() {
        return tileAtPointThree;
    }

    public void setTileAtPointThree(boolean tileAtPointThree) {
        this.tileAtPointThree = tileAtPointThree;
    }

    public boolean isTileAtPointFour() {
        return tileAtPointFour;
    }

    public void setTileAtPointFour(boolean tileAtPointFour) {
        this.tileAtPointFour = tileAtPointFour;
    }

    public boolean isTileAtPointFive() {
        return tileAtPointFive;
    }

    public void setTileAtPointFive(boolean tileAtPointFive) {
        this.tileAtPointFive = tileAtPointFive;
    }

    public boolean isTileAtPointSix() {
        return tileAtPointSix;
    }

    public void setTileAtPointSix(boolean tileAtPointSix) {
        this.tileAtPointSix = tileAtPointSix;
    }

    public int getIdTileType() {
        return idTileType;
    }

    public void setIdTileType(int idTileType) {
        this.idTileType = idTileType;
    }
}

