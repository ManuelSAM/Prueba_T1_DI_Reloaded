package controlador;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import vista.MyController;

/**
 *
 * @author Manuel San Antonio Morales
 *
 * Random application that moves between 2 windows
 * @version 1.0
 * @see MainApp
 *
 */

public class MainApp extends Application {

	private Stage escenario;
	private AnchorPane layout;

	/**
	 * Method that starts application setting a title and an icon
	 */
	@Override
	public void start(Stage oneStage) {

		try {
			this.escenario = oneStage;
			this.escenario.setTitle("My Reloaded");
			initRootLayout();
			this.escenario.getIcons().add(new Image("file:img/ic_casino_black_48dp.png"));

			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class
					.getResource("../vista/OneStage2.fxml"));
			AnchorPane OneStage = (AnchorPane) loader.load();
			MyController controller = loader.getController();
			controller.setMainApp(this);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Initializes application with first stage
	 */
	public void initRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class
					.getResource("../vista/OneStage2.fxml"));
			layout = loader.load();
			Scene scene = new Scene(layout);
			escenario.setScene(scene);
			MyController controller = loader.getController();
			controller.setMainApp(this);
			escenario.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Shows second stage
	 */
	public void mostrar_OtherStage() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class
					.getResource("../vista/OtherStage2.fxml"));
			layout = loader.load();
			Scene scene = new Scene(layout);
			escenario.setScene(scene);
			MyController controller = loader.getController();
			controller.setMainApp(this);

			escenario.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Shows second stage
	 */
	public void mostrar_OneStage() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("../vista/OneStage2.fxml"));

			layout = loader.load();
			Scene scene = new Scene(layout);
			escenario.setScene(scene);
			MyController controller = loader.getController();
			controller.setMainApp(this);

			escenario.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}

	public Stage getOneStage() {
		return escenario;
	}

	public void setOneStage(Stage oneStage) {
		escenario = oneStage;
	}

	public Stage getOtherStage() {
		return escenario;
	}

	public void setOtherStage(Stage otherStage) {
		escenario = otherStage;
	}

	public AnchorPane getRootLayout() {
		return layout;
	}

	public void setRootLayout(AnchorPane rootLayout) {
		this.layout = rootLayout;
	}

}
