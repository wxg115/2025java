package week14;

public class RentEx {
	HouseAgency house = new HouseAgency();
	House myHome = house.rent();
	myHome.turnOnLight();
	
	CarAgency car = new CarAgency();
	Car myCar = car.rent();
	myCar.run();
	
	ToyAgency toy = new ToyAgency();
	Toy myToy = toy.rent();
	myToy.play();
}