package interfaces;

import domain.Role;

import java.io.Serializable;
import java.util.List;

public interface IEmployee extends Serializable {

    long getId();
    void setId(long id);

    String getUsername();
    void setUsername(String username);

    String getPassword();
    void setPassword(String password);

    String getEmail();
    void setEmail(String email);

    List<Role> getRoles();
    void setRoles(List<Role> role);
}
