package subway.domain;

import subway.exception.MinimumDistanceException;

public class Distance {
    private static final Integer minimum = 1;
    private final Integer distance;

    public Distance(Integer distance) {
        validTime(distance);
        this.distance = distance;
    }

    private void validTime(Integer distance) {
        if (distance < minimum) {
            throw new MinimumDistanceException();
        }
    }

    public Integer info() {
        return distance;
    }
}
