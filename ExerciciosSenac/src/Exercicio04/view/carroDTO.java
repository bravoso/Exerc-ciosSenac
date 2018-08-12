package Exercicio04.view;

public class carroDTO extends veículoDTO{

	public carroDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public carroDTO(int idVeiculo, String modelo, String fabricante, String placa, String cor) {
		super(idVeiculo, modelo, fabricante, placa, cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Moto: [ID do Carro=" + getIdVeiculo() + ", Modelo= " + getModelo() + ", Fabricante="
				+ getFabricante() + ", Placa=" + getPlaca() + ", Cor=" + getCor() + "]";
	}

}
