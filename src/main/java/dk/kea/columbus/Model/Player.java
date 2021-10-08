package dk.kea.columbus.Model;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;

@Entity
@Table(name="players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlayer;

    @JsonInclude
    @Transient
    @Column(name = "id_inventory",nullable = true)
    private int idInventory;
    @Column(name = "amount_of_carriers")
    private int amountOfCarriers;

    @Column(name = "amount_of_soldiers")
    private int amountOfSoldiers;

    @Column(name = "amount_of_monks")
    private int amountOfMonks;

    @Column(name = "currency")
    private float currency;
    @Column(name = "max_weight")
    private float maxWeight;
    @Column(name = "remaining_bp")
    private int remainingBp;
    @Column(name = "ship_x_pos")
    private int shipXPos;
    @Column(name = "ship_y_pos")
    private int shipYPos;
    @Column(name = "player_x_pos")
    private int playerXPos;
    @Column(name = "player_y_pos")
    private int playerYPos;

    public Player (){}

    public Player(int amountOfCarriers, int amountOfSoldiers, int amountOfMonks, float currency, float maxWeight, int remainingBp, int shipXPos, int shipYPos, int playerXPos, int playerYPos) {
        this.amountOfCarriers = amountOfCarriers;
        this.amountOfSoldiers = amountOfSoldiers;
        this.amountOfMonks = amountOfMonks;
        this.currency = currency;
        this.maxWeight = maxWeight;
        this.remainingBp = remainingBp;
        this.shipXPos = shipXPos;
        this.shipYPos = shipYPos;
        this.playerXPos = playerXPos;
        this.playerYPos = playerYPos;
    }

    public Player(int idInventory, int amountOfCarriers, int amountOfSoldiers, int amountOfMonks, float currency, float maxWeight, int remainingBp, int shipXPos, int shipYPos, int playerXPos, int playerYPos) {
        this.idInventory = idInventory;
        this.amountOfCarriers = amountOfCarriers;
        this.amountOfSoldiers = amountOfSoldiers;
        this.amountOfMonks = amountOfMonks;
        this.currency = currency;
        this.maxWeight = maxWeight;
        this.remainingBp = remainingBp;
        this.shipXPos = shipXPos;
        this.shipYPos = shipYPos;
        this.playerXPos = playerXPos;
        this.playerYPos = playerYPos;
    }

    public Player(Long idPlayer, int amountOfCarriers, int amountOfSoldiers, int amountOfMonks, float currency, float maxWeight, int remainingBp, int shipXPos, int shipYPos, int playerXPos, int playerYPos) {
        this.idPlayer = idPlayer;
        this.amountOfCarriers = amountOfCarriers;
        this.amountOfSoldiers = amountOfSoldiers;
        this.amountOfMonks = amountOfMonks;
        this.currency = currency;
        this.maxWeight = maxWeight;
        this.remainingBp = remainingBp;
        this.shipXPos = shipXPos;
        this.shipYPos = shipYPos;
        this.playerXPos = playerXPos;
        this.playerYPos = playerYPos;
    }

    public Player(Long idPlayer, int idInventory, int amountOfCarriers, int amountOfSoldiers, int amountOfMonks, float currency, float maxWeight, int remainingBp, int shipXPos, int shipYPos, int playerXPos, int playerYPos) {
        this.idPlayer = idPlayer;
        this.idInventory = idInventory;
        this.amountOfCarriers = amountOfCarriers;
        this.amountOfSoldiers = amountOfSoldiers;
        this.amountOfMonks = amountOfMonks;
        this.currency = currency;
        this.maxWeight = maxWeight;
        this.remainingBp = remainingBp;
        this.shipXPos = shipXPos;
        this.shipYPos = shipYPos;
        this.playerXPos = playerXPos;
        this.playerYPos = playerYPos;
    }

    public Long getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(Long idPlayer) {
        this.idPlayer = idPlayer;
    }

    public int getIdInventory() {
        return idInventory;
    }

    public void setIdInventory(int idInventory) {
        this.idInventory = idInventory;
    }

    public int getAmountOfCarriers() {
        return amountOfCarriers;
    }

    public void setAmountOfCarriers(int amountOfCarriers) {
        this.amountOfCarriers = amountOfCarriers;
    }

    public int getAmountOfSoldiers() {
        return amountOfSoldiers;
    }

    public void setAmountOfSoldiers(int amountOfSoldiers) {
        this.amountOfSoldiers = amountOfSoldiers;
    }

    public int getAmountOfMonks() {
        return amountOfMonks;
    }

    public void setAmountOfMonks(int amountOfMonks) {
        this.amountOfMonks = amountOfMonks;
    }

    public float getCurrency() {
        return currency;
    }

    public void setCurrency(float currency) {
        this.currency = currency;
    }

    public float getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getRemainingBp() {
        return remainingBp;
    }

    public void setRemainingBp(int remainingBp) {
        this.remainingBp = remainingBp;
    }

    public int getShipXPos() {
        return shipXPos;
    }

    public void setShipXPos(int shipXPos) {
        this.shipXPos = shipXPos;
    }

    public int getShipYPos() {
        return shipYPos;
    }

    public void setShipYPos(int shipYPos) {
        this.shipYPos = shipYPos;
    }

    public int getPlayerXPos() {
        return playerXPos;
    }

    public void setPlayerXPos(int playerXPos) {
        this.playerXPos = playerXPos;
    }

    public int getPlayerYPos() {
        return playerYPos;
    }

    public void setPlayerYPos(int playerYPos) {
        this.playerYPos = playerYPos;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id_player=" + idPlayer +
                ", id_inventory=" + idInventory +
                ", amount_of_carriers=" + amountOfCarriers +
                ", amount_of_soldiers=" + amountOfSoldiers +
                ", currency=" + currency +
                ", max_weight=" + maxWeight +
                ", remaining_bp=" + remainingBp +
                ", ship_x_pos=" + shipXPos +
                ", ship_y_pos=" + shipYPos +
                ", player_x_pos=" + playerXPos +
                ", player_y_pos=" + playerYPos +
                '}';
    }


}
