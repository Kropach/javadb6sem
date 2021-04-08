package KR.Services;

import KR.DAO.Repository;
import KR.Domain.Path;
import KR.Domain.Station;
import KR.Domain.Timetable;

import java.sql.SQLException;
import java.util.List;

public class MainService {
    private Repository<Path, Station> repository;

    public MainService(Repository<Path, Station> repository) {
        this.repository = repository;
    }


    public List<Path> showAll() throws SQLException {
        return repository.showAll();
    }

    public Path show(int number) throws SQLException {
        return repository.show(number);
    }

    public void addPath(Path path) throws SQLException {
        repository.addPath(path);
    }

    public void addStation(int pathNumber, Station station) throws SQLException {
        repository.addStation(pathNumber, station);
    }

    public void changeStation(int pathNumber, int stationNumber,  String name, String timeA, String timeD) throws SQLException {
        repository.changeStation(pathNumber, stationNumber, name, timeA, timeD);
    }

    public void changePath(int pathNumber, int trainNumber, String pathName) throws SQLException {
        repository.changePath(pathNumber, trainNumber, pathName);
    }

    public void removeStation(int pathNumber, int stationNumber) throws SQLException {
        repository.removeStation(pathNumber, stationNumber);
    }

    public void removePath(int pathNumber) throws SQLException {
        repository.removePath(pathNumber);
    }
}

