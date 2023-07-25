package mgbbanonymizer.util;

import java.io.File;
import java.io.FileInputStream;

import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import mgbbanonymizer.model.Settings;

public class ConfigUtil {

    public static Settings getConfig() {
        try {
            LoaderOptions options = new LoaderOptions();
            Constructor constructor = new Constructor(Settings.class, options);
            TypeDescription carDescription = new TypeDescription(Settings.class);
            constructor.addTypeDescription(carDescription);
            Yaml yaml = new Yaml(constructor);
    
            FileInputStream configFile = new FileInputStream(new File("../resources/config.yml"));
            Settings yamlFile = yaml.load(configFile);
            return yamlFile;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}