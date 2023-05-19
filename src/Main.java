public class Main {
    public static void  fun() throws ArithmeticException,ArrayIndexOutOfBoundsException {
        System.out.println("A");
        int[] ar ={1,2,3,4};
        int b=1;
        int a=5/b;                                            // Airthmetic Exception
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

     public static void ageInfo(int age) throws RuntimeException {
         if (age < 18) throw new RuntimeException("User is UnderAge");
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
        catch(RuntimeException r){
            System.out.println("User is Under Age");
        }
    }
}