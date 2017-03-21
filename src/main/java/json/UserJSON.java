package json;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Jim on 14-3-2017.
 */
public class UserJSON {

    @XmlElement public long id;
    @XmlElement public String username;
    @XmlElement public String password;
    @XmlElement public String email;
    @XmlElement public String phoneNumber;
    @XmlElement public long vehicleOwnerId;
}
