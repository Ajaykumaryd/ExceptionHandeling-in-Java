import java.io.IOException;

public class Main {
    public static void  fun() throws ArithmeticException,ArrayIndexOutOfBoundsException {
        System.out.println("A");
        int[] ar ={1,2,3,4};
        int b=1;
        int a=5/0;                                            // Airthmetic Exception
        System.out.println(ar[5]);                           //Out of bound exceptions
        System.out.println("B");  //will not execute
    }

    public static void m1(){
         try{
             fun();
         }

         catch (ArithmeticException e){
         }

         catch(ArrayIndexOutOfBoundsException a){
         }
    }


    // custom exception1
//     public static void ageInfo(int age) throws RuntimeException {
//         if (age < 18) throw new RuntimeException("User is UnderAge");
//     }

     //custom exception by method 2
     public static void ageInfo(int age) throws AgeInfo {
         if (age < 18) throw new AgeInfo(age);
     }

    public static class A {
        public static void M1(int age){
            try{
                  ageInfo(15); //thew exception
            } catch (AgeInfo e){
                System.out.println(e.getMessage()+ " Message recieved");
            }
        }


        //  Check Exceptions
        public static void  m2(int age) throws IOException{   //throws is required
            if (age < 18) throw new IOException();
        }
    }



    public static void main(String[] args)
    {

          try{                                                      //Exception is parent of all exceptions so it will exceute
               fun();
         }
          catch (ArithmeticException e){
              System.out.println("Airthmetic Exception");
          }

          catch(ArrayIndexOutOfBoundsException q){
              System.out.println("your index is greater then size of array");
//              log.error("User id:jdklhaldla,User tried to access index:"+i);
          }

          catch (Exception ex){            //we use Exception only at last
              System.out.println("Parent Exception"+ex.getMessage());
          }

         System.out.println("D");

          //custom exception
          int age=9;
          try{
            ageInfo(age);
        }
        catch(RuntimeException r){                   //we can use of AgeInfo Exception
            System.out.println(r.getMessage());

        }


        A a =new A();
        try {
            a.M1(15);
        }catch (AgeInfo ex){
               System.out.println("Custom Exception");
            System.out.println("Lets see if it get printed"); //it will not get printed
           }
        catch(ArithmeticException e){
            System.out.println("Airthmetic Exception");

        }
        catch (RuntimeException r){
            System.out.println("Runtime Exception");
        }
        finally {                                       //finally will work in all cases even exception is caught or not even if we put return statement in it
            System.out.println(" Exception");           //finally must written inside try block
                                                        //
        }

//        try  catch compulsory for this exception
        try{
        a.m2(4);
    }catch (IOException e){

        }
}
}