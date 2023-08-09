public class Medicamento
{
    int covixUltra = 100;    //ESTOQUE DE REMÉDIOS.
    int zicox = 100;
    int chikTop = 100;
    int denguenit= 100;
    
    public void setCovix(int qtd) {covixUltra  = covixUltra - qtd;}
    public void setZicox(int qtd) {zicox = zicox - qtd;}
    public void setChikTop(int qtd) {chikTop = chikTop - qtd;}
    public void setDenguenit(int qtd) {denguenit = denguenit - qtd;}
    
    public int getCovix() {return covixUltra;}
    public int getZicox() {return zicox;}
    public int getChikTop() {return chikTop;}
    public int getDenguenit() {return denguenit;}
            
}