package vista;

import controlador.MainApp;

/**
*
* @author Manuel San Antonio Morales
* @version 1.0
* @see MyController
*/

public class MyController {

	private MainApp mainApp;

	/**
	 * Default builder
	 *
	 *@param mainApp MainApp object
	 */
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	/**
	 * Calls the second stage
	 */
	public void cambiar_otherstage() {
		this.mainApp.mostrar_OtherStage();
	}

	/**
	 * Calls the first stage
	 */
	public void cambiar_OneStage() {
		this.mainApp.mostrar_OneStage();
	}

	public MainApp getMainApp() {
		return mainApp;
	}

}
