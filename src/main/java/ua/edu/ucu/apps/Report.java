package ua.edu.ucu.apps;

public record Report(String staticData, String userData) {
    @Override
    public String toString() {
        return "Report{" +
                "staticData='" + staticData + '\'' +
                ", userData='" + userData + '\'' +
                '}';
    }

    public String getStaticData() {
        return staticData;
    }

    public String getUserData() {
        return userData;
    }
}