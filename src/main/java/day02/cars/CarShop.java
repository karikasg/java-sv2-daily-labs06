package day02.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {

    private String carShopName;
    private int maxValue;
    private List<Car> carList = new ArrayList<>();

    public CarShop(String carShopName, int maxValue) {
        this.carShopName = carShopName;
        this.maxValue = maxValue;
    }

    public int sumCarPrice() {
        int sum = 0;
        for (Car car : carList) {
            sum += car.getPrice();
        }
        return sum;
    }

    public int numberOfCarsCheaperThan(int price) {
        int sum = 0;
        for (Car car : carList) {
            if (car.getPrice() <= price) {
                sum++;
            }
        }
        return sum;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> cars = new ArrayList<>();
        for (Car car : carList) {
            if (brand.equals(car.getBrand())) {
                cars.add(car);
            }
        }
        return cars;
    }

    public List<Car> getCarsForSell() {
        return carList;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() > maxValue) {
            return false;
        }
        carList.add(car);
        return true;
    }

    public String getCarShopName() {
        return carShopName;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public List<Car> getCarList() {
        return carList;
    }
}
