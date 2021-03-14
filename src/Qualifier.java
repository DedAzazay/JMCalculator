public class Qualifier {
    private String[] math = {"+", "-", "*", "/"};
    private boolean isRome = false;
    private int buffer;
    private String[] inputCondiotion = new String[3];

    public Qualifier(String input) throws ExceptionOfInt, ExceptionOfRome, ExceptionOfMath {
        String[] condition = new String[3];
        try {
            condition = input.split(" ");
            buffer = Integer.parseInt(condition[0]);
            if (buffer < 1 || buffer > 10) {
                throw new ExceptionOfInt(buffer);
            }
            buffer = Integer.parseInt(condition[2]);
            if (buffer < 1 || buffer > 10) {
                throw new ExceptionOfInt(buffer);
            }
        } catch (NumberFormatException e) {
            TranslateRome rome = new TranslateRome();
            if (rome.isRome(condition[0]) && rome.isRome(condition[2])) {
                isRome = true;
            } else if (!isRome) {
                throw e;
            }
        } finally {
            boolean mathLogic = false;
            for (String temp : math) {
                if (condition[1].equals(temp)) {
                    mathLogic = true;
                    break;
                }
            }
            if (!mathLogic) {
                throw new ExceptionOfMath(condition[1]);
            }
        }
        inputCondiotion = condition;
    }

    public String[] getInputCondiotion() {
        return inputCondiotion;
    }

    public boolean isRome() {
        return isRome;
    }
}
