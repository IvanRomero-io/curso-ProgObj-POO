package CursoPOOUber.Java;

public class Car {
    Integer id;        //atributo
    String license;    //atributo
    Account driver;     //atributo
    Integer passenger; //atributo

    public Car(String license, Account driver){
        this.license  = license;
        this.driver   = driver;
    }

    void printDataCar(){
        System.out.println("License: " + license + " Driver: " + driver); //aca creamos una funcion que va a ser llamada como metodo, nos ahorra tener que escribir esta misma funcion y se crear al hacer el objeto a partir de la clase
    }
}
