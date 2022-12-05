package ua.edu.ucu.apps;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ReportBuilder {
    private Database database;

    public Report buildReport() {
        String userData = database.getUserData();
        String staticData = database.getStaticData();

        return new Report(staticData, userData);
    }
}