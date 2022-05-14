package sample.views;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;

public class Parseador extends Stage implements EventHandler<KeyEvent> {

    private VBox vBox;
    private ToolBar tlbMenu;
    private TextField txtSalida, txtEntrada;  //
    private FileChooser flcArchivo;
    private Button btnAbrir;
    private Scene escena;
    private Image imgAbrir;
    private ImageView imvAbrir;

    public Parseador(){
        CrearUI();
        this.setTitle("Traductor de Código Morse");
        this.setScene(escena);
        this.show();
    }

    private void CrearUI() {
        vBox = new VBox();
        tlbMenu = new ToolBar();
        imgAbrir = new Image("sample/images/7265_mail_open_icon.png");
        imvAbrir = new ImageView(imgAbrir);
        imvAbrir.setFitHeight(35);
        imvAbrir.setFitWidth(35);
        btnAbrir = new Button();
        btnAbrir.setGraphic(imvAbrir);
        btnAbrir.setOnAction(event -> {
            flcArchivo = new FileChooser();
            flcArchivo.setTitle("Selecciona tu archivo...");
            File archivo = flcArchivo.showOpenDialog(this);
            flcArchivo.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Only txt", "*.txt"));
            FileReader fileReader;
            BufferedReader bufferedReader;
            String var="";
            Traductor trad=new Traductor();
            try {
                fileReader=new FileReader(archivo.getAbsolutePath());
                bufferedReader=new BufferedReader(fileReader);
                var=bufferedReader.readLine();                                      //LA VARIABLE STRING ALMACENA LO QUE LEE DE LA LINEA
                txtEntrada.setText(var);                                     //EL CAMPO DE TEXTO MUESTRA LO QUE SE ESCRIBIÓ
                txtSalida.setText(trad.traducir(var));
                bufferedReader.close();

            } catch (FileNotFoundException e) {                //CACHAR ERRORES
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        tlbMenu.getItems().addAll(btnAbrir);
        //....
        txtEntrada = new TextField();   //
        txtSalida = new TextField();
        txtEntrada.setPromptText("Introduce el texto a parsear");
        txtSalida.setDisable(true);            //SE DESHABILITA EL CAMPO DE TEXTO
        txtEntrada.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                Traductor traductor=new Traductor();                               // NUEVO OBJETO TIPO TRADUCTOR
                txtSalida.setText(traductor.traducir(txtEntrada.getText()));
                txtSalida.setDisable(true);
            }
        });
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(5));
        vBox.getChildren().addAll(tlbMenu,txtEntrada,txtSalida);
        escena = new Scene(vBox,600,200);
    }

    @Override
    public void handle(KeyEvent event) {
        System.out.println(event.getCode().toString());
    }
}
