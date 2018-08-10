package Exercicio04.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class tela1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela1 frame = new tela1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public tela1() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblCadastros = new JLabel("Cadastros");
		lblCadastros.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblCadastros = new GridBagConstraints();
		gbc_lblCadastros.insets = new Insets(0, 0, 5, 0);
		gbc_lblCadastros.gridx = 2;
		gbc_lblCadastros.gridy = 1;
		contentPane.add(lblCadastros, gbc_lblCadastros);
		
		JButton btnCadastrarCarro = new JButton("Cadastrar Carro");
		btnCadastrarCarro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuCarro cadastrocarro = new MenuCarro();
				MenuCarro.cadastrarCarro();
			}
		});
		GridBagConstraints gbc_btnCadastrarCarro = new GridBagConstraints();
		gbc_btnCadastrarCarro.insets = new Insets(0, 0, 5, 0);
		gbc_btnCadastrarCarro.gridx = 2;
		gbc_btnCadastrarCarro.gridy = 2;
		contentPane.add(btnCadastrarCarro, gbc_btnCadastrarCarro);
		
		JButton btnCadastrarCaminho = new JButton("Cadastrar Caminh\u00E3o");
		btnCadastrarCaminho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnCadastrarCaminho = new GridBagConstraints();
		gbc_btnCadastrarCaminho.insets = new Insets(0, 0, 5, 0);
		gbc_btnCadastrarCaminho.gridx = 2;
		gbc_btnCadastrarCaminho.gridy = 3;
		contentPane.add(btnCadastrarCaminho, gbc_btnCadastrarCaminho);
		
		JButton btnCadastrarMoto = new JButton("Cadastrar Moto");
		GridBagConstraints gbc_btnCadastrarMoto = new GridBagConstraints();
		gbc_btnCadastrarMoto.insets = new Insets(0, 0, 5, 0);
		gbc_btnCadastrarMoto.gridx = 2;
		gbc_btnCadastrarMoto.gridy = 4;
		contentPane.add(btnCadastrarMoto, gbc_btnCadastrarMoto);
		
		JLabel lblConsultas = new JLabel("Consultas");
		lblConsultas.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblConsultas = new GridBagConstraints();
		gbc_lblConsultas.insets = new Insets(0, 0, 5, 0);
		gbc_lblConsultas.gridx = 2;
		gbc_lblConsultas.gridy = 6;
		contentPane.add(lblConsultas, gbc_lblConsultas);
		
		JButton btnConsultarCarro = new JButton("Consultar caminh\u00F5es e carros");
		btnConsultarCarro.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				MenuCarro.consultarCarro();
			}
		});
		GridBagConstraints gbc_btnConsultarCarro = new GridBagConstraints();
		gbc_btnConsultarCarro.insets = new Insets(0, 0, 5, 0);
		gbc_btnConsultarCarro.gridx = 2;
		gbc_btnConsultarCarro.gridy = 7;
		contentPane.add(btnConsultarCarro, gbc_btnConsultarCarro);
		
		JButton btnConsultarMotos = new JButton("Consultar Motos");
		btnConsultarMotos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnConsultarMotos = new GridBagConstraints();
		gbc_btnConsultarMotos.gridx = 2;
		gbc_btnConsultarMotos.gridy = 8;
		contentPane.add(btnConsultarMotos, gbc_btnConsultarMotos);
	}

}
