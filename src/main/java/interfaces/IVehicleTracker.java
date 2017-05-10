package interfaces;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Jim on 28-3-2017.
 */
public interface IVehicleTracker extends Serializable{

    String getICAN() ;
    void setICAN(String ICAN) ;

    List<IBeacon> getBeacons() ;
    void setBeacons(List<IBeacon> beacons) ;
}
