package negocios;

public class Nodo {
    private Nodo link;
    private int data1;
    private int data2;

    //==============================CONSTRUCTOR======================//
    public Nodo(){
        link=null;
        data1=0;
        data2=0;
    }

    public Nodo (int data1, int data2) {
        this.data1=data1;
        this.data2=data1;
    }

    //==============================SETTERS==========================//
    public void setLink(Nodo link){
        this.link=link;
    }

    public void setData1(int data){
        this.data1=data;
    }

    public void setData2(int data){
        this.data2=data;
    }

    //==============================GETTERS==========================//

    public Nodo getLink() {
        return link;
    }

    public int getData1() {
        return data1;
    }

    public int getData2() {
        return data2;
    }

    //==============================INTERCAMBIAR==========================//
    public void intercambiar(){
        int aux =getData2();
        this.data2=getData1();
        this.data1=aux;

    }

    //==============================TOSTRING==========================//
    @Override
    public String toString() {
        String s="";
        s=s+getData1()+"|"+getData2();
        return s;
    }

    //==============================MAIN==============================//
    public static void main(String[] args) {
        Nodo a = new Nodo();
        a.setData1(2);
        a.setData2(5);

        System.out.println(a.toString());
        a.intercambiar();
        System.out.println(a.toString());
    }
}
