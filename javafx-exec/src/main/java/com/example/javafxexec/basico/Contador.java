package com.example.javafxexec.basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;

public class Contador extends Application {

    private int contador = 0;

    private void atualizarLabelNumero(Label labelNumero) {
        labelNumero.setText(Integer.toString(contador));

        labelNumero.getStyleClass().remove("verde");
        labelNumero.getStyleClass().remove("vermelho");

        if (contador > 0) {
            labelNumero.getStyleClass().add("verde");
        } else if (contador < 0) {
            labelNumero.getStyleClass().add("vermelho");
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label labelTitulo = new Label("Contador");
        labelTitulo.getStyleClass().add("titulo");

        Label labelNumero = new Label("0");
        labelNumero.getStyleClass().add("numero");

        Button botaoDecremento = new Button("-");
        botaoDecremento.getStyleClass().add("botoes");
        botaoDecremento.setOnAction(e -> {
            contador--;
            atualizarLabelNumero(labelNumero);
        });

        Button botaoIncremento = new Button("+");
        botaoIncremento.getStyleClass().add("botoes");
        botaoIncremento.setOnAction(e -> {
            contador++;
            atualizarLabelNumero(labelNumero);
        });

        HBox boxBotoes = new HBox();
        boxBotoes.setAlignment(Pos.CENTER);
        boxBotoes.setSpacing(10);
        boxBotoes.getChildren().addAll(botaoDecremento, botaoIncremento);

        VBox boxConteudo = new VBox();
        boxConteudo.getStyleClass().add("conteudo");
        boxConteudo.setSpacing(10);
        boxConteudo.setAlignment(Pos.CENTER);
        boxConteudo.getChildren().addAll(labelTitulo, labelNumero, boxBotoes);

        String css = "file:///Users/vinicius.saraiva/Projects/java-coder-poo-course/javafx-exec/src/main/java/com/example/javafxexec/basico/Contador.css";

        Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
        cenaPrincipal.getStylesheets().add(css);
        cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");

        primaryStage.setScene(cenaPrincipal);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
