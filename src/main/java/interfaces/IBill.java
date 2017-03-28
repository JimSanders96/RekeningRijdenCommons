package interfaces;

import domain.BillStatus;
import domain.Month;

import java.io.Serializable;

/**
 * Created by Jim on 28-3-2017.
 */
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

    IRegion getRegion();

    void setRegion(IRegion region);
}
