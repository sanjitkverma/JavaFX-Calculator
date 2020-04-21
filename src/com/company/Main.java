//Lab 9 Sanjit Verma COMP 167
package com.company;
import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main (String[] args){
        Application.launch(args);
    }
    public void start(Stage stage){
        stage.setTitle(" GUI Calculator");
        TextField texts = new TextField();
        GridPane pane = new GridPane();


        HBox buttons = new HBox(70);
        Button sqrt = new Button("√ ");
        Button square = new Button ("X^2");
        Button clear = new Button ("CLR");
        buttons.getChildren().addAll(sqrt,square,clear);
        buttons.setAlignment(Pos.CENTER);

//Layout
        Button button1 = new Button("1");
        button1.setStyle("-fx-background-radius: 6em; " + "-fx-min-width: 60px; " + "-fx-min-height: 60px;"+"-fx-background-color: #84d2ff");

        Button button2 = new Button("2");
        button2.setStyle("-fx-background-radius: 6em; " + "-fx-min-width: 60px; " + "-fx-min-height: 60px;"+"-fx-background-color: #84d2ff");
        Button button3 = new Button("3");
        button3.setStyle("-fx-background-radius: 6em; " + "-fx-min-width: 60px; " + "-fx-min-height: 60px;"+"-fx-background-color: #84d2ff");

        Button button4 = new Button("4");
        button4.setStyle("-fx-background-radius: 6em; " + "-fx-min-width: 60px; " + "-fx-min-height: 60px;"+"-fx-background-color: #84d2ff");

        Button button5 = new Button("5");
        button5.setStyle("-fx-background-radius: 6em; " + "-fx-min-width: 60px; " + "-fx-min-height: 60px;"+"-fx-background-color: #84d2ff");

        Button button6 = new Button("6");
        button6.setStyle("-fx-background-radius: 6em; " + "-fx-min-width: 60px; " + "-fx-min-height: 60px;"+"-fx-background-color: #84d2ff");

        Button button7 = new Button("7");
        button7.setStyle("-fx-background-radius: 6em; " + "-fx-min-width: 60px; " + "-fx-min-height: 60px;"+"-fx-background-color: #84d2ff");

        Button button8 = new Button("8");
        button8.setStyle("-fx-background-radius: 6em; " + "-fx-min-width: 60px; " + "-fx-min-height: 60px;"+"-fx-background-color: #84d2ff");

        Button button9 = new Button("9");
        button9.setStyle("-fx-background-radius: 6em; " + "-fx-min-width: 60px; " + "-fx-min-height: 60px;"+"-fx-background-color: #84d2ff");

        pane.add(button1,0,0);
        pane.add(button2,1,0);
        pane.add(button3,2,0);

        pane.add(button4,0,1);
        pane.add(button5,1,1);
        pane.add(button6,2,1);

        pane.add(button7,0,2);
        pane.add(button8,1,2);
        pane.add(button9,2,2);

        VBox calc = new VBox(20);
        calc.setPrefSize(250,310);
        calc.getChildren().addAll(texts,pane,buttons);
        pane.setHgap(35);
        pane.setVgap(20);


//Button Value Set
        sqrt.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                String text = texts.getText();
                Double number = Double.parseDouble(text);
                Double sqrtDouble = Math.sqrt(number);
                String output = Double.toString(sqrtDouble);
                texts.setText(output);
            }});

        square.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                String text = texts.getText();
                Double number = Double.parseDouble(text);
                Double squareDouble = number * number;
                String output = Double.toString(squareDouble);
                texts.setText(output);
            }});

        clear.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                texts.setText("");
            }});

        button1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                String text = texts.getText();
                String textF = text + "1";
                texts.setText(textF);
            }});

        button2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                String text = texts.getText();
                String textF = text + "2";
                texts.setText(textF);
            }});

        button3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                String text = texts.getText();
                String textF = text + "3";
                texts.setText(textF);
            }});

        button4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                String text = texts.getText();
                String textF = text + "4";
                texts.setText(textF);
            }});

        button5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                String text = texts.getText();
                String textF = text + "5";
                texts.setText(textF);
            }});

        button6.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                String text = texts.getText();
                String textF = text + "6";
                texts.setText(textF);
            }});

        button7.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                String text = texts.getText();
                String textF = text + "7";
                texts.setText(textF);
            }});

        button8.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                String text = texts.getText();
                String textF = text + "8";
                texts.setText(textF);
            }});

        button9.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                String text = texts.getText();
                String textF = text + "9";
                texts.setText(textF);
            }});


        Scene scene = new Scene(calc);
        stage.setScene(scene);
        stage.show();
    }
}
