import javafx.application.Application;
//import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class CalculatorApp extends Application {
    public static void main(String[] args) 
    {
    launch(args);
    }

    @Override 
    public void start(Stage primaryStage)
    {
primaryStage.setTitle("calculator");
//buttons
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
//other buttons for symbols
Button bp = new Button("+");
Button bs = new Button("-");
Button bm = new Button("*");
Button bd = new Button("/");
Button be = new Button("=");
Button bc = new Button("clear");
//grid to space out buttons 
//grid/scene
GridPane grid = new GridPane();
//Scene scene = new Scene(grid, 400, 300);
grid.setHgap(10);
grid.setVgap(10);
//text fields 
TextField textFieldO = new TextField();
TextField textFieldA = new TextField();

//button placements (x,y)

grid.add(b1, 0, 0);
grid.add(b2, 1, 0);
grid.add(b3, 2, 0);
grid.add(b4, 3, 0);
grid.add(b5, 4, 0);
grid.add(b6, 5, 0);
grid.add(b7, 6, 0);
grid.add(b8, 7, 0);
grid.add(b9, 8, 0);
grid.add(b0, 9, 0);
//symbol buttons, under 
grid.add(bp, 0, 1);
grid.add(bs, 1, 1);
grid.add(bm, 2, 1);
grid.add(bd, 3, 1);
grid.add(be, 5, 1);
grid.add(bc, 9, 1);

//output for equation, under is answer( buttons ^ equation > answer)
//another grid for equation and answer(affected button space in same box)
HBox bbox = new HBox(10,textFieldO, textFieldA);

VBox root = new VBox(20, grid, bbox);

Scene scene = new Scene(root, 400, 150);

primaryStage.setScene(scene);

primaryStage.show();
    }
}
