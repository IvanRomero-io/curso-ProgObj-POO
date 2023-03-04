<?php

// require_once('car.php')
// require_once('account.php')

// $car = new Car("AW456", new Account("Andres Herrera", "AMS123"))

// $car->PrintDataCar()

require_once("car.php");
require_once("uberX.php");
require_once("account.php");

$uberx = new UberX("CVB123", new Account("Andres Herrera", "AND456"), "Chevrolet", "Spark");
$uberX->printDataCar();

?>