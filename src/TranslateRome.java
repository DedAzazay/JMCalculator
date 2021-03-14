import java.util.TreeMap;

public class TranslateRome {


    private final String[] romeNums = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public TranslateRome() {
    }

    public boolean isRome(String num) throws ExceptionOfRome {
        boolean result = false;
        for (String temp : romeNums) {
            if (num.equals(temp)) {
                result = true;
                break;
            }
        }
        if (!result) {
            throw new ExceptionOfRome(num);
        }
        return result;
    }

    public String toRoman(int number) throws ExceptionRomeOut {
        if (number < 1) {
            throw new ExceptionRomeOut(number);
        }
        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }

    //Т.к. в условии к задачи числа не больше 10, то мне хватит пока и такого переводчика
    public String[] FromRome(String[] condition) {
        String[] result = new String[3];
        for (int i = 0; i < 10; i++) {
            if (condition[0].equals(romeNums[i])) {
                condition[0] = "" + (i + 1);
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (condition[2].equals(romeNums[i])) {
                condition[2] = "" + (i + 1);
                break;
            }
        }
        result = condition;
        return result;
    }


}
