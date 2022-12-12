package tdt.edu.finalproject.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderflower")
public class OrderF {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "fullname")
    private String fullname;
    @Column(name = "email")
    private String email;
    @Column(name = "phonenumber")
    private String phonenumber;
    @Column(name = "address")
    private String address;
    @Column(name = "username")
    private String username;
    @Column(name = "idFlower")
    private String idFlower;
    @Column(name = "quantityFlower")
    private String quantityFlower;
    @Column(name = "status")
    private String status;
    @Column(name = "shipment")
    private String shipment;
    @Column(name = "payment")
    private String payment;
    @Column(name = "priceShipment")
    private int priceShipment;
    @Column(name = "total")
    private int total;

    public OrderF() {
    }

    public OrderF(int id, String fullname, String email, String phonenumber, String address, String username,
            String idFlower, String quantityFlower, String status, String shipment, String payment, int priceShipment, int total) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.phonenumber = phonenumber;
        this.address = address;
        this.username = username;
        this.idFlower = idFlower;
        this.quantityFlower = quantityFlower;
        this.status = status;
        this.shipment = shipment;
        this.payment = payment;
        this.priceShipment = priceShipment;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIdFlower() {
        return idFlower;
    }

    public void setIdFlower(String idFlower) {
        this.idFlower = idFlower;
    }

    public String getQuantityFlower() {
        return quantityFlower;
    }

    public void setQuantityFlower(String quantityFlower) {
        this.quantityFlower = quantityFlower;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getShipment() {
        return shipment;
    }

    public void setShipment(String shipment) {
        this.shipment = shipment;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public int getPriceShipment() {
        return priceShipment;
    }

    public void setPriceShipment(int priceShipment) {
        this.priceShipment = priceShipment;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}