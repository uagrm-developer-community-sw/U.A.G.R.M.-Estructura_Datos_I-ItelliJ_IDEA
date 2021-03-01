package PracticoI.Negocios;

public class TdaDupla {
    //Variables Glovales
    private int a,b;  //a=1; b=2; => 2  -  a=3; b=5; =>15

    //==========CONSTRUCTOR===========//
    public TdaDupla(int Tda, int Tdb){
        this.a=Tda;
        this.b=Tdb;
    }

    public int primero(){
        return a;  // a=2
    }

    public int segundo(){
        return b;  //b=15
    }
    //============SETTER=================//
    public void setDatos(int sDa, int sDb){
        this.a=sDa;  //
        this.b=sDb;  //
    }

    public TdaDupla multiplicar(int multiplicar){
        return new TdaDupla(a*multiplicar, b*multiplicar);
    }

    @Override
    public String toString(){
        return "(" + a + "," + b + ")";
    }



}
