package mira.javabasics;

public class Typecasting {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        byte a=10;
        short b=a;//a is short type (widening)

        short c=40;
        char x=(char) c;//narrowing

        byte b1=1;
        float b2=b1;

        byte a1=1;
        byte a2=1;
        byte result = (byte) (a1+a2); //internally it will take 2 as int
        System.out.println(result);
    }

}

