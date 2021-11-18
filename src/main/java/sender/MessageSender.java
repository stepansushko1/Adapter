package sender;

import user.User;

public class MessageSender {
    public boolean send(String text, User user, String country) {
        if (user.UserActiveTime != null && country.equals(user.Country)) {
            System.out.println("Message: " + text + " was sent to " + user + "in" + country);
            return true;
        }

        else {
            System.out.println("Can not send message");
            return false;
        }
    }
}