package authorize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import db.Database;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizeTest{
    Authorize authorz;
    Database db;

    @BeforeEach
    void setUp() {
        db = new Database();
        authorz = new Authorize();
    }

    @Test
    void testAuthorization() {
        assertTrue(authorz.auth(db));
    }
}