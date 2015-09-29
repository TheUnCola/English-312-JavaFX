package main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	private Stage initial;
    private BorderPane rootLayout;
    
    public Main() {
    	
    }
    
	public Main(Stage initial, BorderPane rootLayout) {
		super();
		this.initial = initial;
		this.rootLayout = rootLayout;
	}
    
	@Override
    public void start(Stage initial) {
        this.initial = initial;
        this.initial.setTitle("FullCycle");

        initRootLayout();
    }
	
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("application/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            initial.setScene(scene);
            initial.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
