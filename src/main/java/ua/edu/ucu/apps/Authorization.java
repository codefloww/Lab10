package ua.edu.ucu.apps;

public class Authorization {
    public boolean authrorize(Database db, String login) {
        String data = db.getUserData();
        if (data == login){
            return true;}
        else{
            return false;
        }
    }
}
