public class Calculate {
    private int buffer;
    private String result;


    public String getResult() {
        result = "" + buffer;
        return result;
    }

    public int getRomeResult() {
        return buffer;
    }

    public Calculate(String[] condition) {
        int a = Integer.parseInt(condition[0]);
        int b = Integer.parseInt(condition[2]);
        switch (condition[1]) {
            case("+") :
                buffer = a + b;
                break;
            case("-") :
                buffer = a - b;
                break;
            case("/") :
                buffer = a / b;
                break;
            case("*") :
                buffer = a * b;
                break;
        }

    }
}
