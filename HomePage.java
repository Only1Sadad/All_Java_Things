package com.example.projectfx;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

/***
 * Program:BasicHomePage
 * Programmer:Sadad Yusuf
 * Dat:0ct-26-2024

 * PSEUDOCODE:
 * START
 *     On function start(stage)
 *         Create main layout (BorderPane)
 *         Set background color of layout

 *         Create title with text "Burrito Loco" of our restaurant
 *         Place title to the top of layout

           Load burrito image and add to the center of layout

 *         Create buttons store (Menu, Coupons, Info)
 *         ADD buttons to the bottom of layout

 *         Create Scene with layout
 *         Set stage title
 *         Show stage
 *     END Function.
 *          Function main
 *         CALL launch() to start the application
 *     END FUNCTION
 * END Program.
 */

public class HomePage extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root,400, 400);
        root.setStyle("-fx-background-color: FFDBBB;"); // Light beige color


        // titles
        Text title = new Text("Burrito Loco");
        title.setFont(Font.font("Arial",36));
        title.setStyle("-fx-fill: OrangeRed;");
        root.setTop(title);
        BorderPane.setAlignment(title, Pos.CENTER);

        //Image
        Image burritoImage = new Image("Burrito.jpg");
        ImageView viewBurrito = new ImageView(burritoImage);
        viewBurrito.setFitWidth(300);
        viewBurrito.setPreserveRatio(true);
        root.setCenter(viewBurrito);

        //Buttons
        Button menuButton = new Button("Menu:");
        Button couponButton = new Button("Coupon:");
        Button infoButton = new Button("Info:");
        HBox buttons = new HBox(20,menuButton, couponButton,infoButton);
        buttons.setStyle("-fx-padding: 20; -fx-alignment: center;");
        root.setBottom(buttons);

        //stagings
        stage.setTitle("Welcome");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}