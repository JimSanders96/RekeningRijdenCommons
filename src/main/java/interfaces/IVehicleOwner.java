package interfaces;

import java.io.Serializable;
import java.util.List;

public interface IVehicleOwner extends Serializable {

    long getId();
    void setId(long id);

    boolean isUsesWebsite();
    void setUsesWebsite(boolean usesWebsite);

    String getFirstName();
    void setFirstName(String firstName);

    String getLastName();
    void setLastName(String lastName);

    String getInsertion();
    void setInsertion(String insertion);

    String getStreet();
    void setStreet(String street);

    String getZipcode();
    void setZipcode(String zipcode);

    int getNumber();
    void setNumber(int number);

    String getSuffix();
    void setSuffix(String suffix);

    List<IBill> getBills();
    void setBills(List<IBill> bills);
}
