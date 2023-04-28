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

        return result;1.
        Душевная разрядка, испытываемая зрителем в процессе сопереживания при просмотре трагедии (по терминологии Аристотеля).

        2. перен.
                Нравственное очищение, возвышение души через искусство, возникающее в процессе сопереживания и сострадания, а не в результате какого-либо действия.

    }
}
// END
