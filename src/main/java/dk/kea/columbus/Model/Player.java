package dk.kea.columbus.Model;

import javax.persistence.*;

@Entity
@Table(name="players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_player;

    @Column
    private int id_inventory;
    @Column
    private int amount_of_carriers;

    @Column
    private int amount_of_soldiers;

    @Column
    private float currency;
    @Column
    private float max_weight;
    @Column
    private int remaining_bp;
    @Column
    private int ship_x_pos;
    @Column
    private int ship_y_pos;
    @Column
    private int player_x_pos;
    @Column
    private int player_y_pos;

    public Player (){}

    public Player(Long id_player, int id_inventory, int amount_of_carriers, int amount_of_soldiers, float currency, float max_weight, int remaining_bp, int ship_x_pos, int ship_y_pos, int player_x_pos, int player_y_pos) {
        this.id_player = id_player;
        this.id_inventory = id_inventory;
        this.amount_of_carriers = amount_of_carriers;
        this.amount_of_soldiers = amount_of_soldiers;
        this.currency = currency;
        this.max_weight = max_weight;
        this.remaining_bp = remaining_bp;
        this.ship_x_pos = ship_x_pos;
        this.ship_y_pos = ship_y_pos;
        this.player_x_pos = player_x_pos;
        this.player_y_pos = player_y_pos;
    }

    public int getId_inventory() {
        return id_inventory;
    }

    public void setId_inventory(int id_inventory) {
        this.id_inventory = id_inventory;
    }

    public Long getId_player() {
        return id_player;
    }

    public void setId_player(Long id_player) {
        this.id_player = id_player;
    }

    public int getAmount_of_carriers() {
        return amount_of_carriers;
    }

    public void setAmount_of_carriers(int amount_of_carriers) {
        this.amount_of_carriers = amount_of_carriers;
    }

    public int getAmount_of_soldiers() {
        return amount_of_soldiers;
    }

    public void setAmount_of_soldiers(int amount_of_soldiers) {
        this.amount_of_soldiers = amount_of_soldiers;
    }

    public float getCurrency() {
        return currency;
    }

    public void setCurrency(float currency) {
        this.currency = currency;
    }

    public float getMax_weight() {
        return max_weight;
    }

    public void setMax_weight(float max_weight) {
        this.max_weight = max_weight;
    }

    public int getRemaining_bp() {
        return remaining_bp;
    }

    public void setRemaining_bp(int remaining_bp) {
        this.remaining_bp = remaining_bp;
    }

    public int getShip_x_pos() {
        return ship_x_pos;
    }

    public void setShip_x_pos(int ship_x_pos) {
        this.ship_x_pos = ship_x_pos;
    }

    public int getShip_y_pos() {
        return ship_y_pos;
    }

    public void setShip_y_pos(int ship_y_pos) {
        this.ship_y_pos = ship_y_pos;
    }

    public int getPlayer_x_pos() {
        return player_x_pos;
    }

    public void setPlayer_x_pos(int player_x_pos) {
        this.player_x_pos = player_x_pos;
    }

    public int getPlayer_y_pos() {
        return player_y_pos;
    }

    public void setPlayer_y_pos(int player_y_pos) {
        this.player_y_pos = player_y_pos;
    }

    public Player(int id_inventory, int amount_of_carriers, int amount_of_soldiers, float currency, float max_weight, int remaining_bp, int ship_x_pos, int ship_y_pos, int player_x_pos, int player_y_pos) {
        this.id_inventory = id_inventory;
        this.amount_of_carriers = amount_of_carriers;
        this.amount_of_soldiers = amount_of_soldiers;
        this.currency = currency;
        this.max_weight = max_weight;
        this.remaining_bp = remaining_bp;
        this.ship_x_pos = ship_x_pos;
        this.ship_y_pos = ship_y_pos;
        this.player_x_pos = player_x_pos;
        this.player_y_pos = player_y_pos;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id_player=" + id_player +
                ", id_inventory=" + id_inventory +
                ", amount_of_carriers=" + amount_of_carriers +
                ", amount_of_soldiers=" + amount_of_soldiers +
                ", currency=" + currency +
                ", max_weight=" + max_weight +
                ", remaining_bp=" + remaining_bp +
                ", ship_x_pos=" + ship_x_pos +
                ", ship_y_pos=" + ship_y_pos +
                ", player_x_pos=" + player_x_pos +
                ", player_y_pos=" + player_y_pos +
                '}';
    }
}
