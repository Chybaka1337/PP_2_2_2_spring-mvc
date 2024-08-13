package web.DAO;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDao {
    List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("model1", 200, 180));
        cars.add(new Car("model2", 220, 200));
        cars.add(new Car("model3", 240, 220));
        cars.add(new Car("model4", 260, 260));
        cars.add(new Car("model5", 280, 300));
        cars.add(new Car("model6", 300, 400));
        cars.add(new Car("model7", 320, 510));
    }

    public List<Car> getAll() {
        return cars;
    }

    public List<Car> getPart(int count) {
        return cars.stream().limit(count).toList();
    }
}
