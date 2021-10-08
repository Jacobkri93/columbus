package dk.kea.columbus.Model;

import javax.persistence.*;

@Entity
@Table(name="temp_exp_tiles")
public class TempExpTile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTempExpFile;
    @Column
    private int xPos;
    @Column
    private int yPos;
    @Column
    private int idPlayer;

    public TempExpTile(){
    }

    public TempExpTile(int xPos, int yPos, int idPlayer) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.idPlayer = idPlayer;
    }

    public TempExpTile(Long idTempExpFile, int xPos, int yPos, int idPlayer) {
        this.idTempExpFile = idTempExpFile;
        this.xPos = xPos;
        this.yPos = yPos;
        this.idPlayer = idPlayer;
    }
//
    public Long getIdTempExpFile() {
        return idTempExpFile;
    }

    public void setIdTempExpFile(Long idTempExpFile) {
        this.idTempExpFile = idTempExpFile;
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

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }
}
