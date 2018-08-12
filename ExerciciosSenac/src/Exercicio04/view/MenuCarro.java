package Exercicio04.view;

import java.awt.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Exercicio04.view.carroDTO;

public class MenuCarro extends JPanel {
	public MenuCarro() {
	}
	static ArrayList<carroDTO> Carros = new ArrayList<carroDTO>();
	/**
	 * Create the panel.
	 */
	public static void cadastrarCarro() {
		carroDTO carro =new carroDTO();
		carro.setModelo(JOptionPane.showInputDialog(null, "Digite o modelo do carro:"));
		carro.setCor(JOptionPane.showInputDialog(null,"Digite a cor do carro:"));
		carro.setFabricante(JOptionPane.showInputDialog(null,"Digite a fabricante do Carro:"));
		carro.setPlaca(JOptionPane.showInputDialog(null,"Digite a placa do carro:"));
		
		Carros.add(carro);
	}
	public static void consultarCarro() {
		 for(int i=0; i < Carros.size(); i++) {
			 System.out.println(Carros.get(i));			 
			 
		 };
	};
}
