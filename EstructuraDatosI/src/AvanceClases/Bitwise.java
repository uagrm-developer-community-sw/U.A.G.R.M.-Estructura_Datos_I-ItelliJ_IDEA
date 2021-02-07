package AvanceClases;

public class Bitwise {
    int x; //VARIABLE GLOBAL

    //CONSTRUCTOR
    public Bitwise(){
        x=0;
    }

    public void set1(int pos) {
        if(pos>0) {
            int mask = 1;
            mask = mask << (pos - 1);
            x = x | mask;
        }
    }
}
