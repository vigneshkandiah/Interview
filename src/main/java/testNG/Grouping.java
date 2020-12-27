package testNG;

import org.testng.annotations.Test;

public class Grouping {
    @Test(groups = "Iphone")
	public void appleIphoneX() {

		System.out.println("Apple Testing : appleIphoneX");

	}
    @Test(groups="Iphone")
	public void appleIphoneXR() {
		System.out.println("Apple Testing : appleIphoneXR");
	}
    @Test(groups="Moto")
	public void MotoE() {

		System.out.println("Apple Testing : MotoE");

	}
    @Test(groups="Moto")
	public void MotoG() {
		System.out.println("Apple Testing : MotoG");
	}
    @Test(groups="Vivo")
	public void vivo1() {

		System.out.println("Apple Testing : vivo1");

	}
    @Test(groups="Vivo")
	public void vivo2() {
		System.out.println("Apple Testing : vivo2");
	}
    @Test(groups="Lenovo")
	public void lenovo1() {

		System.out.println("Apple Testing : lenovo1");

	}
    @Test(groups="Lenovo")
	public void lenovo2() {
		System.out.println("Apple Testing : lenovo2");
	}

}
