package dad.maven.buscarReemplazar;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class BuscarReemplazar extends Application {

	private Label BuscarLabel;
	private Label ReemplazarLabel;
	private TextField BuscarText;
	private TextField ReemplazarText;
	
	private CheckBox mayusMinusCheckBox;
	private CheckBox ExpresionCheckBox;
	private CheckBox BuscarCheckBox;
	private CheckBox ResaltarCheckBox;
	
	private Button BuscarButton;
	private Button ReemplazarButton;
	private Button ReemplazarTodoButton;
	private Button CerrarButton;
	private Button AyudaButton;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		launch(args);
	}
}
