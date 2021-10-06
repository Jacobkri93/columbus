package dk.kea.columbus.Model;

import javax.persistence.*;

@Entity
@Table(name="inventories")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_inventory;
    @Column
    private float amount_gold;
    @Column
    private float amount_jewel;
    @Column
    private float amount_art;
    @Column
    private float amount_leather;
    @Column
    private float amount_canoe;
    @Column
    private float amount_gift;
    @Column
    private float amount_water;
    @Column
    private float amount_food;
    @Column
    private int id_player;

    public Inventory(){}

    public Inventory(Long id_inventory, float amount_gold, float amount_jewel, float amount_art, float amount_leather, float amount_canoe, float amount_gift, float amount_water, float amount_food, int id_player) {
        this.id_inventory = id_inventory;
        this.amount_gold = amount_gold;
        this.amount_jewel = amount_jewel;
        this.amount_art = amount_art;
        this.amount_leather = amount_leather;
        this.amount_canoe = amount_canoe;
        this.amount_gift = amount_gift;
        this.amount_water = amount_water;
        this.amount_food = amount_food;
        this.id_player = id_player;
    }

    public Long getId_inventory() {
        return id_inventory;
    }

    public void setId_inventory(Long id_inventory) {
        this.id_inventory = id_inventory;
    }

    public float getAmount_gold() {
        return amount_gold;
    }

    public void setAmount_gold(float amount_gold) {
        this.amount_gold = amount_gold;
    }

    public float getAmount_jewel() {
        return amount_jewel;
    }

    public void setAmount_jewel(float amount_jewel) {
        this.amount_jewel = amount_jewel;
    }

    public float getAmount_art() {
        return amount_art;
    }

    public void setAmount_art(float amount_art) {
        this.amount_art = amount_art;
    }

    public float getAmount_leather() {
        return amount_leather;
    }

    public void setAmount_leather(float amount_leather) {
        this.amount_leather = amount_leather;
    }

    public float getAmount_canoe() {
        return amount_canoe;
    }

    public void setAmount_canoe(float amount_canoe) {
        this.amount_canoe = amount_canoe;
    }

    public float getAmount_gift() {
        return amount_gift;
    }

    public void setAmount_gift(float amount_gift) {
        this.amount_gift = amount_gift;
    }

    public float getAmount_water() {
        return amount_water;
    }

    public void setAmount_water(float amount_water) {
        this.amount_water = amount_water;
    }

    public float getAmount_food() {
        return amount_food;
    }

    public void setAmount_food(float amount_food) {
        this.amount_food = amount_food;
    }

    public int getId_player() {
        return id_player;
    }

    public void setId_player(int id_player) {
        this.id_player = id_player;
    }
}
