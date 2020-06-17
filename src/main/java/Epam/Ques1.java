package Epam;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;


public class Ques1 {
    public static void main(String args[])
    {
        IntStream s=IntStream.of(10,10,30,40,50,60,70,80,90);
        OptionalDouble o=s.average();
        if(o.isPresent())
        {
            System.out.println(o.getAsDouble());
        }
        else
        {
            System.out.println(-1);
        }
    }
}
