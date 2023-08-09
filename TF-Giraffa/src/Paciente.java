
public class Paciente
{
    String nome;
    String cpf;
    String tel;
    int diag;
    int medic;
    int qtd;
    
    public Paciente(String nome, String cpf, String tel, int diag, int medic, int qtd) {
        this.nome = nome;
        this.cpf = cpf;
        this.tel = tel;
        this.diag = diag;
        this.medic = medic;
        this.qtd = qtd;
    }
    
    public String getNome()  {return nome;}
    public String getCpf() {return cpf;}
    public String getTel() {return tel;}
    public int getDiag() {return diag;}
    public int getMedic() {return medic;}
    public int getQtd() {return qtd;}
    
    public void setNome(String nome) {this.nome = nome;}
    public void setCpf(String cpf) {this.cpf = cpf;}
    public void setTel(String tel) {this.tel = tel;}
    public void setDiag(int diag) {this.diag = diag;}
    public void setMedic(int medic) {this.medic = medic;}
    public void setQtd(int qtd) {this.qtd = qtd;} 
    
    public String toString() {
        return "\n----------------" + "\nNome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + tel + "\nDiagnóstico: " + diag + "\nMedicamento: " + medic + "\nQuantidade: " + qtd + "\n----------------";
    }
}
