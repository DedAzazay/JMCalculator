import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainCalculator {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String condition = reader.readLine();

        Qualifier input = new Qualifier(condition);

        if (!input.isRome()) {
            Calculate intPair = new Calculate(input.getInputCondiotion());
            System.out.println(intPair.getResult());
        } else  {
            TranslateRome rome = new TranslateRome();
            String[] normalNums = rome.FromRome(input.getInputCondiotion());
            Calculate romePair = new Calculate(normalNums);
            System.out.println(rome.toRoman(romePair.getRomeResult()));
        }
    }
}
