package KR.Domain;

import java.util.ArrayList;
import java.util.LinkedList;

public class Path {
    private int trainNumber;
    private String pathName;
    private LinkedList<Station> stations = new LinkedList<>();

    public Path(int trainNumber, String pathName, LinkedList<Station> stations) {
        this.trainNumber = trainNumber;
        this.pathName = pathName;
        this.stations = stations;
    }

    public LinkedList<Station> getStations() {
        return stations;
    }

    public void setStations(LinkedList stations) {
        this.stations = stations;
    }



    @Override
    public String toString() {
        return "Path{" +
                "trainNumber=" + trainNumber +
                ", pathName='" + pathName + '\'' +
                ", stations=" + stations +
                '}' + "\n";
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

}
