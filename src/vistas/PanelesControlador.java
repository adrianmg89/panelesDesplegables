package vistas;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class PanelesControlador implements Initializable{
	@FXML
	private AnchorPane panel1;
	@FXML
	private AnchorPane panel2;
	@FXML
	private AnchorPane panel3;
	@FXML
	private AnchorPane panel4;
	@FXML
	private AnchorPane panel5;
	@FXML
	private AnchorPane panel6;
	@FXML
	private Label contadorPagina;

	/**
	 * Creamos el metodo para trasladar las imagenes fuera de la vista.
	 * @param duracion
	 * @param node
	 * @param ejeX
	 */
	public void trasladaImagenes(double duracion,Node node,double ejeX){
		TranslateTransition traslado = new TranslateTransition(Duration.seconds(duracion),node);
		traslado.setByX(ejeX);
		traslado.play();
	}

	/**
	 * Metodo que al iniciar va trasladando las imagenes de los paneles fuera de la vista
	 */
	@Override
	public void initialize(URL localizacion, ResourceBundle recurso) {
		trasladaImagenes(0.5,panel2,-600);
		trasladaImagenes(0.5,panel3,-600);
		trasladaImagenes(0.5,panel4,-600);
		trasladaImagenes(0.5,panel5,-600);
		trasladaImagenes(0.5,panel6,-600);
	}

	int panelRecuperado = 0;

	/**
	 * Creamos el metodo que irá mandando mostrar los paneles siguientes
	 * @param evento
	 */
	@FXML
	public void siguiente(ActionEvent evento){

		if (panelRecuperado == 0) {
			trasladaImagenes(0.5,panel1,1200);
			trasladaImagenes(0.5,panel2,600);
			panelRecuperado++;
			contadorPagina.setText("2/6");
		}else if (panelRecuperado == 1) {
			trasladaImagenes(0.5,panel2,1200);
			trasladaImagenes(0.5,panel3,600);
			panelRecuperado++;
			contadorPagina.setText("3/6");
		}else if (panelRecuperado == 2) {
			trasladaImagenes(0.5,panel3,1200);
			trasladaImagenes(0.5,panel4,600);
			panelRecuperado++;
			contadorPagina.setText("4/6");
		}else if (panelRecuperado == 3) {
			trasladaImagenes(0.5,panel4,1200);
			trasladaImagenes(0.5,panel5,600);
			panelRecuperado++;
			contadorPagina.setText("5/6");
		}else if (panelRecuperado == 4) {
			trasladaImagenes(0.5,panel5,1200);
			trasladaImagenes(0.5,panel6,600);
			panelRecuperado++;
			contadorPagina.setText("6/6");
		}else{
			System.out.println("Sin panel");
		}
	}
	/**
	 * Creamos otro metodo que nos mostrara el panel anterior
	 * @param evento
	 */
	@FXML
	public void anterior(ActionEvent evento){
		if (panelRecuperado == 1) {
			trasladaImagenes(0.5,panel1,-1200);
			trasladaImagenes(0.5,panel2,-600);
			panelRecuperado--;
			contadorPagina.setText("1/6");
		}else if (panelRecuperado == 2) {
			trasladaImagenes(0.5,panel2,-1200);
			trasladaImagenes(0.5,panel3,-600);
			panelRecuperado--;
			contadorPagina.setText("2/6");
		}else if (panelRecuperado == 3) {
			trasladaImagenes(0.5,panel3,-1200);
			trasladaImagenes(0.5,panel4,-600);
			panelRecuperado--;
			contadorPagina.setText("3/6");
		}else if (panelRecuperado == 4) {
			trasladaImagenes(0.5,panel4,-1200);
			trasladaImagenes(0.5,panel5,-600);
			panelRecuperado--;
			contadorPagina.setText("4/6");
		}else if (panelRecuperado == 5) {
			trasladaImagenes(0.5,panel5,-1200);
			trasladaImagenes(0.5,panel6,-600);
			panelRecuperado--;
			contadorPagina.setText("5/6");
		}else{
			System.out.println("Sin panel");
		}

	}

}
