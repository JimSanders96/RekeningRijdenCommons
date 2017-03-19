package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Jim on 14-3-2017.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "vehicle.findById", query = "select v from Vehicle v where v.id = :id")

})
public class Vehicle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String licencePlate;
    private String brand;

    @ManyToOne
    private VehicleOwner currentVehicleOwner;
    @OneToMany
    private List<VehicleOwner> previousVehicleOwners;

    @OneToMany
    private List<VehicleTracker> previousVehicleTrackers;

    @OneToOne
    private VehicleTracker currentVehicleTracker;

    public Vehicle() {
    }

    public Vehicle(String licencePlate, String brand, VehicleOwner currentVehicleOwner, VehicleTracker currentVehicleTracker) {
        this.licencePlate = licencePlate;
        this.brand = brand;
        this.currentVehicleOwner = currentVehicleOwner;
        this.currentVehicleTracker = currentVehicleTracker;
    }

    public Vehicle(String licencePlate, String brand, VehicleOwner currentVehicleOwner, List<VehicleOwner> previousVehicleOwners, List<VehicleTracker> previousVehicleTrackers, VehicleTracker currentVehicleTracker) {
        this.licencePlate = licencePlate;
        this.brand = brand;
        this.currentVehicleOwner = currentVehicleOwner;
        this.previousVehicleOwners = previousVehicleOwners;
        this.previousVehicleTrackers = previousVehicleTrackers;
        this.currentVehicleTracker = currentVehicleTracker;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public VehicleOwner getCurrentVehicleOwner() {
        return currentVehicleOwner;
    }

    public void setCurrentVehicleOwner(VehicleOwner currentVehicleOwner) {
        this.currentVehicleOwner = currentVehicleOwner;
    }

    public List<VehicleOwner> getPreviousVehicleOwners() {
        return previousVehicleOwners;
    }

    public void setPreviousVehicleOwners(List<VehicleOwner> previousVehicleOwners) {
        this.previousVehicleOwners = previousVehicleOwners;
    }

    public List<VehicleTracker> getPreviousVehicleTrackers() {
        return previousVehicleTrackers;
    }

    public void setPreviousVehicleTrackers(List<VehicleTracker> previousVehicleTrackers) {
        this.previousVehicleTrackers = previousVehicleTrackers;
    }

    public VehicleTracker getCurrentVehicleTracker() {
        return currentVehicleTracker;
    }

    public void setCurrentVehicleTracker(VehicleTracker currentVehicleTracker) {
        this.currentVehicleTracker = currentVehicleTracker;
    }
}
