package com.java.class05;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int numofClients =0;
        numofClients++;
        System.out.println(numofClients);
        numofClients++;
        System.out.println(numofClients);
        numofClients++;
        System.out.println(numofClients);
        numofClients+=1;
        System.out.println(numofClients);

        double gasprice=3.99;
        gasprice++;
        System.out.println(gasprice);

        double gaspriceaftertax=gasprice++;
        System.out.println(gaspriceaftertax);

        int z=10;
        int r=z++;
        System.out.println(r);
        System.out.println(z);
        System.out.println(z++);
        System.out.println(z);

        int u=11;
        int q=u++;
        int t=q++;
        System.out.println(u);
        System.out.println(q);
        System.out.println(t);


        int ab=50;
        int ac=ab++;
        int ad=++ab;
        System.out.println(ad++);
        System.out.println(++ab);

        System.out.println(ab++);
        System.out.println(ab++);
        System.out.println(ab);

        int il=10;
        int temp=il++;
        System.out.println(temp);
        System.out.println(il++);
        System.out.println(il);

       int var1 = 20;
        System.out.println(var1++);
        System.out.println(++var1);
        int var2= var1++;
        int var3 =++var1;
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);





    }
}
