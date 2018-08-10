package Exercicio04.view;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Exercicio04.view.carroDTO;

public class MenuCarro extends JPanel {
	public MenuCarro() {
	}

	/**
	 * Create the panel.
	 */
	public static void cadastrarCarro() {
		carroDTO dto =new carroDTO();
		dto.setModelo(JOptionPane.showInputDialog(null, "Digite o modelo do carro:"));
		dto.setCor(JOptionPane.showInputDialog(null,"Digite a cor do carro:"));
		dto.setFabricante(JOptionPane.showInputDialog(null,"Digite a fabricante do Carro:"));
		dto.setPlaca(JOptionPane.showInputDialog(null,"Digite a placa do carro:"));
	}
	public static void consultarCarro() {
		carroDTO dto = new carroDTO();
		dto.toString();
	};

}
