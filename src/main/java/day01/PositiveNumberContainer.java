package day01;

import java.util.ArrayList;
import java.util.List;

public class PositiveNumberContainer {
    private List<Integer> positiveNumbers = new ArrayList<>();

    public boolean addPositiveNumber(int number) {
        if (number > 0) {
            positiveNumbers.add(number);
            return true;
        }
        return false;
    }

    public void printPositiveNumbers() {
        for (int number : positiveNumbers) {
            System.out.println(number);
        }
    }
}
