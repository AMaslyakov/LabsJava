package src.lr7.task1;

import java.util.Objects;
import static java.lang.String.*;

public class SubClass extends SuperClass {

    private String field2;

    SubClass(String arg) {
        super(arg);
        field2 = "Default";
    }

    SubClass(String arg1, String arg2) {
        super(arg1);
        field2 = arg2;
        }

    public String toString(){
        String result;
        if (Objects.equals(field2, "Default")){
            result = super.toString();
        } else {
            result = format("Поле 1: %s, Поле 2: %s\nИмя: %s",
                    super.getField(),
                    field2,
                    this.getClass().getSimpleName());
        }
        return result;
    }
}

