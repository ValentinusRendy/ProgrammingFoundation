public class day2_3 {
    public static void checkAge(int age){
        final int MIN_AGE =21;

        if(age >= MIN_AGE){
            System.out.println("Eligible by age");
        } else{
            System.out.println("Not eligible by age");
        }
    }

    public static void main(String[] args){
        checkAge(19);
        checkAge(25);
    }
    
}
