public class Pneu {
    private int idPneu;
    private String modelo;
    private double indiceDeVida;
    private char estado;
    private int horasDeUso;

    public Pneu (int idPneu, String modelo, double indiceDeVida, char estado){
        this.idPneu = idPneu;
        this.modelo = modelo;
        this.indiceDeVida = indiceDeVida;
        this.estado = estado;
    }
    public int getIdPneu(){
        return idPneu;
    }
    public String getModelo(){
        return modelo;
    }
    public double getIndiceDeVida(){
        return indiceDeVida;
    }
    public char getEstado(){
        return estado;
    }
    public int getHorasDeUso(){
        return horasDeUso;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public boolean desgastar(int horaInicial, int horaFinal){
        if(this.estado =='N' || this.estado =='U'){
            this.estado = 'U';
            this.horasDeUso = this.horasDeUso + (horaFinal - horaInicial);
            this.indiceDeVida = this.indiceDeVida - (this.horasDeUso*60*0.12345);
            if(this.indiceDeVida<=0){
                this.estado = 'F';
                return false;
            }
            else{
                    return true;
            }
        }
        else{
            return false;
        }
    }
}
