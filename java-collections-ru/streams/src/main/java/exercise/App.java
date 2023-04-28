package exercise;

import java.util.List;
import org.apache.commons.lang3.StringUtils;

// BEGIN
public class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        var result = emails.stream()
                .filter(email -> StringUtils.isNotBlank(email))
                .filter(email -> email.endsWith("gmail.com") || email.endsWith("@yandex.ru")
                        || email.endsWith("hotmail.com"))
                .count();

        return result;
    }
}
// END
