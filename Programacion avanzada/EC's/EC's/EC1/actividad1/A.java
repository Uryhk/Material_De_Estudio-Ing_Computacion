package actividad1;

public class A 
{
 private static int k=0;   
 private int i;

 public A(int j) 
{
    this.i = j;
}

public void m1(int i)
{
    A aux=new A(0);
    aux.m2(i);
    k=k+i+1;
    //System.out.println(this.i);
    //System.out.println(k);
}
public void m2(int i)
{
    this.i+=1;
    i=i*2;
    k=k+i;

    //System.out.println(this.i);
    //System.out.println(k);

}

public static int getK() {
    return k;
}

public int getI() {
    return i;
}

}
