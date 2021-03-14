public class ExceptionRomeOut extends Exception {
    private int detail;

    public ExceptionRomeOut(int input) {
        detail = input;
    }

    public String toString() {
        return "ExceptionRomeOut[ " + detail + " - это число нельзя отобразить по римски]";
    }
}
