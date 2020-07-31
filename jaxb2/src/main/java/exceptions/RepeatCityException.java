package exceptions;

public class RepeatCityException extends Exception {
    private String name;

    public RepeatCityException(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return "Город с таким названием существует";
    }
}
