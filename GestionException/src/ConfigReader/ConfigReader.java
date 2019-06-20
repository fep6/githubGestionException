package ConfigReader;

import java.io.InputStream;

import com.sun.javafx.scene.control.Properties;

public class ConfigReader {
	ConfigReader() throws Exception {
		Properties properties = new Properties();
		Main leMain = new Main();
		boolean superUser = leMain.isSuperUser();
		InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream("config.properties");
		properties.load(input);

		try {
		cases = Integer.valueOf(properties.getProperty("NbCase", "4"));
		colors = Integer.valueOf(properties.getProperty("NbCouleurSelec", "5"));
		trials = Integer.valueOf(properties.getProperty("NbEssai", "10"));
		if (superUser) developerMode = true;
		else {
		developerMode = Boolean.valueOf(properties.getProperty("developerMode", "false"));
		}
		} catch (NumberFormatException e) {
		System.out.println("Error while reading configuration.");
		}
		}
}
