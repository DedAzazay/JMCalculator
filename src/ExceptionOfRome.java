public class ExceptionOfRome extends Exception {
    private String detail;

    public ExceptionOfRome(String input) {
        detail = input;
    }

    public String toString() {
        return "ExceptionOfRome[" + detail + " - не подходит по условию. Должно быть римское число от I до X]";
    }
}
