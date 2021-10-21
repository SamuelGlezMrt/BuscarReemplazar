package dad.maven.buscarReemplazar;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
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

		// TexField		
		BuscarText = new TextField();
		ReemplazarText = new TextField();

		// Checkbox
		mayusMinusCheckBox = new CheckBox("Mayusculas y minusculas");
		ExpresionCheckBox = new CheckBox("Expresion regular");
		BuscarCheckBox = new CheckBox("Buscar hacia atrás");
		ResaltarCheckBox = new CheckBox("Resaltar resultados");

		VBox checkbox1 = new VBox();
		checkbox1.setSpacing(5);
		checkbox1.getChildren().addAll(mayusMinusCheckBox, ExpresionCheckBox);

		VBox checkbox2 = new VBox();
		checkbox2.setSpacing(5);
		checkbox2.getChildren().addAll(BuscarCheckBox, ResaltarCheckBox);

		HBox checkbox = new HBox();
		checkbox.setSpacing(5);
		checkbox.getChildren().addAll(checkbox1, checkbox2);

		// Botones
		BuscarButton = new Button("Buscar");
		BuscarButton.setMaxWidth(100);
		ReemplazarButton = new Button("Reemplazar");
		ReemplazarButton.setMaxWidth(100);
		ReemplazarTodoButton = new Button("Reemplazar todo");
		ReemplazarTodoButton.setMaxWidth(100);
		CerrarButton = new Button("Cerrar");
		CerrarButton.setMaxWidth(100);
		AyudaButton = new Button("Ayuda");
		AyudaButton.setMaxWidth(100);

		VBox botonera = new VBox();
		botonera.setSpacing(5);
		botonera.getChildren().addAll(BuscarButton, ReemplazarButton, ReemplazarTodoButton, CerrarButton, AyudaButton);

		GridPane root = new GridPane();
		root.setPadding(new Insets(5));
		root.setHgap(5);
		root.setVgap(5);
		
		root.addRow(0, new Label("Buscar:"), BuscarText);
		root.addRow(1, new Label("Reemplazar con:"), ReemplazarText);
		root.addColumn(1, checkbox);
		root.addColumn(2, botonera);
		GridPane.setRowSpan(botonera, 5);
 		
		// Mostrar lineas
		root.setGridLinesVisible(false);
		
		// Restricciones
		ColumnConstraints[] cols = { new ColumnConstraints(), new ColumnConstraints(), new ColumnConstraints() };
		root.getColumnConstraints().setAll(cols);

		cols[1].setHgrow(Priority.ALWAYS);
		
		Scene scene = new Scene(root, 400, 320);
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
