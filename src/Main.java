import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {
    
    TextField urlTextBox;
    Button addDownload;
    TableView downloadsTable;
    TableColumn fileNameColumn;
    TableColumn urlColumn;
    TableColumn fileSizeColumn;
    TableColumn progressColumn;
    TableColumn statusColumn;
    Button pauseResumeButton;
    Button cancelButton;
    Button deleteButton;
    
    HBox box1;
    HBox box2;
    HBox box3;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        urlTextBox = new TextField("Put URL here..");
        addDownload = new Button("Add Download");
        downloadsTable = new TableView();
        fileNameColumn = new TableColumn("File Name");
        urlColumn = new TableColumn("URL");
        fileSizeColumn = new TableColumn("Size");
        progressColumn = new TableColumn("Progress");
        statusColumn = new TableColumn("Status");
        
        box1 = new HBox(2);
        box2 = new HBox(2);
        box3 = new HBox(2);
        
        
        
        addDownload.setOnAction(e -> {
            System.out.println("Wow!!");
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(addDownload);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
