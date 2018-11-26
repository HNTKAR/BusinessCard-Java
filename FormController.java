package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.*;

public class FormController{

	@FXML
	private TextField SelectCardField;
	
	@FXML
	private ImageView CardImage;
	
	@FXML
	protected void BackCard(ActionEvent evt) {
		int i = Integer.parseInt(SelectCardField.getText());
		i = i - 1;
		if (i >= 0) {
			String s = String.valueOf(i);
			SelectCardField.setText(s);
		}
		System.out.println("BACK!!");
	}

	@FXML
	protected void NextCard(ActionEvent evt) {
		int i = Integer.parseInt(SelectCardField.getText());
		i = i + 1;
		if (i <= 10) {
			String s = String.valueOf(i);
			SelectCardField.setText(s);
		}
		Image cardimage = new Image("sss.png");
		CardImage.setImage(cardimage);
		System.out.println("NEXT!!");
	}

	@FXML
	protected void SelectCard(ActionEvent evt) {
		System.out.println("SELECT!!");
	}


}
