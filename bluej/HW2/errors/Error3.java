public class Error3
{
    public static void main(String[] args)
    {
        try{
            System.out.println(1 / 0);
        } catch(ArithmeticException e){
            System.out.println("Arithmetic Error");
        }
    }
}
