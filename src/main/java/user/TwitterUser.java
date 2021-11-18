package user;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TwitterUser extends User{

    public TwitterUser(String country, String mail, Date time){
        setCountry(country);
        setUserEMail(mail);
        setUserActiveTime(time);
    }

}
