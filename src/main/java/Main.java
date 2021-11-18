import authorize.Authorize;
import db.Database;
import report.ReportBuilder;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorize authorization = new Authorize();

        if (authorization.auth(db)) {
            ReportBuilder reportBuilder = new ReportBuilder(db);
        }
    }
}
