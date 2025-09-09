class ppl{
	final String nome; //uma vez definido não pode ser modificado
    static String cidade; //todos vão receber a mesma cidade
	int idade;
	
	Pessoa(){} //padrão

	Pessoa(String n, int i){ 
	this.nome=n; 
	this.idade=i; //caso não houvesse, seria null
	}
}