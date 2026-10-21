
import java.util.regex.*;
public class Validation {

        public static boolean ValidateEmail(String email) {

            String regex = "^[A-Za-z]\\.[a-zA-z]+@(native\\.)?semicolon\\.africa$";
            email = email.trim();

            if ( email == "" || email == null ) {
                return false;
            }
            return email.matches(regex);

        }

        public static boolean ValidatePassword(String password) {
            String regex = "^(?=.*\\d)(?=.*[@_+#])\\S{8,16}$";
            password = password.trim();
            if ( password == "" || password == null ) {
                return false;
            }
            return password.matches(regex);
        }




}
