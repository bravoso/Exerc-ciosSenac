package Exercicio04.view;

import java.awt.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Exercicio04.view.carroDTO;

public class MenuMoto extends JPanel {
	public MenuMoto() {
	}
	static ArrayList<motoDTO> Motos = new ArrayList<motoDTO>();
	/**
	 * Create the panel.
	 */
	public static void cadastrarMoto() {
		motoDTO moto =new motoDTO();
		moto.setModelo(JOptionPane.showInputDialog(null, "Digite o modelo da moto:"));
		moto.setCor(JOptionPane.showInputDialog(null,"Digite a cor da moto:"));
		moto.setFabricante(JOptionPane.showInputDialog(null,"Digite a fabricante da moto:"));
		moto.setPlaca(JOptionPane.showInputDialog(null,"Digite a placa da moto:"));
		
		Motos.add(moto);
	}
	public static void consultarMoto() {
		 for(int i=0; i < Motos.size(); i++) {
			 System.out.println(Motos.get(i));			 
			 
		 };
	};
}
