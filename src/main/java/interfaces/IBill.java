package interfaces;

import domain.BillStatus;
import domain.Month;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IBill extends Serializable {

    long getId();
    void setId(long id);

    double getAmount();
    void setAmount(double amount);

    Month getRegardedMonth();
    void setRegardedMonth(Month regardedMonth);

    Map<String,double> getKmPerRegion();
    void setKmPerRegion(HashMap<String,double> kmPerRegion);

    long getDateIssued();
    void setDateIssued(long dateIssued);

    BillStatus getBillStatus();
    void setBillStatus(BillStatus billStatus);

    List<IRegion> getRegions();
    void setRegions(List<IRegion> region);
}
