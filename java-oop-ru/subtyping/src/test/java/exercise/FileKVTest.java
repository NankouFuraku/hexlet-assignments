package exercise;

import java.util.HashMap;
import org.junit.jupiter.api.BeforeEach;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
// BEGIN
import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.LinkedHashMap;
// END


class FileKVTest {

    private static Path filepath = Paths.get("src/test/resources/file").toAbsolutePath().normalize();

    @BeforeEach
    public void beforeEach() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String content = mapper.writeValueAsString(new HashMap<String, String>());
        Files.writeString(filepath, content, StandardOpenOption.TRUNCATE_EXISTING);
    }

    // BEGIN
    @Test
    public void testSerialize() {
        var storageData = new LinkedHashMap<String, String>();
        storageData.put("id", "1");
        storageData.put("name", "John Doe");
        storageData.put("age", "30");

        var storage = new FileKV("src/test/resources/file1.json", storageData);
        var jsonData = Utils.serialize(storage.toMap());

        Utils.writeFile(storage.getPathFile(), jsonData);

        var expected = Utils.readFile("src/test/resources/expected.json");
        assertThat(Utils.readFile("src/test/resources/file1.json")).isEqualTo(expected);

        var deserializedJsonData = Utils.deserialize(jsonData);
        assertThat(deserializedJsonData).isEqualTo(storage.toMap());
    }

    // END
}
