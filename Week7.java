import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/*
Mainpage w/ documentation: https://openjfx.io/
Putting an image on a page: https://www.tutorialspoint.com/how-to-display-an-image-in-javafx
Public github with lots of examples: https://github.com/jjenkov/javafx-examples?tab=readme-ov-file
*/

public class Week7 extends Application {

	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) {
		primaryStage.setTitle("Hello");

		Button firstButton = new Button("CLICK ME");

		StackPane layout = new StackPane();
		layout.getChidlren().add(firstButton);

		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}