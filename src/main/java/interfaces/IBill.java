package interfaces;

import domain.BillStatus;
import domain.Month;

import java.io.Serializable;
import java.util.List;

public interface IBill extends Serializable {

    long getId();
    void setId(long id);

    double getAmount();
    void setAmount(double amount);

    Month getRegardedMonth();
    void setRegardedMonth(Month regardedMonth);

    long getDateIssued();
    void setDateIssued(long dateIssued);

    BillStatus getBillStatus();
    void setBillStatus(BillStatus billStatus);

    List<IRegion> getRegions();
    void setRegions(List<IRegion> region);
}
