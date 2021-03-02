package negocio;

public class Bitwise implements Cloneable {
    //Varible Global  x
    private int x;

    //==================Constructor===================
    public Bitwise(){
        this.x=0;
    }

    //=====================Setters====================

    //Poblar/ Encender el vector con puro "0"
    public void Encender(int pos){
        int Mask=1;
        Mask=Mask<<pos-1;
        this.x=x | Mask;
    }

    //Modificar el vector poblado intercambiando 1 por cero segun la posicion
    public void Apagar(int pos){
        int Mask=1;
        Mask=Mask<<pos-1;
        Mask=~Mask;
        this.x=x & Mask;
    }


    public int getbit(int pos){
        int Mask=1;
        Mask=Mask<<pos-1;
        Mask=x & Mask;
        Mask=Mask>>>pos-1;
        return Mask;
    }
    //Dibujar el Vector de 32 Bits
    @Override
    public String toString() {
        String s="[";
        for (int i=32;i>=1;i--){
            s=s+getbit(i);
            if (i>1)
                s=s+", ";
        }
        s=s+"]";
        return s;
    }

    //Main
    public static void main(String[] args) {
        Bitwise a=new Bitwise();
        a.Encender(32);
        a.Encender(3);
        System.out.println(a);
        a.Apagar(3);
        System.out.println(a);
    }

    @Override
    protected Object clone() throws  CloneNotSupportedException{
        return super.clone();
    }

}
