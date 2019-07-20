/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vesters.jarne.taak.herexamen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import vesters.jarne.taak.herexamen.FXMLDocumentController;
import vesters.jarne.taak.herexamen.Spelbord;
/**
 *
 * @author jarne
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Spelbord model = new Spelbord(20,20);
        FXMLLoader lader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        Parent root = lader.load();
        
        FXMLDocumentController controller = lader.getController();
        
        controller.setModel(model);
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
