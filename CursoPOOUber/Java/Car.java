package CursoPOOUber.Java;

public class Car {
    Integer id;        //atributo
    String license;    //atributo
    String driver;     //atributo
    Integer passenger; //atributo

    void printDataCar(){
        System.out.println("License: " + license + " Driver: " + driver); //aca creamos una funcion que va a ser llamada como metodo, nos ahorra tener que escribir esta misma funcion y se crear al hacer el objeto a partir de la clase
    }
}
