package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Jim on 14-3-2017.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "vehicleTracker.findById", query = "select v from VehicleTracker v where v.id = :id")

})
public class VehicleTracker implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany
    private List<Beacon> beacons;

    public VehicleTracker() {
    }

    public VehicleTracker(List<Beacon> beacons) {
        this.beacons = beacons;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Beacon> getBeacons() {
        return beacons;
    }

    public void setBeacons(List<Beacon> beacons) {
        this.beacons = beacons;
    }
}
