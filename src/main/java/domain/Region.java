package domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Jim on 14-3-2017.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "region.findById", query = "select r from Region r where r.id = :id")
})
public class Region implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double kilometerRate;
    private float timeInterval;
    private String name;

    public Region() {
    }

    public Region(double kilometerRate, float timeInterval, String name) {
        this.kilometerRate = kilometerRate;
        this.timeInterval = timeInterval;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getKilometerRate() {
        return kilometerRate;
    }

    public void setKilometerRate(double kilometerRate) {
        this.kilometerRate = kilometerRate;
    }

    public float getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(float timeInterval) {
        this.timeInterval = timeInterval;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
