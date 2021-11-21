package subway.domain;

public class Station2StationInfo {
    private static final int GYODAE_GANGNAM_DISTANCE = 2;
    private static final int GYODAE_GANGNAM_TIME = 3;
    private static final int GYODAE_SOUTH_TERMINAL_DISTANCE = 3;
    private static final int GYODAE_SOUTH_TERMINAL_TIME = 2;
    private static final int GANGNAM_YEOKSAM_DISTANCE = 2;
    private static final int GANGNAM_YEOKSAM_TIME = 3;
    private static final int GANGNAM_YANGJAE_DISTANCE = 2;
    private static final int GANGNAM_YANGJAE_TIME = 8;
    private static final int SOUTH_TERMINAL_YANGJAE_DISTANCE = 6;
    private static final int SOUTH_TERMINAL_YANGJAE_TIME = 5;
    private static final int YANGJAE_MAEBONG_DISTANCE = 1;
    private static final int YANGJAE_MAEBONG_TIME = 1;
    private static final int YANGJAE_YANGJAE_FOREST_DISTANCE = 10;
    private static final int YANGJAE_YANGJAE_FOREST_TIME = 3;

    private static Station2StationTimeRepository station2StationTimeRepository;
    private static Station2StationDistanceRepository station2StationDistanceRepository;

    public Station2StationInfo() {
        station2StationDistanceRepository = new Station2StationDistanceRepository();
        station2StationTimeRepository = new Station2StationTimeRepository();
    }

    public void init() {
        station2StationDistanceRepository.add(new Station("교대"), new Station("강남"), new Distance(GYODAE_GANGNAM_DISTANCE));
        station2StationTimeRepository.add(new Station("교대"), new Station("강남"), new Time(GYODAE_GANGNAM_TIME));
        station2StationDistanceRepository.add(new Station("교대"), new Station("남부터미널"), new Distance(GYODAE_SOUTH_TERMINAL_DISTANCE));
        station2StationTimeRepository.add(new Station("교대"), new Station("남부터미널"), new Time(GYODAE_SOUTH_TERMINAL_TIME));
        station2StationDistanceRepository.add(new Station("강남"), new Station("역삼"), new Distance(GANGNAM_YEOKSAM_DISTANCE));
        station2StationTimeRepository.add(new Station("강남"), new Station("역삼"), new Time(GANGNAM_YEOKSAM_TIME));
        station2StationDistanceRepository.add(new Station("강남"), new Station("양재"), new Distance(GANGNAM_YANGJAE_DISTANCE));
        station2StationTimeRepository.add(new Station("강남"), new Station("양재"), new Time(GANGNAM_YANGJAE_TIME));
        station2StationDistanceRepository.add(new Station("남부터미널"), new Station("양재"), new Distance(SOUTH_TERMINAL_YANGJAE_DISTANCE));
        station2StationTimeRepository.add(new Station("남부터미널"), new Station("양재"), new Time(SOUTH_TERMINAL_YANGJAE_TIME));
        station2StationDistanceRepository.add(new Station("양재"), new Station("매봉"), new Distance(YANGJAE_MAEBONG_DISTANCE));
        station2StationTimeRepository.add(new Station("양재"), new Station("매봉"), new Time(YANGJAE_MAEBONG_TIME));
        station2StationDistanceRepository.add(new Station("양재"), new Station("양재시민의숲"), new Distance(YANGJAE_YANGJAE_FOREST_DISTANCE));
        station2StationTimeRepository.add(new Station("양재"), new Station("양재시민의숲"), new Time(YANGJAE_YANGJAE_FOREST_TIME));
    }
}
