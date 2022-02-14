package Questao5;
public class Rota
{
    //atributos
    private Ponto p1;
    private Ponto p2;
    private double variavel;
    
    //construtor
    public Rota(Ponto p1, Ponto p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    
    //metodos
    public double calculadist(){
        variavel = (((p1.getx() - p2.getx())^2) + ((p1.gety() - p2.gety())^2));
        return (Math.sqrt(variavel));
    }
}
