package TaskMaster;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExportGUI extends Application {
	
	private VBox vBox,vBox_2,vBox_3;
	private Label notComplete, completed;
	private BorderPane bp;
	private TextArea notCompList,compList;
	private Button saveButton;
	private String ncListExport,cListExport;
	
	private ExportGUI_window window = new ExportGUI_window();
    
	public void start(Stage stage) {
    	
    	vBox     = new VBox();
    	vBox_2   = new VBox();
    	vBox_3   = new VBox();
        bp       = new BorderPane();

 
        //Not completed area
        notComplete = new Label("Not completed:");
        notCompList = new TextArea("ADD NONCOMPLETED");
        vBox_2.getChildren().addAll(notComplete,notCompList);
        cListExport = notCompList.getText();
        notCompList.setEditable(false); //set the Text area to be "untouchable" \
        notCompList.setPrefHeight(350);
        /********************************************/
         
        
        
        //completed Area
        completed   = new Label("Completed");
        compList    = new TextArea("ADD Completed");
        vBox_3.getChildren().addAll(completed,compList);
        ncListExport = compList.getText();
        compList.setEditable(false); //set the Text area to be "untouchable" \
        compList.setPrefHeight(350);
        /********************************************/
   
        
        
    	saveButton = new Button("SAVE");
    	saveButton.setOnAction((e)->//set the an action for when the user clicks on the button
    	{ 
    		Stage stage_2 = new Stage();
    		window.start(stage_2, cListExport, ncListExport);
    	});
    	
    	bp.setCenter(saveButton); //centers the button
    	saveButton.setTranslateY(-2); //adjust the button
    	
    	vBox.setSpacing(5); 
    	vBox.getChildren().addAll(vBox_2,vBox_3,bp);
    	Scene scene = new Scene(vBox, 800, 550);
    	
    	stage.setTitle("Export");
    	stage.setScene(scene);
    	stage.show();	
    	
    }
}