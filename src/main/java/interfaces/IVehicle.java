package interfaces;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Jim on 28-3-2017.
 */
public interface IVehicle extends Serializable {

    long getId();
    void setId(long id);

    String getLicensePlate();
    void setLicensePlate(String licencePlate);

    String getBrand();
    void setBrand(String brand);

    int getMass();
    void setMass(int mass);

    String getFuelType();
    void setFuelType(String fuelType);

    IVehicleOwner getCurrentVehicleOwner();
    void setCurrentVehicleOwner(IVehicleOwner currentVehicleOwner);

    Map<long,IVehicleOwner>getPreviousVehicleOwners();
    void setPreviousVehicleOwners(HashMap<long,IVehicleOwner> previousVehicleOwners);

    List<String> getPreviousVehicleTrackerICANs();
    void setPreviousVehicleTrackerICANs(List<String> previousVehicleTrackerICAN);

    String getCurrentVehicleTrackerICAN();
    void setCurrentVehicleTrackerICAN(String currentVehicleTrackerICAN);
}
