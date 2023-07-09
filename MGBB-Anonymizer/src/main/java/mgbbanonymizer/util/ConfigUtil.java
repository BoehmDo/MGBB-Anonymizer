package mgbbanonymizer.util;

import java.io.InputStream;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import mgbbanonymizer.model.Settings;

public class ConfigUtil {

    public static Settings getConfig() {
        Yaml yaml = new Yaml(new Constructor(Settings.class));
        File initialFile = new File("src/resources/Settings.yaml");
        InputStream inputStream = new FileInputStream(initialFile);
        Settings settings = yaml.load(inputStream);
        return settings;
    }
}