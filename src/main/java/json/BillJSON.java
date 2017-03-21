package json;

import domain.BillStatus;
import domain.Month;

import javax.xml.bind.annotation.XmlElement;


/**
 * Created by Jim on 14-3-2017.
 */
public class BillJSON {
    @XmlElement public long id;
    @XmlElement public double amount;
    @XmlElement public Month regardedMonth;
    @XmlElement public long dateIssued;
    @XmlElement public BillStatus billStatus;
}
