package json;

import domain.Role;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Jim on 14-3-2017.
 */
public class EmployeeJSON {
    @XmlElement public long id;
    @XmlElement public String userName;
    @XmlElement public String password;
    @XmlElement public String email;
    @XmlElement public Role role;
}
