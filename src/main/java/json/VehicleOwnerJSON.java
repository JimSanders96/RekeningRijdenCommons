package json;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Jim on 14-3-2017.
 */
public class VehicleOwnerJSON {
    @XmlElement public long id;
    @XmlElement public boolean usesWebsite;
    @XmlElement public String adress;
    @XmlElement public String firstName;
    @XmlElement public String lastName;
    @XmlElement public String insertion;
}
