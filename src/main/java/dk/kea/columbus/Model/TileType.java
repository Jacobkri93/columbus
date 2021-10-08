package dk.kea.columbus.Model;

import javax.persistence.*;

@Entity
@Table(name="tile_types")
public class TileType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTileType;
    @Column
    private String tileTypeName;
    @Column
    private int movementPoints;
    @Column
    private int idCivilisation;

    public TileType(){}

    public TileType(Long idTileType, String tileTypeName, int movementPoints, int idCivilisation) {
        this.idTileType = idTileType;
        this.tileTypeName = tileTypeName;
        this.movementPoints = movementPoints;
        this.idCivilisation = idCivilisation;
    }

    public TileType(String tileTypeName, int movementPoints, int idCivilisation) {
        this.tileTypeName = tileTypeName;
        this.movementPoints = movementPoints;
        this.idCivilisation = idCivilisation;
    }

    public Long getIdTileType() {
        return idTileType;
    }

    public void setIdTileType(Long idTileType) {
        this.idTileType = idTileType;
    }

    public String getTileTypeName() {
        return tileTypeName;
    }

    public void setTileTypeName(String tileTypeName) {
        this.tileTypeName = tileTypeName;
    }

    public int getMovementPoints() {
        return movementPoints;
    }

    public void setMovementPoints(int movementPoints) {
        this.movementPoints = movementPoints;
    }

    public int getIdCivilisation() {
        return idCivilisation;
    }

    public void setIdCivilisation(int idCivilisation) {
        this.idCivilisation = idCivilisation;
    }
}
