package tdt.edu.finalproject.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "idFlower")
    private int idFlower;
    @Column(name = "nameFlower")
    private String nameFlower;
    @Column(name = "quantityFlower")
    private int quantityFlower;
    @Column(name = "priceFlower")
    private int priceFlower;
    @Column(name = "imageFlower")
    private String imageFlower;
    @Column(name = "username")
    private String username;
    @Column(name = "status")
    private String status;
    @Column(name = "total")
    private int total;

    public Cart() {
    }

    public Cart(int id, int idFlower, String nameFlower, int quantityFlower, int priceFlower, String imageFlower,
            String username, String status, int total) {
        this.id = id;
        this.idFlower = idFlower;
        this.nameFlower = nameFlower;
        this.quantityFlower = quantityFlower;
        this.priceFlower = priceFlower;
        this.imageFlower = imageFlower;
        this.username = username;
        this.status = status;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdFlower() {
        return idFlower;
    }

    public void setIdFlower(int idFlower) {
        this.idFlower = idFlower;
    }

    public String getNameFlower() {
        return nameFlower;
    }

    public void setNameFlower(String nameFlower) {
        this.nameFlower = nameFlower;
    }

    public int getQuantityFlower() {
        return quantityFlower;
    }

    public void setQuantityFlower(int quantityFlower) {
        this.quantityFlower = quantityFlower;
    }

    public int getPriceFlower() {
        return priceFlower;
    }

    public void setPriceFlower(int priceFlower) {
        this.priceFlower = priceFlower;
    }

    public String getImageFlower() {
        return imageFlower;
    }

    public void setImageFlower(String imageFlower) {
        this.imageFlower = imageFlower;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}