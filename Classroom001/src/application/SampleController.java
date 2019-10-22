package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SampleController {
	@FXML
    private Button btnLogin;

    @FXML
    private TextField txtUsuario;

    @FXML
    private TextField txtPassword;
    
    @FXML
    public void login(ActionEvent event) {
    	//Creamos la alerta que aparecerá para decirnos si hemos introducido bien las credenciales
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Información");
    	alert.setHeaderText(null);
    	
    	//Variables ficticias para emular un inicio de sesión
    	String usuario = "Pedro";
    	String password = "1234";
    	
    	//Comprobamos si coinciden los datos del login
    	if(txtUsuario.getText().equals(usuario) && txtPassword.getText().equals(password)) {
    		//Si coincide, nos muestra el siguiente mensaje
    		alert.setContentText("Ha iniciado sesión correctamente");
    	}else {
    		//Si no hemos escrito bien nuestra credenciales, nos muestra este otro
    		alert.setContentText("Email y/o contraseña incorrectos");
    		System.out.println(usuario +" "+password+" "+txtUsuario.getText()+" "+txtPassword.getText()+" ");
    	}
    	
    	alert.showAndWait();
    	
    	
    }

}
