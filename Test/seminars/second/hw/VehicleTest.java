package seminars.second.hw;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class VehicleTest {
    Car car = new Car("Ferrari","Purosangue",2023);
    Motorcycle moto = new Motorcycle("Ducati","Panigale V4",2023);

    /**
     * Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор
     * instanceof).
     */
    @Test
    public void testCarIsVehicle(){
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    /**
     * Проверить, что объект Car создается с 4-мя колесами.
     */
    @Test
    public void testCarWheels(){
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    /**
     * Проверить, что объект Motorcycle создается с 2-мя колесами.
     */
    @Test
    public void testMotoWheels(){
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }

    /**
     * Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    public void testDriveCarSpeed(){
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    /**
     * Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    public void testDriveMotoSpeed(){
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }

    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина
     * останавливается (speed = 0).
     */
    @Test
   public void testParkCar(){
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
     * мотоцикл останавливается (speed = 0).
     */
    @Test
    public void testParkMoto(){
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }
}