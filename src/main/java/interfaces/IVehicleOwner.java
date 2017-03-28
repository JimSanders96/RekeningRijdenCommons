package interfaces;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Jim on 28-3-2017.
 */
public interface IVehicleOwner extends Serializable {

    long getId();

    void setId(long id);

    boolean isUsesWebsite();

    void setUsesWebsite(boolean usesWebsite);

    String getAdress();

    void setAdress(String adress);

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    String getInsertion();

    void setInsertion(String insertion);

    List<IBill> getBills();

    void setBills(List<IBill> bills);
}
