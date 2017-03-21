package json;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Jim on 21-3-2017.
 */
public class StolenVehicleJSON {
    @XmlElement public long id;
    @XmlElement public String country;
    @XmlElement public long startDate;
    @XmlElement public long closeDate;
    @XmlElement public long vehicleId;

}
