
public class Pessoa {


  String nome;
  String sobrenome;
  int idade;
  char sexo;
  
  public Pessoa(String nome, String sobrenome, int idade, char sexo) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.sexo = sexo;
	}


public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	
	public String imprimir() {
		String ret;
		ret= "Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade + " Sexo: " + sexo;
		  
	//  return (ret);	
	  return (nome+","+sobrenome+","+idade+","+sexo);
	}
}
