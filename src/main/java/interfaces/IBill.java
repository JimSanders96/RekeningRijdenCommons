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

    String getIcan();

    void setIcan(String ican);

    double getAmount();

    void setAmount(double amount);

    Month getRegardedMonth();

    void setRegardedMonth(Month regardedMonth);

    Map<String, Double> getKmPerRegion();

    void setKmPerRegion(HashMap<String, Double> kmPerRegion);

    long getDateIssued();

    void setDateIssued(long dateIssued);

    BillStatus getBillStatus();

    void setBillStatus(BillStatus billStatus);
}
