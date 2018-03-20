package edu.iit.controller;

import java.awt.Button;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * 
 * @author Jaswanth Busnur Jagadeesh
 * @version 1.0
 *
 */
/**
 * 
 * Login class to enter the user details to login to the application using valid
 * credentials
 *
 */
public class Login {

	@FXML
	private Button login;

	@FXML
	private TextField username;

	@FXML
	private TextField password;

	@FXML
	private Label loginStatus;

	private Stage dialogStage;

	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}

	public void loginTraverse() throws IOException {

		if (username.getText().equals("jaswanth") && password.getText().equals("itmd510")) {
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/edu/iit/view/AdminPage.fxml"));
			setSceneMethod(primaryStage, loader);
		} else {
			String username = this.username.getText();
			if (username == null || username.trim().equals("")) {
				return;
			}

			String password = this.password.getText();
			if (password == null || password.trim().equals("")) {
				return;
			}
			// Create the model object
			//UserDetails userDetails = new UserDetails();

//			userDetails.setBc_member_name(username);
//			userDetails.setBc_member_password(password);

			/*LoginDAO log = new LoginDAO();
			UserDetails details = new UserDetails();*/
			/*details = log.validate(username, password);

			String uname = details.getBc_member_name();
			String pwd = details.getBc_member_password();
			if (uname == "" && pwd == "") {
				setTextVal("Username and Password entered is invalid! Please enter correct details");
			} else {
				Stage primaryStage = new Stage();
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/edu/iit/view/UserDetailsPage.fxml"));
				setSceneMethod(primaryStage, loader);
			}
		}*/
		}
	}

	private void setSceneMethod(Stage primaryStage, FXMLLoader loader) throws IOException {
		AnchorPane root = (AnchorPane) loader.load();
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void close() {
		dialogStage.fireEvent(new WindowEvent(dialogStage, WindowEvent.WINDOW_CLOSE_REQUEST));
	}

	public void cancel() {
		close();
	}

	public void setTextVal(String text) {
		loginStatus.setText(text);
	}
}