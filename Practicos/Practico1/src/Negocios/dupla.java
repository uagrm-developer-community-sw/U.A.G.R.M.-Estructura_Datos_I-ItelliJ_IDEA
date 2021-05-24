/*------------------------------------------------+
 * Title: Estructura de una clase "Automovil"     +
 * Autor: Jhasmany Fernandez Ortega               +
 * Date: 11/05/2021                               +
 * Version: v1.0                                  +
 * -----------------------------------------------+
 * */
package Negocios;
//=======================================================//
/* Nombre: Dupla
 * Elementos: (entero A, entero B)
 * Organizacion: lineal
 * Dominio: ilimitado
 * */
public class dupla {
    private int a, b;

//====================CONSTRUCTOR==========================//
    //Crear una instancias del objeto Dupla
    //Crear
    //Pre:
    //Pos:
    public dupla (){

    }

    //Crear una instancias del objeto Dupla
    //Crear(entero a, entero b)
    //Pre:
    //Pos:
    public dupla (int a, int b)
    {
        this.a=a;
        this.b=b;
    }
//========================SETTERS===========================//
    //Void setA(entero a)
    //pre:
    //Pos: El valor a queda modificada en el elemento a
    public void setA(int data){
        this.a=data;
    }

    //Void setA(entero b)
    //pre:
    //Pos: El valor a queda modificada en el elemento b
    public  void  setB(int data){
        this.b=data;
    }

//========================GETTERS===========================//

    //Enteger getPrimero ()
    //pre:
    //pos:

    //Devuelve el elemento A de Dupla primero
    public int getPrimero(){
        return a;
    }

    //Enteger getSegundo ()
    //pre:
    //pos:

    //Devuelve el elemento B de Dupla segunda
    public int getSgundo(){
        return b;
    }

//====================OPERACIONES_ADICIONALES================//
    //Dupla multiplicar (int mult)
    //pre:
    //pos:

    public int opercionSuma(){
        int resul = getPrimero() + getSgundo();
        return resul;
    }

//====================TO_STRING================//

    @Override
    public String toString() {
        String s="";
        s=s+getPrimero() + " + " + getSgundo();
        return s;
    }

//====================MAIN=====================//
//PROCEDIMIENTO MAIN CONSOLE
    public static void main(String[] args){
        dupla suma = new dupla();
        suma.setA(5);
        suma.setB(5);
        suma.opercionSuma();
        System.out.println(suma.getPrimero()+ " + " +suma.getSgundo()+ " = " +suma.opercionSuma());
    }
}
