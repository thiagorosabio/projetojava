
public class TestaVacina {
	public static void main(String[] args) {

		CoronaVac c = new CoronaVac();
		Astrazenica a = new Astrazenica();
		Janssen j = new Janssen();
		Pfizer P = new Pfizer();
		int idade = 12;
		if (c.regraIdade(idade)) {
			System.out.println("pode tomar coronavac");
		}
		if (a.regraIdade(idade)) {
			System.out.println("pode tomar astrazenica");
		}
		if (j.regraIdade(idade)) {
			System.out.println("pode tomar jabssen");
			
			if (P.regraIdade(idade)) {
				System.out.println("pode tomar pfizer");
				}
			}
		

	}
}
