package adapter;
import user.TwitterUser;
import user.User;

import java.util.Date;

public class TwitterAdapter extends User {
    private TwitterUser twitterUser;
    public TwitterAdapter (TwitterUser user){
        this.twitterUser = user;
    }

    public String getEmail() {
        return twitterUser.getUserEMail();
    }

    public String getCountry() {
        return twitterUser.getCountry();
    }

    public Date getTime() {
        return twitterUser.getUserActiveTime();
    }
}