package web.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import web.DAO.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceIml implements CarService {
    private CarDao carDao = new CarDao();

    @Override
    public List<Car> getCars(int count) {
        if (count > 0 && count < 5) {
            return carDao.getPart(count);
        } else {
            return carDao.getAll();
        }
    }
}
