package interfaces;

import java.io.Serializable;

/**
 * Created by Jim on 28-3-2017.
 */
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
