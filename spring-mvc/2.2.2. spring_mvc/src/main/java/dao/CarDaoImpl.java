package dao;

import model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl implements CarDao {
    public List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW","1","white"));
        cars.add(new Car("BMW","2","black"));
        cars.add(new Car("BMW","3","orange"));
        cars.add(new Car("BMW","4","yellow"));
        cars.add(new Car("BMW","5","chrome"));
    }

    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> showCar(int count) {

        return  cars.stream()
                .filter(p -> (count > 0 && count <= cars.size()))
                .limit(count)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
