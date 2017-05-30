package interfaces;

import domain.Polygon2D;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Jim on 28-3-2017.
 */
public interface IRegion extends Serializable {

    String getName();
    void setName(String name);
    String getCode();
    void setCode(String code);
    Double getGasolineRate();
    void setGasolineRate(Double gasolineRate);
    Double getDieselRate();
    void setDieselRate(Double dieselRate);
    Double getGasRate();
    void setGasRate(Double gasRate);
    Double getHybridRate();
    void setHybridRate(Double hybridRate);
    Double getElectricRate();
    void setElectricRate(Double electricRate);
    List<Polygon2D> getPolygon();
    void setPolygon(List<Polygon2D> polygons);
}
