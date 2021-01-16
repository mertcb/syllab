package newui;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

	public static Stage generalStage = null;
	
	/*
	 * TODO Handle exception Here
	 */
	@Override
	public void start(Stage primaryStage) throws IOException {
		generalStage = primaryStage;
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("fxml/main.fxml"));
		BorderPane generalLayout = loader.load();
		generalStage.setTitle("IEU Syllabus Control/Edit System");
		generalStage.getIcons().add(new Image(new FileInputStream(Path.of("src", "newui", "assets", "ieu.png").toFile())));
		generalStage.initStyle(StageStyle.UNDECORATED);
		generalStage.setScene(new Scene(generalLayout));
		generalStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
