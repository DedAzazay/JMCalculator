public class ExceptionOfInt extends Exception {
    private int detail;

    public ExceptionOfInt(int a) {
        detail = a;
    }

    public String toString() {
        return "ExceptionOfInt[" + detail + " - не подходит по условию. Должно быть именно число от 1 до 10.]";
    }

}
