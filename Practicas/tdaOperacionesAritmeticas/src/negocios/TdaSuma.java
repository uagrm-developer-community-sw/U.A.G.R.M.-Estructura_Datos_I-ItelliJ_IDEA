package negocios;

public class TdaSuma {
    int a;
    int b;

    public TdaSuma(){
        this.a=0;
        this.b=0;
    }

    public TdaSuma(int a, int b){
        this.a=a;
        this.a=b;
    }

    public void setA(int data){
        this.a=data;
    }

    public void  setB(int data){
        this.b=data;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int opercionSumar(){
        int resul = getA() + getB();
        return resul;
    }

    @Override
    public String toString() {
        String s="";
        s=s+getA()+" + "+getB();

        return s;
    }

    public static void main(String[] args) {
        TdaSuma suma = new TdaSuma();
        suma.setA(5);
        suma.setB(2);

        //System.out.println(suma.toString());
        suma.opercionSumar();
        System.out.println( suma.getA()+" + "+ suma.getB()+" = "+suma.opercionSumar());
    }
}
