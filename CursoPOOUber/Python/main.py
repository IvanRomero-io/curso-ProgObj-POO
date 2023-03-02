from car import Car
from account import Account


if __name__ == "__main__":
    print("Hola mundo")

    car = Car("AMS234", Account("Ivan Romero", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))

    # car = Car()
    # car.license = "AMS234"
    # car.driver  = "Andres Herrera" 
    # print(vars(car))

    # car2 = Car()
    # car2.license = "AFP865"
    # car2.driver  = "Claudio Bravo"
    # print(vars(car2))