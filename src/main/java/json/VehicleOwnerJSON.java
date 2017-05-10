package json;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Jim on 14-3-2017.
 */
public class VehicleOwnerJSON {
    @XmlElement public long id;
    @XmlElement public boolean usesWebsite;
    @XmlElement public String firstName;
    @XmlElement public String lastName;
    @XmlElement public String insertion;
    @XmlElement public String street;
    @XmlElement public String zipcode;
    @XmlElement public int number;
    @XmlElement public String suffix;
}
