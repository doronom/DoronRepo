import java.util.Random;
import java.util.UUID;

public class score
{
    public static void main ()
    {
        int score = new Random(UUID.fromString("8cc992f6-6b31-4cff-baba-50cf488a9bae").hashCode()).nextInt(100);
    }
}
