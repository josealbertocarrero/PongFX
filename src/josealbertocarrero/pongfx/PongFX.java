/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josealbertocarrero.pongfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author DaSTer
 */
public class PongFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene ventana = new Scene(root, 600, 400);
        primaryStage.setTitle("PongFX");
        primaryStage.setScene(ventana);
        primaryStage.show();
        //Vamos a cambiar el color de la ventana (el fondo en negro)
        ventana.setFill(Color.BLACK);
        //Creación del circulo con la clase Circle
        Circle bola = new Circle(10, 30, 7);
        //Ahora vamos a cambiar el color de la bola llamando al método setFill que nos permiete cambiarlo
        bola.setFill(Color.WHITE);
        //El circulo no se muestra hasta que no hacemos un Layout con esta sentencia
        //que vamos a crear a continuacion (hace referencia al root stackpanel que hemos creado en la linea 22)
        root.getChildren().add(bola);
        
    }
}