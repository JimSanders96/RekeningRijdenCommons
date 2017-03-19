package json;

import domain.VehicleOwner;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Jim on 14-3-2017.
 */
public class VehicleJSON {
    @XmlElement public long id;
    @XmlElement public String licencePlate;
    @XmlElement public String brand;
}
