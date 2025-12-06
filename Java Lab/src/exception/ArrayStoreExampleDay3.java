package exception;

import java.util.Scanner;
class ArrayStoreExample{

    public static void storeObjects(Object arr[]){
        try{
        Object a[]=new String[5];

        for(int i=0;i<arr.length;i++){
            a[i]=arr[i];
        }
        System.out.println("Objects stored successfully.");
        }
        catch(ArrayStoreException e){
            System.out.println("ArrayStoreException caught: Incompatible type: java.lang.Integer cannot be stored in an array of java.lang.String");
        }
    }


    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
      
        try(scn){
            int choice=scn.nextInt();
            switch(choice){
            case 1->{
            Object[] obj1 = {"Hello", "World", "Java"};
            storeObjects(obj1);
            }

            case 2->{
                Object[] obj2 = {"Hello", "World", 123};
                storeObjects(obj2);
            }
        }
        }
       
    }
}