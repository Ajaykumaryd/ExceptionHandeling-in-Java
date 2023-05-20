public class AgeInfo extends RuntimeException{


    public AgeInfo(int age){
       super("Age is under 18 "+age);
    }


    public AgeInfo(String s){
        super(s);
    }
}
