package interfaces;

import java.io.Serializable;
import java.util.List;

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

    int getMassa();
    void setMassa(int massa);

    String getFuelType();
    void setFuelType(String fuelType);

    IVehicleOwner getCurrentVehicleOwner();
    void setCurrentVehicleOwner(IVehicleOwner currentVehicleOwner);

    List<IVehicleOwner> getPreviousVehicleOwners();
    void setPreviousVehicleOwners(List<IVehicleOwner> previousVehicleOwners);

    List<String> getPreviousVehicleTrackerICANs();
    void setPreviousVehicleTrackerICANs(List<String> previousVehicleTrackerICAN);

    String getCurrentVehicleTrackerICAN();
    void setCurrentVehicleTrackerICAN(String currentVehicleTrackerICAN);
}
