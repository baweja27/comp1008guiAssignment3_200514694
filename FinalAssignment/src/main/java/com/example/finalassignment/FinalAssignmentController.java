package com.example.finalassignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.RadialGradient;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Random;



public class FinalAssignmentController {

    @FXML
    private Pane circle1;

    @FXML
    private Pane circle2;

    @FXML
    private Pane circle3;

    @FXML
    private Pane circle4;

    @FXML
    private Pane circle5;

    @FXML
    private Pane circle6;

    @FXML
    private Pane circle7;

    @FXML
    private Pane circle8;

    @FXML
    private Pane circle9;

    @FXML
    private ColorPicker picker;

    @FXML
    private Label Message;

    @FXML
    private TextField nameOfStudent;

    @FXML
    private Text seat1;

    @FXML
    private Text seat2;

    @FXML
    private Text seat3;

    @FXML
    private Text seat4;

    @FXML
    private Text seat5;

    @FXML
    private Text seat6;

    @FXML
    private Text seat7;

    @FXML
    private Text seat8;

    @FXML
    private Text seat9;


    ArrayList<Integer> arrlist = new ArrayList<Integer>(10);

    int count=0;
    int eof=0;


    int randomFunction(int randomnum){

        while(true){
            Random rand = new Random();
            int max = 9;
            int min = 1;
            int range = max - min + 1;
            int ran = (int) (Math.random() * range) + min;

            if(arrlist.contains(ran)){
                continue;
            }else{
                arrlist.add(ran);
                return ran;

            }
        }
    }


    @FXML
    void onAddStudent(ActionEvent event) {
        Random rand = new Random();
        int error=0;
        String name=nameOfStudent.getText();
        Color color= picker.getValue();
        if(count==9){
            Message.setVisible(true);
            Message.setText("ALL SEATS TAKEN!! NO MORE");
        }
        int randomnum= rand.nextInt(1,10);

        int randomNum = randomFunction(randomnum);



        if(seat1.getText().compareTo(name)==0||seat2.getText().compareTo(name)==0||seat3.getText().equals(name)
                ||seat4.getText().equals(name)||seat5.getText().equals(name)||seat6.getText().equals(name)||
                seat7.getText().equals(name)||seat8.getText().equals(name)||seat9.getText().equals(name)){
            error=1;

            arrlist.remove(arrlist.indexOf(randomNum));
        }

        if(color.toString().equals("0xffffffff"))
            error=2;
        if(circle1.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(circle2.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(circle3.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(circle4.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(circle5.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(circle6.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(circle7.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(circle8.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(circle9.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;

        if(name.isEmpty()){
            error=6;
            Message.setText("Please enter name");
            Message.setVisible(true);
            arrlist.remove(randomNum);
            arrlist.remove(arrlist.indexOf(randomNum));

        }
        if(error==0){
            count++;
            if(randomNum==1){
                Message.setVisible(false);
                circle1.setStyle("-fx-background-color: #" +color.toString().substring(2));
                seat1.setText(name);
                seat1.setVisible(true);

                if(count==9){
                    Message.setVisible(true);
                    Message.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }

            }
            if(randomNum==2){
                Message.setVisible(false);
                circle2.setStyle("-fx-background-color: #" +color.toString().substring(2));
                seat2.setText(name);
                seat2.setVisible(true);
                if(count==9){
                    Message.setVisible(true);
                    Message.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }

            }
            if(randomNum==3){
                Message.setVisible(false);
                circle3.setStyle("-fx-background-color: #" +color.toString().substring(2));
                seat3.setText(name);
                seat3.setVisible(true);

                if(count==9){
                    Message.setVisible(true);
                    Message.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }

            }
            if(randomNum==4){
                Message.setVisible(false);
                circle4.setStyle("-fx-background-color: #" +color.toString().substring(2));
                seat4.setText(name);
                seat4.setVisible(true);
                if(count==9){
                    Message.setVisible(true);
                    Message.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }

            }
            if(randomNum==5){
                Message.setVisible(false);
                circle5.setStyle("-fx-background-color: #" +color.toString().substring(2));
                seat5.setText(name);
                seat5.setVisible(true);
                if(count==9){
                    Message.setVisible(true);
                    Message.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }

            }
            if(randomNum==6){
                Message.setVisible(false);
                circle6.setStyle("-fx-background-color: #" +color.toString().substring(2));
                seat6.setText(name);
                seat6.setVisible(true);
                if(count==9){
                    Message.setVisible(true);
                    Message.setText("CONGRATULATIONS! SEATS TAKEN");eof=20;

                }

            }
            if(randomNum==7){
                Message.setVisible(false);
                circle7.setStyle("-fx-background-color: #" +color.toString().substring(2));
                seat7.setText(name);
                seat7.setVisible(true);
                if(count==9){
                    Message.setVisible(true);
                    Message.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }

            }
            if(randomNum==8){
                Message.setVisible(false);
                circle8.setStyle("-fx-background-color: #" +color.toString().substring(2));
                seat8.setText(name);
                seat8.setVisible(true);
                if(count==9){
                    Message.setVisible(true);
                    Message.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }

            }
            if(randomNum==9){
                Message.setVisible(false);
                circle9.setStyle("-fx-background-color: #" +color.toString().substring(2));
                seat9.setText(name);
                seat9.setVisible(true);
                if(count==9){
                    Message.setVisible(true);
                    Message.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }
            }
        }

        else if(error==1) {
            Message.setText("STUDENT NAME TAKEN!!");
            Message.setStyle("-fx-background-color: rgba(255,0,0,.3)");
            Message.setVisible(true);
//            arrlist.remove(randomNum);
            arrlist.remove((Integer) randomNum);

        }
        else if(error==2) {
            Message.setText("INVALID COLOR");
            Message.setStyle("-fx-background-color: rgba(255,0,0,.3)");
            Message.setVisible(true);
//            arrlist.remove(randomNum);
            arrlist.remove(arrlist.indexOf(randomNum));

        }
        else {
            Message.setVisible(false);
            Message.setText("SEATS ARE FULL!!");
            Message.setStyle("-fx-background-color: rgba(255,0,0,.3)");
            Message.setVisible(true);
        }
    }
    @FXML
    void initialize(){
        seat1.setVisible(false);
        seat3.setVisible(false);
        seat2.setVisible(false);
        seat4.setVisible(false);
        seat5.setVisible(false);
        seat6.setVisible(false);
        seat7.setVisible(false);
        seat8.setVisible(false);
        seat9.setVisible(false);
        Message.setVisible(false);
    }


}