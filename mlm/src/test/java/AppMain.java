import com.milleans.model.User;
import com.milleans.tools.Utils;
import com.milleans.um.services.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by macbookpro on 2015-03-25.
 */
public class AppMain {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"file:src/main/webapp/WEB-INF/dispatcher-servlet.xml");

		IUserService userService = (IUserService) context
				.getBean("userService");

        User user = new User();
        user.setFirstName("Hu");
        user.setLastName("le");
        user.setCity("Montreal");
        //user.setId(11);
        user.setRoleId(77);
        user.setAddress("5004 QueenMary");
        String birthdayStr="2009-02-11";
        SimpleDateFormat sdf = new SimpleDateFormat(Utils.MilleanDateFormate);
        Date convertedCurrentDate = null;
        try {
            convertedCurrentDate = sdf.parse(birthdayStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        user.setBirthDate(convertedCurrentDate);

        user.setCompanyName("7th company");
        user.setCompanyType(1);
        user.setCountryId(86);
        user.setDate(new Date());
        user.setEmail("hu.le.ca@gmail.com");
        user.setFax("5148850513");
        user.setGender("M");
        user.setMobile("4385570123");
        user.setPassWord("111111");
        user.setPhone("5148851234");
        user.setProvince("QC");
        user.setSponsorid(111);
        user.setStatus(1);
        user.setZip("h3w 1x2");


	}
}
