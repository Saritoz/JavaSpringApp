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
    private String id;
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
    private int idFlower;
    @Column(name = "quantityFlower")
    private int quantityFlower;
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
    @Column(name = "timeOrder")
    private String timeOrder;

    public OrderF() {
    }

    public OrderF(String id, String fullname, String email, String phonenumber, String address, String username,
            int idFlower, int quantityFlower, String status, String shipment, String payment, int priceShipment,
            int total, String timeOrder) {
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
        this.timeOrder = timeOrder;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public int getIdFlower() {
        return idFlower;
    }

    public void setIdFlower(int idFlower) {
        this.idFlower = idFlower;
    }

    public int getQuantityFlower() {
        return quantityFlower;
    }

    public void setQuantityFlower(int quantityFlower) {
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

    public String getTimeOrder() {
        return timeOrder;
    }

    public void setTimeOrder(String timeOrder) {
        this.timeOrder = timeOrder;
    }
}
