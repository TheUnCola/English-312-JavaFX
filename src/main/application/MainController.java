package main.application;

import java.util.Optional;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class MainController {

	// RootLayout
	@FXML
	private BorderPane RootLayoutBP;
	@FXML
	private Button FullCycleB;
	@FXML
	private StackPane MainStackP;

	// Back Button Pane
	@FXML
	private Pane BackButtonP;
	@FXML
	private Button BackButtonB;

	// Main Pane
	@FXML
	private Pane MainP;
	@FXML
	private Button ConnectMB;
	@FXML
	private Button CyclesMB;

	// Connect Pane
	@FXML
	private Pane ConnectP;
	@FXML
	private Button ConnectCB;
	@FXML
	private Button DevicesCB;
	@FXML
	private Button DisconnectCB;

	// Connect with Device Screen
	@FXML
	private Pane ConnectDP;
	@FXML
	private Label PairingCDL;
	@FXML
	private ProgressIndicator ProgressCDInd;
	@FXML
	private Button CancelCDB;
	@FXML
	private Button DoneCDB;
	@FXML
	private Label PairedCDL;
	@FXML
	private Label PairSuccessCDL;
	
	// Devices Pane
	@FXML
	private Pane DevicesP;
	@FXML
	private Label Number1DL;
	@FXML
	private Label Number2DL;
	@FXML
	private Label Number3DL;
	@FXML
	private Label Number4DL;
	@FXML
	private ImageView DeviceImg1DIV;
	@FXML
	private ImageView DeviceImg2DIV;
	@FXML
	private ImageView DeviceImg3DIV;
	@FXML
	private ImageView DeviceImg4DIV;
	@FXML
	private Label MomiPhone2DL;
	@FXML
	private Label DadGalaxy2DL;
	@FXML
	private Label JohniPhone2DL;
	@FXML
	private Label JaneSamsung2DL;
	
	// Disconnect Pane
	@FXML
	private Pane DisconnectP;
	@FXML
	private Button Disconnect1DB;
	@FXML
	private Button Disconnect2DB;
	@FXML
	private Button Disconnect3DB;
	@FXML
	private Button Disconnect4DB;
	@FXML
	private Label Number5DL;
	@FXML
	private Label Number6DL;
	@FXML
	private Label Number7DL;
	@FXML
	private Label Number8DL;
	@FXML
	private ImageView DisconnectImg1DIV;
	@FXML
	private ImageView DisconnectImg2DIV;
	@FXML
	private ImageView DisconnectImg3DIV;
	@FXML
	private ImageView DisconnectImg4DIV;
	@FXML
	private Label MomiPhoneDL;
	@FXML
	private Label DadGalaxyDL;
	@FXML
	private Label JohniPhoneDL;
	@FXML
	private Label JaneSamsungDL;
	@FXML
	private Label Disconnected1DL;
	@FXML
	private Label Disconnected2DL;
	@FXML
	private Label Disconnected3DL;
	@FXML
	private Label Disconnected4DL;

	// Cycles Pane
	@FXML
	private Pane CyclesP;
	@FXML
	private Button WashCB;
	@FXML
	private Button DryCB;
	@FXML
	private Button StartCB;
	
	// Wash Pane
	@FXML
	private Pane WashP;
	@FXML
	private CheckBox WashWCB;
	@FXML
	private Label HeatWL;
	@FXML
	private CheckBox LowWCB;
	@FXML
	private CheckBox MediumWCB;
	@FXML
	private CheckBox HighWCB;
	@FXML
	private Label LoadSizeWL;
	@FXML
	private CheckBox LightWCB;
	@FXML	
	private CheckBox NormalWCB;
	@FXML
	private CheckBox HeavyWCB;
	@FXML
	private Label CycleWL;
	@FXML
	private CheckBox DelicatesWCB;
	@FXML
	private CheckBox PermPressWCB;
	@FXML
	private Button WashWB;
	@FXML
	private Button SaveWB;
	@FXML
	private Label SaveSuccessWL;
	
	// Dry Pane
	@FXML
	private Pane DryP;
	@FXML
	private CheckBox DryDCB;
	@FXML
	private Label HeatDL;
	@FXML
	private CheckBox LowDCB;
	@FXML
	private CheckBox MediumDCB;
	@FXML
	private CheckBox HighDCB;
	@FXML
	private Label CycleDL;
	@FXML
	private CheckBox NormalDCB;
	@FXML
	private CheckBox DelicateDCB;
	@FXML
	private CheckBox PermPressDCB;
	@FXML
	private CheckBox AirFluffDCB;
	@FXML
	private CheckBox DeWrinkleDCB;
	@FXML
	private Button SaveDB;
	@FXML
	private Label SaveSuccessDL;
	
	// Progress Pane
	@FXML
	private Pane ProgressP;
	@FXML
	private ProgressIndicator ProgressPInd;
	@FXML
	private Label TimeLeftPL;

	public void setAllFalse() {
		MainP.setVisible(false);
		ConnectP.setVisible(false);
		CyclesP.setVisible(false);
		WashP.setVisible(false);
		DryP.setVisible(false);
		ProgressP.setVisible(false);
		DevicesP.setVisible(false);
		DisconnectP.setVisible(false);
		ConnectDP.setVisible(false);
	}

	@FXML
	private void initialize() {
		setAllFalse();
		MainP.setVisible(true);
		BackButtonP.setVisible(true);
	}

	@FXML
	public void MainMenuRP(ActionEvent event) {
		setAllFalse();
		MainP.setVisible(true);
	}

	@FXML
	public void ConnectMP(ActionEvent event) {
		setAllFalse();
		ConnectP.setVisible(true);
	}

	@FXML
	public void ConnectCP(ActionEvent event) {
		setAllFalse();
		ConnectDP.setVisible(true);
		ProgressCDInd.setProgress(-1.0);
		PairingCDL.setVisible(true);
		PairSuccessCDL.setVisible(false);
		PairedCDL.setVisible(false);
		CancelCDB.setVisible(true);
	}
	
	@FXML
	public void DoneCDP(ActionEvent event) {
		ProgressCDInd.setProgress(1.0);
		PairingCDL.setVisible(false);
		PairedCDL.setVisible(true);
		PairSuccessCDL.setVisible(true);
		CancelCDB.setVisible(false);
	}
	
	@FXML
	public void CancelCDP(ActionEvent event) {
		setAllFalse();
		ConnectP.setVisible(true);
	}
	
	@FXML
	public void DevicesCP(ActionEvent event) {
		setAllFalse();
		DevicesP.setVisible(true);
	}
	
	@FXML
	public void DisconnectCP(ActionEvent event) {
		setAllFalse();
		DisconnectP.setVisible(true);
		Disconnected1DL.setVisible(false);
		Disconnected2DL.setVisible(false);
		Disconnected3DL.setVisible(false);
		Disconnected4DL.setVisible(false);
	}
	
	@FXML
	public void Disconnected1DP(ActionEvent event) {
		Disconnected1DL.setVisible(true);
	}
	
	@FXML
	public void Disconnected2DP(ActionEvent event) {
		Disconnected2DL.setVisible(true);
	}
	
	@FXML
	public void Disconnected3DP(ActionEvent event) {
		Disconnected3DL.setVisible(true);
	}
	
	@FXML
	public void Disconnected4DP(ActionEvent event) {
		Disconnected4DL.setVisible(true);
	}
	
	@FXML
	public void CyclesMP(ActionEvent event) {
		setAllFalse();
		CyclesP.setVisible(true);
	}
	
	@FXML
	public void WashCP(ActionEvent event) {
		setAllFalse();
		WashP.setVisible(true);
		SaveSuccessWL.setVisible(false);
	}
	
	@FXML
	public void SaveWP(ActionEvent event) {
		SaveSuccessWL.setVisible(true);
	}
	
	@FXML
	public void DryCP(ActionEvent event) {
		setAllFalse();
		DryP.setVisible(true);
		SaveSuccessDL.setVisible(false);
	}
	
	@FXML
	public void SaveDP(ActionEvent event) {
		SaveSuccessDL.setVisible(true);
	}

	@FXML
	public void Start(ActionEvent event) {
		setAllFalse();
		ProgressP.setVisible(true);
		TimeLeftPL.setText("59:59");
		/*Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Full Cycle");
		alert.setHeaderText("Would you like to stop the load after the wash cycle?");

		ButtonType YesB = new ButtonType("Yes");
		ButtonType NoB = new ButtonType("No");

		alert.getButtonTypes().setAll(YesB, NoB);

		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == YesB) {
			setAllFalse();
			ProgressP.setVisible(true);
			TimeLeftPL.setText("29:29");
		} else if (result.get() == NoB) {
			setAllFalse();
			ProgressP.setVisible(true);
			TimeLeftPL.setText("59:59");
		}*/
	}
	
	@FXML
	public void BackButton(ActionEvent event) {
		if (ConnectP.isVisible() == true) {
			ConnectP.setVisible(false);
			MainP.setVisible(true);
		} else if (ConnectDP.isVisible() == true) {
			ConnectDP.setVisible(false);
			ConnectP.setVisible(true);
		} else if (DevicesP.isVisible() == true) {
			DevicesP.setVisible(false);
			ConnectP.setVisible(true);
		} else if (DisconnectP.isVisible() == true) {
			DisconnectP.setVisible(false);
			ConnectP.setVisible(true);
		} else if (CyclesP.isVisible() == true) {
			CyclesP.setVisible(false);
			MainP.setVisible(true);
		} else if (WashP.isVisible() == true) {
			WashP.setVisible(false);
			CyclesP.setVisible(true);
		} else if (DryP.isVisible() == true) {
			DryP.setVisible(false);
			CyclesP.setVisible(true);
		} else if (ProgressP.isVisible() == true) {
			ProgressP.setVisible(false);
			CyclesP.setVisible(true);
		} else if (ConnectDP.isVisible() == true) {
			ConnectDP.setVisible(false);
			ConnectP.setVisible(true);
		}
	}
}
