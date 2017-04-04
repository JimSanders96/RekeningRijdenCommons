package interfaces;

import java.io.Serializable;

/**
 * Created by Jim on 28-3-2017.
 */
public interface IUser extends Serializable {

    long getId();

    void setId(long id);

    String getUsername();

    void setUsername(String username);

    String getPassword();

    void setPassword(String password);

    String getEmail();

    void setEmail(String email);

    String getPhoneNumber();

    void setPhoneNumber(String phoneNumber);

    long getVehicleOwnerId();

    void setVehicleOwnerId(long vehicleOwnerId);

    String getLanguagePreference();

    void setLanguagePreference(String languagePreference);
}
