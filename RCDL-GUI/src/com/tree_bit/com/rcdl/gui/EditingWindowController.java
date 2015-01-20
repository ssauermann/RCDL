package com.tree_bit.com.rcdl.gui;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;

public class EditingWindowController {
	@FXML
	private Tab tab1;

	private MainApp mainApp;

	public EditingWindowController() {
	}

	@FXML
	public void initialize() {
		tab1.setContent(showEditableTextFiled());
	}

	private Node showEditableTextFiled() {
		AnchorPane editableTextField;
		try
		{
			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("EditableTextField.fxml"));
			editableTextField = (AnchorPane) loader.load();

			tab1.setContent(editableTextField);
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
