//Course2 Chapter3 interface Hw5

package interfaceHw5;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		ClothProduct cloth = new ClothProduct("C1", "Dress", 2, 210, "1.Depot", "4.Floor", "W", "M");
		FoodProduct food = new FoodProduct("F1", "Bagel", 1, 40, "5.Depot", "2.Floor", new Date(), 12);
		ConsultancyProduct consultancyProduct = new ConsultancyProduct("CP1", "Consultancy Product", 50, 10000);
		OldComputer oldComputer = new OldComputer("6.Depot", "3.Floor", 15674, 123);
		Gift gift = new Gift("G1", "Dress", "1.Depot ", "4.Floor");

		cloth.purchase();
		food.toString();
		consultancyProduct.provideConsultingServices();
		oldComputer.purchase();
		gift.toString();

	}
}
