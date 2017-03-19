package domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.io.Serializable;

/**
 * Created by Jim on 14-3-2017.
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "beacon.findByICAN", query = "select b from Beacon b where b.ICAN = :ICAN"),
    @NamedQuery(name = "beacon.findByTimestamp", query = "select b from Beacon b where b.timestamp = :timestamp"),
    @NamedQuery(name = "beacon.findByTimestampAndICAN", query = "select b from Beacon b where b.timestamp = :timestamp and b.ICAN = :ICAN")
})
public class Beacon implements Serializable{

    @Id
    private  String ICAN;
    @Id
    private long timestamp;

    private double latitude;
    private double longtitude;
    private String signature;

    public Beacon() {
    }

    public Beacon(String ICAN, double latitude, double longtitude, long timestamp) {
        this.ICAN = ICAN;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.timestamp = timestamp;
        this.signature = "NONE";
    }

    public Beacon(String ICAN, double latitude, double longtitude, long timestamp, String signature) {
        this.ICAN = ICAN;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.timestamp = timestamp;
        this.signature = signature;
    }

    public String getICAN() {
        return ICAN;
    }

    public void setICAN(String ICAN) {
        this.ICAN = ICAN;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
