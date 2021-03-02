//TDA Dupla//
/*Codificar el TDA para representar una "dupla". Una dupla es un conjunto ordenado de tamaño fijo de 2 elementos.
Para acotar la implementación podrían realizar una Dupla de dos enteros (int), a fin de simplificarlo.
Con lo cual no sería una Dupla genérica que podrá tener cualquier tipo de elemento.
*/
package negocios;

public class TdaDupla {
    //VARIABLES GLOBALES
    private int a,b;

    //CONSTRUCTO
    /*Las operaciones definidas sobre la dupla deberán ser:
      crear(int primero, int segundo) -> Dupla  -> */
    public TdaDupla(int Tda, int Tdb){
        this.a=Tda;
        this.b=Tdb;
    }

    //primero(Dupla) -> int
    public int primero(){
        return a;
    }

    //segundo(Dupla) -> int
    public int segundo(){
        return b;
    }

    //SETTERS
    public void setDatos(int sDa, int sDb){
        this.a=sDa;
        this.b=sDb;
    }

    //multiplicar(Dupla d, int multiplo) -> Dupla :
    public TdaDupla multiplicar(int mult){
        return new TdaDupla(a*mult,b*mult);
    }

    @Override
    public String toString() {
        return "TdaDupla{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
