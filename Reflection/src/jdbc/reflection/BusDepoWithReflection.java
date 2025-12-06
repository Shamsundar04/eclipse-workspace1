package jdbc.reflection;

import java.util.Scanner;

class BusDepoWithReflection {

	public static void main(String[] args) {

		Scanner scn = null;
		try {

			Driver hk = new Driver();
			scn = new Scanner(System.in);

			System.out.print("Enter Vehicle Name (RedBus/Volvo): ");
			String vehicleName = scn.nextLine();

			// Reflection API
			Class<?> cls = Class.forName("jdbc.reflection." + vehicleName); // FIX #1
			Object obj = cls.getDeclaredConstructor().newInstance(); 		// FIX #2
			
			if (obj instanceof Vehicle) {
				Vehicle vehicle = (Vehicle) obj;
				hk.drive(vehicle);
			} else {
				System.out.println(vehicleName + " is not a vehicle");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			scn.close();
		}
	}
}
