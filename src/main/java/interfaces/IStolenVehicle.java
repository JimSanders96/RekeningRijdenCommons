package interfaces;

import java.io.Serializable;

/**
 * Created by Jim on 28-3-2017.
 */
public interface IStolenVehicle extends Serializable {

    String getCountry();
    void setCountry(String country);

    long getStartDate();
    void setStartDate(long startDate);

    long getCloseDate();
    void setCloseDate(long closeDate);

    long getVehicleId();
    void setVehicleId(long vehicleId);
}
