package Questao5;
public class Ponto
{
    //atributos
    private int x;
    private int y;
    
    //contrutor
    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    //metodos
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    public boolean verifica(){
        if(x==y){
            return true;
        }
        else {
            return false;
        }
    }
}
