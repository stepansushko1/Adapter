package authorize;

import db.Database;

public class Authorize extends Авторизація{
    public boolean auth(Database db){
        db.getUserData();
        return true;
    }
}