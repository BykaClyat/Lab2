package com.example.lab2_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    public TextField wysokosc;
    public TextField promien;
    public TextField szerokosc;
    public TextField kosztZw;
    public TextField ciezarZw;
    public TextField kosztNier;
    public TextField ciezarNier;
    public Button Button;
    int intWysokosc;
    int intPromien;
    int intSzerokosc;
    double doubleKosztZw;
    double doubleCiezarZw;
    double doubleKosztNier;
    double doubleCiezarNier;

    public void Oblicz(ActionEvent actionEvent) {
        intWysokosc = Integer.parseInt(wysokosc.getText());
        intPromien = Integer.parseInt(promien.getText());
        intSzerokosc = Integer.parseInt(szerokosc.getText());

        doubleKosztZw = (2 * 3.14 * intPromien *(intPromien * intWysokosc)) * intSzerokosc;
        doubleCiezarZw = doubleKosztZw * 1.45;
        doubleKosztNier = doubleKosztZw * 2.10;
        doubleCiezarNier = doubleKosztZw * 1.50;

        kosztZw.setText(""+doubleKosztZw);
        ciezarZw.setText(""+doubleCiezarZw);
        kosztNier.setText(""+doubleKosztNier);
        ciezarNier.setText(""+doubleCiezarNier);
    }
}