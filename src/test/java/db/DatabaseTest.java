package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDataBase {
    Database db;

    @BeforeEach
    void setUp(){
        db = new Database();
    }

    @Test
    void testGetUserData(){
        assertEquals("hello", db.getUserData());
    }

    @Test
    void testGetStatisticalData(){
        assertEquals("hello2", db.getStatisticData());
    }
}