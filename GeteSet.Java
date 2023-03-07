package poo;

//SET NA retorna nada
//get retorna 
public class POO { // alt + insert na class

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    private String cpf;
    private String nome;
    private char sexo;
    private int idade;
    
    public  void setCpf(String cpf) {
        this.cpf = cpf; //relacionar cpf com cpf,pois sao diferente
        
        
        public String imprimir(){
            return " CPF:" + cpf +
                    "\nNome:" + nome+
                    "\nIdade:" +idade+
                     "\nSexo:" + nome+
                    
        }
    }
    
}
