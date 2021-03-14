public class ExceptionOfMath extends Exception {
    private String detail;

    public ExceptionOfMath(String input) {
        detail = input;
    }

    public String toString() {
        return "ExceptionOfMath[" + detail + " - это не подходит по условию. Должно быть +, -, * или /]";
    }
}
