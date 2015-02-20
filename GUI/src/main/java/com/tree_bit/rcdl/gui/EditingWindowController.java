package com.tree_bit.rcdl.gui;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class EditingWindowController {
	@FXML
	private Tab tab1;

	@FXML
	private BorderPane tabContainer;

	private MainApp mainApp;

	public EditingWindowController() {
	}

	@FXML
	public void initialize() {
		tab1.setContent(showEditableTextField());
	}

	private Node showEditableTextField() {
		AnchorPane editableTextField;
		try
		{
			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("EditableTextField.fxml"));
			editableTextField = (AnchorPane) loader.load();

			// tab1.setContent(editableTextField);
			tabContainer.setCenter(editableTextField);

			return editableTextField;

		}
		catch (IOException e)
		{
			throw new IllegalStateException("File nicht gefunden");
		}

	}

	/**
	 * Is called by the main application to give a reference back to itself.
	 *
	 * @param mainApp
	 */
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

}
