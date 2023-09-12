package org.example;

public class Methodexample {
    public static void main(String[]args){
        Methodexample mref = new Methodexample();
        int result = mref.calc(4,6, "+");
        System.out.println("Sum is "+result);



    }
/*    public static void main(String[] args) {

        Javaclass nref = new Javaclass();
        nref.sumofnums( 4, 6);
        nref.sumofnums(477, 623);


    }*/
    private void sumofnums(int a, int b){
        int sum = a+b;
        System.out.println("Sum of a and b is:  " +sum);


    }
    private int calc(int a, int b, String ops){
        int res = 0;
        if(ops.equals("+")){
            res =  a + b;
        } else if(ops.equals("-")){
            res =  a - b;
        }else if(ops.equals("*")){
            res =  a * b;
        }

        return res;

    }

/*    private int sumofnums(int a, int b){
        int sum = a + b;
        return sum;

    }*/
}

