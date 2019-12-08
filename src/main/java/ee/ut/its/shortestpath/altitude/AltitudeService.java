package ee.ut.its.shortestpath.altitude;

import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
import ee.ut.its.shortestpath.Route;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AltitudeService {

    private int METERS_DELTA = 50;

    public boolean isElectricOnly(List<Point> coordinates, double distance) {
        int stepSize = findStepSize(coordinates.size(), distance);
        for (int i = 0; i < coordinates.size(); i += stepSize) {

        }
        return false;
    }

    private int findStepSize(int coordinatesLength, double distance) {
        double sizePerCoordinate = distance / coordinatesLength;
        return Math.max(1, (int)sizePerCoordinate / METERS_DELTA);
    }
}
