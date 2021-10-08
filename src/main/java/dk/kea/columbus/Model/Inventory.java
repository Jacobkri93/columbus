package dk.kea.columbus.Model;

import javax.persistence.*;

@Entity
@Table(name="inventories")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInventory;
    @Column
    private float amountGold;
    @Column
    private float amountJewel;
    @Column
    private float amountArt;
    @Column
    private float amountLeather;
    @Column
    private float amountCanoe;
    @Column
    private float amountGift;
    @Column
    private float amountWater;
    @Column
    private float amountFood;
    @Column
    private int idPlayer;

    public Inventory(){}

    public Inventory(Long idInventory, float amountGold, float amountJewel, float amountArt, float amountLeather, float amountCanoe, float amountGift, float amountWater, float amountFood, int idPlayer) {
        this.idInventory = idInventory;
        this.amountGold = amountGold;
        this.amountJewel = amountJewel;
        this.amountArt = amountArt;
        this.amountLeather = amountLeather;
        this.amountCanoe = amountCanoe;
        this.amountGift = amountGift;
        this.amountWater = amountWater;
        this.amountFood = amountFood;
        this.idPlayer = idPlayer;
    }

    public Long getIdInventory() {
        return idInventory;
    }

    public void setIdInventory(Long idInventory) {
        this.idInventory = idInventory;
    }

    public float getAmountGold() {
        return amountGold;
    }

    public void setAmountGold(float amountGold) {
        this.amountGold = amountGold;
    }

    public float getAmountJewel() {
        return amountJewel;
    }

    public void setAmountJewel(float amountJewel) {
        this.amountJewel = amountJewel;
    }

    public float getAmountArt() {
        return amountArt;
    }

    public void setAmountArt(float amountArt) {
        this.amountArt = amountArt;
    }

    public float getAmountLeather() {
        return amountLeather;
    }

    public void setAmountLeather(float amountLeather) {
        this.amountLeather = amountLeather;
    }

    public float getAmountCanoe() {
        return amountCanoe;
    }

    public void setAmountCanoe(float amountCanoe) {
        this.amountCanoe = amountCanoe;
    }

    public float getAmountGift() {
        return amountGift;
    }

    public void setAmountGift(float amountGift) {
        this.amountGift = amountGift;
    }

    public float getAmountWater() {
        return amountWater;
    }

    public void setAmountWater(float amountWater) {
        this.amountWater = amountWater;
    }

    public float getAmountFood() {
        return amountFood;
    }

    public void setAmountFood(float amountFood) {
        this.amountFood = amountFood;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }
}
