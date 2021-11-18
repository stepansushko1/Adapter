package user;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FacebookUser extends User{

    public FacebookUser(String country, String mail, Date time){
        setCountry(country);
        setUserEMail(mail);
        setUserActiveTime(time);
    }


}