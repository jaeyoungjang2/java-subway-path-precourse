package subway.domain;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Station2StationTimeRepository {

    Map<Station, Map<Station, Time>> timeMap;

    public Station2StationTimeRepository() {
        this.timeMap = new HashMap<>();
    }

    public void add(Station startStation, Station endStation, Time time) {
        timeMap.put(startStation, new HashMap<>());
        timeMap.get(startStation).put(endStation, time);
    }

    public Map<Station, Map<Station, Time>> info() {
        return Collections.unmodifiableMap(timeMap);
    }
}
