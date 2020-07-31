
public class PessoaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa p1,p2;
		
		p1 = new Pessoa ("Marcio","Maezi", 43, 'M');
		p2 = new Pessoa ("Roberto","Araujo", 35, 'M');
		System.out.println (p1.imprimir());
		System.out.println (p2.imprimir());
	}

}
