package subway.exception;

public class MinimumTimeException extends IllegalArgumentException {

    private static String MINIMUM_TIME_EXCEPTION_MESSAGE = "역간 이동에 걸리는 최소시간은 1분 입니다. (1분 보다 작은 수는 존재할 수 없습니다.)";

    public MinimumTimeException() {
        super(MINIMUM_TIME_EXCEPTION_MESSAGE);
    }
}
