package Practico2.Negocio;

public class Persona {
    //Variables Globales
    String[] Nombre;
    VectorNbits P;
    int cant;

//CONSTRUCTOR
    public Persona (int CantPersona){
        P = new VectorNbits(CantPersona,22);
        cant = CantPersona;
        Nombre = new String[CantPersona];
    }

    //=============================SETTERS==================================//
    public void Insertar(int nro,String Name,int ServBasi,int Lote,int Mz,int Uv){
        if (nro<=cant && nro>0){
            int Mask=Uv;
            int S=Mz;
            S=S<<7;
            Mask=Mask|S;
            int E=Lote;
            E=E<<12;
            Mask=Mask | E;
            int SB=ServBasi;
            SB=SB<<18;
            Mask=Mask | SB;
            P.Insertar(Mask,nro);
            Nombre[nro-1]=Name;
        }
    }

    public int serviBa(int pavi,int alc,int agua,int luz){ //cada uno tiene 0 o 1
        int Mask=luz;
        int S=agua;
        S=S<<1;
        Mask=Mask|S;
        int S1=alc;
        S1=S1<<2;
        Mask=Mask|S1;
        int S2=pavi;
        S2=S2<<3;
        Mask=Mask|S2;
        return Mask;
    }

    public void EliminarPersona(String Name,int pos){
        P.Insertar(0,pos);
        Nombre[pos-1]="";
    }
    //------------------------------Getters-----------------------------------------
    public int getUv(int n){
        int Mask=P.Sacar(n);
        Mask=Mask<<25;
        Mask=Mask>>>25;
        return Mask;
    }

    public int getMz(int n){
        int Mask=P.Sacar(n);
        Mask=Mask<<20;
        Mask=Mask>>>27;
        return Mask;
    }

    public int getLote(int n){
        int Mask=P.Sacar(n);
        Mask=Mask<<14;
        Mask=Mask>>>26;
        return Mask;
    }

    public int getluz(int n){
        int Mask=P.Sacar(n);
        Mask=Mask<<13;
        Mask=Mask>>>31;
        return Mask;
    }

    public int getagua(int n){
        int Mask=P.Sacar(n);
        Mask=Mask<<12;
        Mask=Mask>>>31;
        return Mask;
    }

    public int getalc(int n){
        int Mask=P.Sacar(n);
        Mask=Mask<<11;
        Mask=Mask>>>31;
        return Mask;
    }

    public int getpavi(int n){
        int Mask=P.Sacar(n);
        Mask=Mask<<10;
        Mask=Mask>>>31;
        return Mask;
    }

    public String getNombre(int n){
        return Nombre[n-1];
    }

    public int getDim(){
        return cant;
    }

    public int getModelo(int po){
        return P.Sacar(po);
    }

}
