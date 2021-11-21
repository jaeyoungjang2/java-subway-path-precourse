package subway.domain;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Station2StationDistanceRepository {
    Map<Station, Map<Station, Distance>> distanceMap;

    public Station2StationDistanceRepository() {
        this.distanceMap = new HashMap<>();
    }

    public void add(Station startStation, Station endStation, Distance distance) {
        distanceMap.put(startStation, new HashMap<>());
        distanceMap.get(startStation).put(endStation, distance);
    }

    public Map<Station, Map<Station, Distance>> info() {
        return Collections.unmodifiableMap(distanceMap);
    }
}
