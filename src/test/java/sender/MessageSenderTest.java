package sender;

import adapter.FacebookAdapter;
import adapter.TwitterAdapter;
import user.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import user.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MessageSenderTest {
    MessageSender messageSender;
    FacebookAdapter facebookAdapter;
    FacebookAdapter falseUser;
    TwitterAdapter twitterAdapter;

    @BeforeEach
    void setUp() {
        facebookAdapter = new FacebookAdapter(new FacebookUser("a@gmail.com", "USA", new Date()));
        twitterAdapter = new TwitterAdapter(new TwitterUser("b@gmail.com", "UK", new Date()));
        falseUser = new FacebookAdapter(new FacebookUser("c@gmail.com", "Ukraine", null));
        messageSender = new MessageSender();
    }

    @Test
    void testSender() {
        assertFalse(messageSender.send("Hello from UK!", twitterAdapter, "UK"));
        assertFalse(messageSender.send("Hello from China!", facebookAdapter, "Ukraine"));
        assertFalse(messageSender.send("Hello!", falseUser, "Ukraineee"));

    }
}