package baseball;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Integer> numbers;

    public User() {
        numbers = new ArrayList<>();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
