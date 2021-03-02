package negocio;


public class Persona {
    String[] nombre;
    VectorNbits P;
    int cant;
    //============Constructor==========//
    public Persona (int CantPersona){
        P=new VectorNbits(CantPersona,22);
        cant=CantPersona;
        Nombre=new String[CantPersona];
    }

}
