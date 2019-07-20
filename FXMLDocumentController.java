package vesters.jarne.taak.herexamen;

import java.awt.event.ActionEvent;
import java.time.LocalDateTime;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import vesters.jarne.taak.herexamen.Spelbord;
import vesters.jarne.taak.herexamen.SpelbordView;

import static jdk.nashorn.internal.objects.Global.Infinity;
import vesters.jarne.taak.herexamen.Schijf;

public class FXMLDocumentController {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private GridPane gridPane;
    @FXML
    private Label label;
    @FXML
    private Button resetKnop;
    @FXML
    private Button addKnop;
    private Spelbord model;
    private SpelbordView view;

    @FXML
    private void addKnop(ActionEvent event) {
        addKnop.setOnAction(e -> addSchijf());

    }
    public void addSchijf() {
         
    }

    @FXML
    private void resetKnop(ActionEvent event) {


    }

    public void setModel(Spelbord model) {
        this.model = model;
        view = new SpelbordView(model);
        anchorPane.getChildren().add(view);
    }

    @FXML
    void initialize() {
        anchorPane.setFocusTraversable(true);
        resetKnop.setOnAction(event -> reset());
        resetKnop.setFocusTraversable(false);

        GridPane gridPane = new GridPane();
        gridPane.setGridLinesVisible(true);
        gridPane.setLayoutX(50);
        gridPane.setLayoutY(40);
        gridPane.setPrefWidth(600.0);
        gridPane.setPrefHeight(400.0);
        gridPane.setMaxWidth(Infinity);
        gridPane.setMaxHeight(Infinity);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {

                Label label = new Label(i+","+j);
                label.setVisible(false);
                GridPane.setRowIndex(label, i);
                GridPane.setColumnIndex(label, j);
                GridPane.setHgrow(label, Priority.ALWAYS);
                GridPane.setVgrow(label, Priority.ALWAYS);

                gridPane.getChildren().add(label);
            }
        }

        anchorPane.getChildren().add(gridPane);

        gridPane.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

                for( Node node: gridPane.getChildren()) {

                    if( node instanceof Label) {
                        if( node.getBoundsInParent().contains(e.getSceneX(),  e.getSceneY())) {
                            System.out.println( "Clicked " + GridPane.getRowIndex( node) + "," + GridPane.getColumnIndex( node) + "["+((Label) node).getText()+"]");
                        }
                    }
                }
            }
        });
    }

    public void reset() {
        model.reset();
        update();
    }

    public void update() {
        view.update();
    }

    public void handleButtonAction(ActionEvent event) {
        // TODO ?
    }

    public void mouseClicked(MouseEvent mouseEvent) {
        System.out.println(LocalDateTime.now().toString()+"\t " + mouseEvent.getSceneX() + "," + mouseEvent.getSceneY());
        System.out.println(mouseEvent.getX()+","+mouseEvent.getY());
    }
}
