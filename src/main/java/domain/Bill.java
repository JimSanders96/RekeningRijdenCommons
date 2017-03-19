package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.time.Month;
import java.util.Date;

/**
 * Created by Jim on 14-3-2017.
 *
 * The variables @dateIssued and @billStatus will be automatically set when the entity is persisted.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "bill.findById", query = "select b from Bill b where b.id = :id")
})
public class Bill implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double amount;
    private Month regardedMonth;
    private Date dateIssued;
    private BillStatus billStatus;
    @ManyToOne
    private Region region;

    public Bill() {
    }


    public Bill(double amount, Month regardedMonth, Region region) {
        this.amount = amount;
        this.regardedMonth = regardedMonth;
        this.region = region;
    }

    Bill(double amount, Month regardedMonth, Date dateIssued, BillStatus billStatus, Region region) {
        this.amount = amount;
        this.regardedMonth = regardedMonth;
        this.dateIssued = dateIssued;
        this.billStatus = billStatus;
        this.region = region;
    }

    @PrePersist
    public void setInitialValues(){
        this.dateIssued = Date.from(Instant.now());
        this.billStatus = BillStatus.OPEN;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Month getRegardedMonth() {
        return regardedMonth;
    }

    public void setRegardedMonth(Month regardedMonth) {
        this.regardedMonth = regardedMonth;
    }

    public Date getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(Date dateIssued) {
        this.dateIssued = dateIssued;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
