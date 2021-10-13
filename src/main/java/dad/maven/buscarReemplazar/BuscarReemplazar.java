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

		// TexField y Label
		BuscarLabel = new Label("Buscar:");
		ReemplazarLabel = new Label("Reemplazar:");

		BuscarText = new TextField();
		ReemplazarText = new TextField();

		// Checkbox
		mayusMinusCheckBox = new CheckBox("Mayusculas y minusculas");
		ExpresionCheckBox = new CheckBox("Expresion regular");
		BuscarCheckBox = new CheckBox("Buscar hacia atrás");
		ResaltarCheckBox = new CheckBox("Resaltar resultados");
		
		HBox checkbox1 = new HBox();
		checkbox1.setSpacing(5);
		checkbox1.setAlignment(Pos.CENTER);
		checkbox1.getChildren().addAll(mayusMinusCheckBox, ExpresionCheckBox);
		
		HBox checkbox2 = new HBox();
		checkbox2.setSpacing(5);
		checkbox2.setAlignment(Pos.CENTER);
		checkbox2.getChildren().addAll( BuscarCheckBox, ResaltarCheckBox);

		// Botones
		BuscarButton = new Button("Buscar");
		ReemplazarButton = new Button("Reemplazar");
		ReemplazarTodoButton = new Button("Reemplazar todo");
		CerrarButton = new Button("Cerrar");
		AyudaButton = new Button("Ayuda");

		VBox botonera = new VBox();
		botonera.setSpacing(5);
		botonera.setAlignment(Pos.CENTER);
		botonera.getChildren().addAll(BuscarButton, ReemplazarButton, ReemplazarTodoButton, CerrarButton, AyudaButton);
		botonera.setFillWidth(false);
		
		GridPane root = new GridPane();
		root.setPadding(new Insets(5));
		root.setHgap(5);
		root.setVgap(5);
		// Mostrar lineas
		root.setGridLinesVisible(true);

		root.addRow(0, new Label("Buscar:"), BuscarText);
		root.addRow(1, new Label("Reemplazar:"), ReemplazarText);
		root.addRow(2, new HBox(5, mayusMinusCheckBox, ExpresionCheckBox));
		//root.addRow(3, new HBox(5, BuscarCheckBox, ResaltarCheckBox));
		//root.addRow(4, new VBox(5, BuscarButton, ReemplazarButton, ReemplazarTodoButton, CerrarButton, AyudaButton));
		 
	 
		root.add(botonera, 2, 3);
		
		
		// Restricciones
		ColumnConstraints[] cols = { new ColumnConstraints(), new ColumnConstraints(), };
		root.getColumnConstraints().setAll(cols);

		cols[0].setHalignment(HPos.CENTER);
		cols[1].setHgrow(Priority.ALWAYS);
		cols[1].setFillWidth(true);
		
		
		RowConstraints[] rows = { new RowConstraints(), new RowConstraints(), new RowConstraints(),
							      new RowConstraints(), new RowConstraints(), };

		root.getRowConstraints().setAll(rows);

		Scene scene = new Scene(root, 320, 200);
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

//	public void start(Stage primaryStage) throws Exception {
//		BuscarText = new TextField();
//
//		ReemplazarText = new TextField();
//
//		BuscarButton = new Button("Buscar");
//		BuscarButton.setMaxWidth(100);
//		ReemplazarButton = new Button("Reemplazar");
//		ReemplazarButton.setMaxWidth(100);
//		ReemplazarTodoButton = new Button("Reemplazar todo");
//		ReemplazarTodoButton.setMaxWidth(100);
//		CerrarButton = new Button("Cerrar");
//		CerrarButton.setMaxWidth(100);
//		AyudaButton = new Button("Ayuda");
//		AyudaButton.setMaxWidth(100);
//
//		VBox botonesBox = new VBox(5);
//		botonesBox.getChildren().addAll(BuscarButton, ReemplazarButton, ReemplazarTodoButton, CerrarButton,
//				AyudaButton);
//		CheckBox mayMinBox = new CheckBox("Mayusculas y minusculas");
//		CheckBox mostraBox = new CheckBox("Mostrar atras");
//		VBox checkboxBox = new VBox(5);
//		checkboxBox.getChildren().addAll(mayMinBox, mostraBox);
//
//		CheckBox expresionBox = new CheckBox("Expresion regular");
//		CheckBox resaltarBox = new CheckBox("Resaltar resultado");
//		VBox checkboxBox2 = new VBox(5);
//		checkboxBox2.getChildren().addAll(expresionBox, resaltarBox);
//
//		HBox chekBox = new HBox(5);
//		chekBox.getChildren().addAll(checkboxBox, checkboxBox2);
//
//		GridPane formPane = new GridPane();
//
//		formPane.setHgap(5);
//		formPane.setVgap(5);
//		formPane.setPadding(new Insets(5));
//		formPane.addRow(0, new Label("Buscar: "), BuscarText);
//		formPane.addRow(1, new Label("Reemplazar con: "), ReemplazarText);
////		formPane.addRow(2, checkboxBox);
//		formPane.addColumn(1, chekBox);
//		formPane.addColumn(2, botonesBox);
//		GridPane.setRowSpan(botonesBox, 5);
//
//		ColumnConstraints[] cols = { new ColumnConstraints(), new ColumnConstraints(), new ColumnConstraints() };
//		formPane.getColumnConstraints().setAll(cols);
//		cols[1].setHgrow(Priority.ALWAYS);
//
//		// restricciones especifica
//
////		GridPane.setFillWidth(dniText, false);
//
//		// panel inferior
//
//		// panel raiz
//
//		BorderPane root = new BorderPane();
//		root.setPadding(new Insets(5));
//		root.setCenter(formPane);
//
//		// escena
//
//		Scene scene = new Scene(root, 640, 480);
//		primaryStage.setTitle("GridPane Sample");
//		primaryStage.setScene(scene);
//		primaryStage.show();
//	}

	public static void main(String[] args) {
		launch(args);
	}
}
