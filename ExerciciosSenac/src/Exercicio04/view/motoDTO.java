package Exercicio04.view;

public class motoDTO extends veículoDTO {

	public motoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public motoDTO(int idVeiculo, String modelo, String fabricante, String placa, String cor) {
		super(idVeiculo, modelo, fabricante, placa, cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Moto: [ID da Moto=" + getIdVeiculo() + ", Modelo da Moto= " + getModelo() + ", Fabricante="
				+ getFabricante() + ", Placa=" + getPlaca() + ", Cor=" + getCor() + "]";
	}

}
