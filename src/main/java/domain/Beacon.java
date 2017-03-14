package domain;

/**
 * Created by Jim on 14-3-2017.
 */
public class Beacon {

    private  String ICAN;
    private double latitude;
    private double longtitude;
    private long timestamp;
    private String signature;

    public Beacon() {
    }

    public Beacon(String ICAN, double latitude, double longtitude, long timestamp) {
        this.ICAN = ICAN;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.timestamp = timestamp;
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
