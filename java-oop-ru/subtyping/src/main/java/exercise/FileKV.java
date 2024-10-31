package exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    private String pathFile;
    private Map<String, String> map;

    public FileKV(String pathFile, Map<String, String> map) {
        this.pathFile = pathFile;
        this.map = new LinkedHashMap<>(map);
    }

    public String getPathFile() {
        return pathFile;
    }

    @Override
    public void set(String key, String value) {
        map.put(key, value);
    }

    @Override
    public void unset(String key) {
        map.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return map.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new LinkedHashMap<>(map);
    }
}
// END
