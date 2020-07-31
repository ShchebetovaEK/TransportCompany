package exceptions;

public class RepeatTransportException  extends  Exception{
    private String name;

    public RepeatTransportException(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return "Транспорт с таким названием существует";
    }
}
