package TaskMaster;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;	//**Need to import to handle event
import javafx.event.EventHandler;	//**Need to import to handle event

import java.util.ArrayList;
import javafx.scene.layout.HBox;

public class GUI1ButtonsandListPane extends HBox{
	private ArrayList<Task> taskList;
	private ListView<Task> listView;
	private Button Add;
	private Button Delete;
	private Button Change;
	private Button Complete;
	public GUI1ButtonsandListPane(ArrayList<Task> list)
	{
		this.taskList = list;
		VBox buttonlist = new VBox();
		Add = new Button("Add");
		Delete = new Button("Delete");
		Change = new Button("Change");
		Complete = new Button("Complete");
		buttonlist.getChildren().addAll(Add,Delete,Change,Complete);
		listView = new ListView<Task> ();
		this.getChildren().addAll(buttonlist,listView);
	}
	//Missing Listeners
		
}
