package adapter;
import user.FacebookUser;
import user.User;

import java.util.Date;

public class FacebookAdapter extends User {
    private FacebookUser facebookUser;
    public FacebookAdapter (FacebookUser user){
        this.facebookUser = user;
    }

    public String getEmail() {
        return facebookUser.getUserEMail();
    }

    public String getCountry() {
        return facebookUser.getCountry();
    }

    public Date getTime() {
        return facebookUser.getUserActiveTime();
    }
}