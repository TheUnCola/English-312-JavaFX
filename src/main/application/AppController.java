package main.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class AppController {

	// Main Pane
	@FXML
	private Pane MainP;
	@FXML
	private Button ConnectMB;
	@FXML
	private Button ConnectionsMB;
	
	// Connecting Pane
	@FXML
	private Pane ConnectingP;
	@FXML
	private Label ConnectingCL;
	@FXML
	private ProgressIndicator ProgressCInd;
	@FXML
	private Button CancelCB;
	@FXML
	private Button DoneCB;
	@FXML
	private Label ConnectedCL;
	
	// Connections Pane
	@FXML
	private Pane ConnectionsP;
	@FXML
	private Label ConnectionsCL;
	@FXML
	private Label Number1CL;
	@FXML
	private Label Number2CL;
	@FXML
	private Label Number3CL;
	@FXML
	private ImageView FirstImgCIV;
	@FXML
	private ImageView SecondImgCIV;
	@FXML
	private ImageView ThirdImgCIV;
	@FXML
	private Label MaytagEpconCL;
	@FXML
	private Label KenmoreWhirlCL;
	@FXML
	private Label MaytagSteelCL;
	@FXML
	private Button Drop1CB;
	@FXML
	private Button Drop2CB;
	@FXML
	private Button Drop3CB;
	@FXML
	private Label PairedCL;
	
	// Progress Pane
	@FXML
	private Pane ProgressP;
	@FXML
	private Label TimePL;
	@FXML
	private ProgressIndicator ProgressPInd;
	@FXML
	private Label CountDownPL;
	@FXML
	private Button DonePB;
	
	// Done Pane
	@FXML
	private Pane DoneP;
	@FXML
	private Label NoLoadDL;
	
	// Notifications Pane
	@FXML
	private Pane NotificationsP;
	@FXML
	private Label NotificationsNL;
	@FXML
	private Label DryerNL;
	@FXML
	private Button SettingsNB;
	@FXML
	private Label WrinkleNL;
	//@FXML
	//private ComboBox AmPmCCB;
	@FXML
	private Button SubmitNB;
	@FXML
	private Label SubmitSuccessfulNL;
	
	// Settings Pane
	@FXML
	private Pane SettingsP;
	@FXML
	private Label SettingsSL;
	@FXML
	private Label DryerSL;
	@FXML
	private CheckBox DryerSCB;
	@FXML
	private Label CycleSL;
	@FXML
	private CheckBox NormalSCB;
	@FXML
	private CheckBox DelicateSCB;
	@FXML
	private CheckBox PermPressSCB;
	@FXML
	private CheckBox AirFluffSCB;
	@FXML
	private Label HeatSL;
	@FXML
	private CheckBox LowSCB;
	@FXML
	private CheckBox MediumSCB;
	@FXML
	private CheckBox HighSCB;
	@FXML
	private Button SubmitSB;
	@FXML
	private Label SubmitSuccessfulSL;
	
	
	// Back Button Pane
	@FXML
	private Pane BackButtonP;
	@FXML
	private Button BackButtonBB;
	
	// ButtonBar Pane
	@FXML
	private Pane ButtonBarP;
	@FXML
	private Button HomeBB;
	@FXML
	private Button ProgressBB;
	@FXML
	private Button NotificationsBB;
	
	@FXML
	public void initialize() {
		setAllFalse();
		MainP.setVisible(true);
		ButtonBarP.setVisible(true);
	}
	
	public void setAllFalse() {
		MainP.setVisible(false);
		ConnectingP.setVisible(false);
		ConnectionsP.setVisible(false);
		ProgressP.setVisible(false);
		NotificationsP.setVisible(false);
		SettingsP.setVisible(false);
		BackButtonP.setVisible(false);
		SubmitSuccessfulNL.setVisible(false);
		SubmitSuccessfulSL.setVisible(false);
		ButtonBarP.setVisible(false);
		DoneP.setVisible(false);
		PairedCL.setVisible(false);
		ConnectedCL.setVisible(false);
		ConnectingCL.setVisible(true);
	}
	
	@FXML
	public void ConnectMP(ActionEvent event) {
		setAllFalse();
		ConnectingP.setVisible(true);
		BackButtonP.setVisible(true);
		ProgressCInd.setProgress(-1.0);
		CancelCB.setVisible(true);
	}
	
	@FXML
	public void CancelCP(ActionEvent event) {
		setAllFalse();
		MainP.setVisible(true);
		ButtonBarP.setVisible(true);
	}
	
	@FXML
	public void ConnectionsMP(ActionEvent event) {
		setAllFalse();
		ConnectionsP.setVisible(true);
		BackButtonP.setVisible(true);
	}
	
	@FXML
	public void BackButtonAll(ActionEvent event) {
		if (ConnectingP.isVisible() == true) {
			setAllFalse();
			MainP.setVisible(true);
			ButtonBarP.setVisible(true);
		} else if (ConnectionsP.isVisible() == true) {
			setAllFalse();
			MainP.setVisible(true);
			BackButtonP.setVisible(true);
			ButtonBarP.setVisible(true);
		} else if (SettingsP.isVisible() == true) {
			setAllFalse();
			NotificationsP.setVisible(true);
			ButtonBarP.setVisible(true);
		}
		ProgressCInd.setProgress(-1.0);
	}
	
	@FXML
	public void ProgressMP(ActionEvent event) {
		setAllFalse();
		ProgressP.setVisible(true);
	}
	
	@FXML
	public void DonePP(ActionEvent event) {
		setAllFalse();
		DoneP.setVisible(true);
	}
	
	@FXML
	public void HomeAll(ActionEvent event) {
		setAllFalse();
		MainP.setVisible(true);
		ButtonBarP.setVisible(true);
	}
	
	@FXML
	public void ProgressAll(ActionEvent event) {
		setAllFalse();
		ProgressP.setVisible(true);
		ButtonBarP.setVisible(true);
	}
	
	@FXML
	public void NotificationsAll(ActionEvent event) {
		setAllFalse();
		NotificationsP.setVisible(true);
		ButtonBarP.setVisible(true);
	}
	
	@FXML
	public void SettingsNP(ActionEvent event) {
		setAllFalse();
		SettingsP.setVisible(true);
		BackButtonP.setVisible(true);
	}
	
	@FXML
	public void SubmitSP(ActionEvent event) {
		SubmitSuccessfulSL.setVisible(true);
	}
	
	@FXML
	public void SubmitNP(ActionEvent event) {
		SubmitSuccessfulNL.setVisible(true);
	}
	
	@FXML
	public void DoneCP(ActionEvent event) {
		ProgressCInd.setProgress(1.0);
		PairedCL.setVisible(true);
		ConnectingCL.setVisible(false);
		ConnectedCL.setVisible(true);
		CancelCB.setVisible(false);
	}
}
