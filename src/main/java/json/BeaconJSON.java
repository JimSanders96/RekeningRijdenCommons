package json;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Jim on 14-3-2017.
 */
public class BeaconJSON {
    @XmlElement public String ICAN;
    @XmlElement public double latitude;
    @XmlElement public double longtitude;
    @XmlElement public long timestamp;
    @XmlElement public String signature;
}
