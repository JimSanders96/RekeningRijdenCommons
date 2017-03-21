package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Jim on 14-3-2017.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "vehicleTracker.findByICAN", query = "select v from VehicleTracker v where v.ICAN = :ICAN")

})
public class VehicleTracker implements Serializable {

    @Id
    private String ICAN;

    @OneToMany
    private List<Beacon> beacons;

    public VehicleTracker() {
    }

    public VehicleTracker(List<Beacon> beacons) {
        this.beacons = beacons;
    }

    public String getICAN() {
        return ICAN;
    }

    public void setICAN(String ICAN) {
        this.ICAN = ICAN;
    }

    public List<Beacon> getBeacons() {
        return beacons;
    }

    public void setBeacons(List<Beacon> beacons) {
        this.beacons = beacons;
    }
}
