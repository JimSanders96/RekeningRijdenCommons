package domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Jim on 14-3-2017.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "user.findById", query = "select u from User u where u.id = :id")

})
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;

    private long vehicleOwnerId;

    public User() {
    }

    public User(String username, String password, String email, String phoneNumber, long vehicleOwnerId) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.vehicleOwnerId = vehicleOwnerId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getVehicleOwnerId() {
        return vehicleOwnerId;
    }

    public void setVehicleOwnerId(long vehicleOwnerId) {
        this.vehicleOwnerId = vehicleOwnerId;
    }
}
