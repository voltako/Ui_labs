package com.example.sevenlab;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class Controller implements Initializable{

    @FXML
    private ScrollPane scrollPane;
    @FXML
    private Pane pane;
    @FXML
    private Button startbtn;
    @FXML
    private Button stopbtn;
    @FXML
    private ListView listView;
    @FXML
    private Button nextbtn;
    @FXML
    private Button againBtn;
    @FXML
    private TextField nameOfMusic;
    @FXML
    private Slider volumeMusicSlider;
    @FXML
    private ProgressBar songProgressBar;
    @FXML
    private ImageView imageView;
    @FXML
    private Label nameLabel;
    @FXML
    private Slider musicSlider;

    private Media media;
    private MediaPlayer mediaPlayer;


    private File directory;
    private File image;
    private File[] files;
    private ArrayList<File> songs;
    private  int songNumber;

    private Timer timer;
    private TimerTask task;
    private boolean running;

    private String path = "C:\\Users\\karna\\Desktop\\Ui_labs\\sevenlab\\src\\main\\resources\\com\\example\\sevenlab\\music";

    public Controller() {
    }


    @FXML
    void initialize() {



    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        songs = new ArrayList<File>();

        directory = Paths.get(path).toFile();



        files = directory.listFiles();



        ObservableList<File> song = FXCollections.observableArrayList(files);
        listView.setItems(song);
        listView.setOnMouseClicked(event -> {
            playSelectMedia(listView.getOnMouseClicked());
        });



        if(files !=null){

            for(File file: files){
                songs.add(file);
            }
        }

        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        nameOfMusic.setText(songs.get(songNumber).getName());
        nameLabel.setText(songs.get(songNumber).getName());




        startbtn.setOnAction(event -> {
            playMedia();
        });
        stopbtn.setOnAction(event -> {
            pauseMedia();
        });

        againBtn.setOnAction(event -> {
            againMedia();
        });
        nextbtn.setOnAction(event -> {
            nextMedia();
        });

        volumeMusicSlider.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                mediaPlayer.setVolume(50);
                mediaPlayer.setVolume(volumeMusicSlider.getValue()*0.01);
            }
        });




    }

    public void playMedia() {
        beginTimer();
        mediaPlayer.setVolume(50);
        mediaPlayer.setVolume(volumeMusicSlider.getValue() * 0.01);
        mediaPlayer.play();
        nameOfMusic.setText(songs.get(songNumber).getName());
        nameLabel.setText(songs.get(songNumber).getName());
    }


    public void playSelectMedia(EventHandler<? super MouseEvent> onMouseClicked){
        playMedia();
        }


    public void pauseMedia() {
        cancelTimer();
    mediaPlayer.pause();
    }

    public void againMedia(){
        songProgressBar.setProgress(0);
        mediaPlayer.seek(Duration.seconds(0.0));
    }

    public void nextMedia(){

        if(songNumber < songs.size()-1){

            songNumber++;
            mediaPlayer.stop();
            media = new Media(songs.get(songNumber).toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            nameOfMusic.setText(songs.get(songNumber).getName());
            if(running){
                cancelTimer();
            }
            playMedia();
        }else {
            songNumber=0;
            mediaPlayer.stop();
            media = new Media(songs.get(songNumber).toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            nameOfMusic.setText(songs.get(songNumber).getName());
            if(running){
                cancelTimer();
            }
            playMedia();
        }

    }


    public void beginTimer(){
        timer = new Timer();
        task = new TimerTask() {

            public  void run(){
                running=true;
                double current = mediaPlayer.getCurrentTime().toSeconds();
                double end = media.getDuration().toSeconds();
                System.out.println(current/end);
                songProgressBar.setProgress(current/end);

                if(current/end == 1){
                    cancelTimer();
                }
            }


        };
        timer.scheduleAtFixedRate(task,0,1000);

    }

    public void cancelTimer(){
        running = false;
        timer.cancel();

    }





}