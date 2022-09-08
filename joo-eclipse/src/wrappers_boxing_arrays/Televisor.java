package wrappers_boxing_arrays;

public class Televisor {
	
	Integer canal = 130;
	Integer volume = 20;
	
	void mudarCanal(Integer novoCanal) {
		// if (canal == novoCanal) { // errado
		if (canal.equals(novoCanal)) {
			System.out.println("Novo canal é também o canal atual");
		} else {
			canal = novoCanal;
			System.out.println("Canal alterado para " + canal);
		}
	}
	
	void mudarVolume(Integer novoVolume) {
		// if (volume == novoVolume) { // errado
		if (volume.equals(novoVolume)) {
			System.out.println("Novo volume é também o volume atual");
		} else {
			volume = novoVolume;
			System.out.println("Volume alterado para " + volume);
		}
	}
	
	// Testes
	public static void main(String[] args) {
		Televisor tv = new Televisor();
		
		// Não deveria mudar de canal
		tv.mudarVolume(20);
		tv.mudarCanal(130);
		
		// Deveria mudar o volume e o canal
		tv.mudarVolume(300);
		tv.mudarCanal(10);
		
	}
	
}
