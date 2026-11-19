
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
public class CalculatorApp extends Application {
    public static void main(String[] args) 
    {
    launch(args);
    }

    @Override 
    public void start(Stage primaryStage)
    {
primaryStage.setTitle("calculator");

Button b1 = new Button("1");
Button b2 = new Button("2");
Button b3 = new Button("3");
Button b4 = new Button("4");
Button b5 = new Button("5");
Button b6 = new Button("6");
Button b7 = new Button("7");
Button b8 = new Button("8");
Button b9 = new Button("9");
Button b0 = new Button("0");
HBox hbox = new HBox(b1, b2, b3, b4, b5, b6, b7, b8, b9, b0);

Scene scene = new Scene(hbox, 400, 300);

primaryStage.setScene(scene);

primaryStage.show();
    }
}
