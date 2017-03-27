package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jim on 14-3-2017.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "vehicleOwner.findById", query = "select v from VehicleOwner v where v.id = :id")

})
public class VehicleOwner implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean usesWebsite;
    private String adress;
    private String firstName;
    private String lastName;
    private String insertion;
    @OneToMany
    private List<Bill> bills;

    public VehicleOwner() {
        bills = new ArrayList<>();
    }

    public VehicleOwner(boolean usesWebsite, String adress, String firstName, String lastName, String insertion, List<Bill> bills) {
        this.usesWebsite = usesWebsite;
        this.adress = adress;
        this.firstName = firstName;
        this.lastName = lastName;
        this.insertion = insertion;
        this.bills = bills;
    }

    public VehicleOwner(boolean usesWebsite, String adress, String firstName, String lastName, String insertion) {
        this.usesWebsite = usesWebsite;
        this.adress = adress;
        this.firstName = firstName;
        this.lastName = lastName;
        this.insertion = insertion;
        this.bills = new ArrayList<Bill>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isUsesWebsite() {
        return usesWebsite;
    }

    public void setUsesWebsite(boolean usesWebsite) {
        this.usesWebsite = usesWebsite;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInsertion() {
        return insertion;
    }

    public void setInsertion(String insertion) {
        this.insertion = insertion;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }
}
