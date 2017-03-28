package json;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by Jim on 14-3-2017.
 */
public class VehicleJSON {
    @XmlElement public long id;
    @XmlElement public String licencePlate;
    @XmlElement public String brand;
    @XmlElement public String currentVehicleICAN;
    @XmlElement public List<String> previousVehicleICANs;
}
