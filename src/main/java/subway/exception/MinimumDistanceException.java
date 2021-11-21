package subway.exception;

public class MinimumDistanceException extends IllegalArgumentException {
    private static String MINIMUM_DISTANCE_EXCEPTION_MESSAGE = "역간 최소 거리는 1km 입니다. (1km 보다 작은 수는 존재할 수 없습니다.)";

    public MinimumDistanceException() {
        super(MINIMUM_DISTANCE_EXCEPTION_MESSAGE);
    }
}
