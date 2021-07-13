// droid class
public class Droid {
	String name;
	int batteryLevel;

// droid constructor
public Droid(String droidName) {
	this.name=droidName;
	this.batteryLevel=100;
}

// droid behavior
public void performTask(String task) {
	System.out.println(name + " is performing task : " + task);
	batteryLevel = batteryLevel - 10;
}

public void rechargingBattery(String task) {
	batteryLevel = batteryLevel + 30;
	System.out.println(name + " has entered the following mode : " + task);
}

public int energyReport() {
return batteryLevel;
}

public void energyTransfer(Droid object, Droid object2, int energy) {
	object.batteryLevel -= energy;
	object2.batteryLevel += energy;
}

// toString display
public String toString() {
	return "Hello! This is " + name + " and my battery level is at " + batteryLevel + ".";
}

// main
public static void main(String[] args) {

	// creating Codey
	Droid Codey = new Droid("Codey");
	Droid Hacky = new Droid("Hacky");
	System.out.println(Codey);
	Codey.performTask("dancing");
	System.out.println(Codey.energyReport());
	System.out.println(Hacky);
	Hacky.rechargingBattery("recharge");
	System.out.println(Hacky.energyReport());
	Hacky.energyTransfer(Hacky,Codey,80);
	System.out.println(Codey.energyReport());
	System.out.println(Hacky.energyReport());	


}
}