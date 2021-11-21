package subway.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import subway.exception.MinimumTimeException;

class TimeTest {
    @DisplayName("역간 이동에 걸리는 최소시간은 1초이다. 0초일 경우에는 에러가 발생해야 한다.")
    @Test
    void illegalTimeTest() {
        Assertions.assertThatThrownBy(() -> {
            new Time(0);
        }).isInstanceOf(MinimumTimeException.class);
    }
}