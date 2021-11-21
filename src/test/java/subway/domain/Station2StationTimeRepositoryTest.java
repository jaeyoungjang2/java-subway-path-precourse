package subway.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Station2StationTimeRepositoryTest {

    @DisplayName("강남역과 교대역까지 걸리는 시간 확인 테스트")
    @Test
    void timeTest() {
        Station2StationTimeRepository station2StationTimeRepository = new Station2StationTimeRepository();
        station2StationTimeRepository.add(new Station("교대"), new Station("강남"), new Time(2));

        Map<Station, Map<Station, Time>> info = station2StationTimeRepository.info();

        for (Station startStation : info.keySet()) {
            for (Station endStation : info.get(startStation).keySet()) {
                Time time = info.get(startStation).get(endStation);
                assertThat(time.info()).isEqualTo(2);
            }
        }
    }
}