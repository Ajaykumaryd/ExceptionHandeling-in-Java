public class Main {








    public static void main(String[] args)
    {
        System.out.println("A");
         int b=1;
         int ar[]={1,2,3,4};
          try{                                                      //Exception is parent of all exceptions so it will exceute
             int a=5/b;                                            // Airthmetic Exception
             System.out.println(ar[5]);                           //Out of bound exceptions
             System.out.println("B");  //will not execute
         }

          catch (ArithmeticException e){
              System.out.println("Airthmetic Exception");
          }
          catch(ArrayIndexOutOfBoundsException q){
              System.out.println("your index is greater then size of array");
              log.error("User id:jdklhaldla,User tried to access index:"+i);
          }
          catch (Exception ex){
              System.out.println("Parent Exception");
          }

         System.out.println("D");



    }

}