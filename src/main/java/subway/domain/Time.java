package subway.domain;

import subway.exception.MinimumTimeException;

public class Time {
    private static final Integer minimum = 1;
    private final Integer time;

    public Time(Integer time) {
        validTime(time);
        this.time = time;
    }

    private void validTime(Integer time) {
        if (time < minimum) {
            throw new MinimumTimeException();
        }
    }

    public Integer info() {
        return time;
    }
}
