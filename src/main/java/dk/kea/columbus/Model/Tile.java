package dk.kea.columbus.Model;

import javax.persistence.*;

@Entity
@Table(name="tiles")
public class Tile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTile;

    @Column(nullable = true) // idk
    private int xPos;

    @Column(nullable = true) // idk
    private int yPos;

    @Column(nullable = true) // idk
    private boolean tileAtPointOne;

    @Column(nullable = true) // idk
    private boolean tileAtPointTwo;

    @Column(nullable = true) // idk
    private boolean tileAtPointThree;

    @Column(nullable = true) // idk
    private boolean tileAtPointFour;

    @Column(nullable = true) // idk
    private boolean tileAtPointFive;

    @Column(nullable = true) // idk
    private boolean tileAtPointSix;

    @Column(nullable = false) // idk
    private int tileType;

    public Tile() {

    }

    public Tile(int xPos, int yPos, boolean tileAtPointOne, boolean tileAtPointTwo, boolean tileAtPointThree, boolean tileAtPointFour, boolean tileAtPointFive, boolean tileAtPointSix, int tileType) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.tileAtPointOne = tileAtPointOne;
        this.tileAtPointTwo = tileAtPointTwo;
        this.tileAtPointThree = tileAtPointThree;
        this.tileAtPointFour = tileAtPointFour;
        this.tileAtPointFive = tileAtPointFive;
        this.tileAtPointSix = tileAtPointSix;
        this.tileType = tileType;
    }

    public Tile(Long idTile, int xPos, int yPos, boolean tileAtPointOne, boolean tileAtPointTwo, boolean tileAtPointThree, boolean tileAtPointFour, boolean tileAtPointFive, boolean tileAtPointSix, int tileType) {
        this.idTile = idTile;
        this.xPos = xPos;
        this.yPos = yPos;
        this.tileAtPointOne = tileAtPointOne;
        this.tileAtPointTwo = tileAtPointTwo;
        this.tileAtPointThree = tileAtPointThree;
        this.tileAtPointFour = tileAtPointFour;
        this.tileAtPointFive = tileAtPointFive;
        this.tileAtPointSix = tileAtPointSix;
        this.tileType = tileType;
    }

    public Long getIdTile() {
        return idTile;
    }

    public void setIdTile(Long idTile) {
        this.idTile = idTile;
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

    public int getTileType() {
        return tileType;
    }

    public void setTileType(int tileType) {
        this.tileType = tileType;
    }
}

