
public class Bebida extends Item {
	
	private int volume;
	private boolean bebidaAlcoolica;

	public Bebida(String nomeItem, double preco) {
		super(nomeItem, preco);
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isBebidaAlcoolica() {
		return bebidaAlcoolica;
	}
	public void setBebidaAlcoolica(boolean bebidaAlcoolica) {
		this.bebidaAlcoolica = bebidaAlcoolica;
	}
	
}
