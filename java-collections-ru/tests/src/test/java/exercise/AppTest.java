package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4, 8, 16, 32, 64));

        List<Integer> actual = App.take(numbers, 3);
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 4, 8));

        assertThat(actual).isEqualTo(expected);
        // END
    }
}
