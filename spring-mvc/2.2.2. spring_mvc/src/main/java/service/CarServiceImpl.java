package service;

import dao.CarDao;
import dao.CarDaoImpl;
import model.Car;

import java.util.List;

public class CarServiceImpl implements CarService{
    CarDao carDao = new CarDaoImpl();


    @Override
    public List<Car> getCars() {
        return carDao.getCars();
    }

    @Override
    public List<Car> showCar(int count) {
        return carDao.showCar(count);
    }
}
