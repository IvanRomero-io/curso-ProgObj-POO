function car(license, driver){
    this.id
    this.license = license
    this.driver = driver
    this.passernger
}

//Esta es la forma antigua

car.prototype.printDataCar = function (){
    console.log(this.driver)
    console.log(this.driver.name)
    console.log(this.driver.document)
}   