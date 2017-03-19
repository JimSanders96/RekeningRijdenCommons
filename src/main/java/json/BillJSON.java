package json;

import domain.BillStatus;
import javax.xml.bind.annotation.XmlElement;
import java.time.Month;
import java.util.Date;

/**
 * Created by Jim on 14-3-2017.
 */
public class BillJSON {
    @XmlElement public long id;
    @XmlElement public double amount;
    @XmlElement public Month regardedMonth;
    @XmlElement public Date dateIssued;
    @XmlElement public BillStatus billStatus;
}
