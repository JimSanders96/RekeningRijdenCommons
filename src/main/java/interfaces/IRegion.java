package interfaces;

import java.io.Serializable;

/**
 * Created by Jim on 28-3-2017.
 */
public interface IRegion extends Serializable {

    long getId();

    void setId(long id);

    double getKilometerRate();

    void setKilometerRate(double kilometerRate);

    float getTimeInterval();

    void setTimeInterval(float timeInterval);

    String getName();

    void setName(String name);
}
