package interfaces;

import java.io.Serializable;

public interface IBeacon extends Serializable {
    String getICAN();
    void setICAN(String ICAN);

    double getLatitude();
    void setLatitude(double latitude);

    double getLongitude();
    void setLongitude(double longtitude);

    long getTimestamp();
    void setTimestamp(long timestamp);

    String getSignature();
    void setSignature(String signature);
}
