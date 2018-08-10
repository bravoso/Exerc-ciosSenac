package Exercicio04.view;

public class veículoDTO {

	private int idVeiculo;
	private String modelo;
	private String fabricante;
	private String placa;
	private String cor;

	public veículoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public veículoDTO(int idVeiculo, String modelo, String fabricante, String placa, String cor) {
		super();
		this.idVeiculo = idVeiculo;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.placa = placa;
		this.cor = cor;
	}

}
