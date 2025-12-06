package com.sham.inheritance.hierarchical;

import java.util.Scanner;

public class EmployeeSystem {

	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("enter pid : ");
			int pid = Integer.parseInt(scanner.nextLine());

			System.out.print("enter pname : ");
			String pname = scanner.nextLine();

			System.out.print("enter psalary : ");
			double psalary = scanner.nextDouble();
			PermanentEmp obj1 = new PermanentEmp(pid, pname, psalary);

			System.out.print("enter cid : ");
			int cid = scanner.nextInt();

			System.out.print("enter cname : ");
			String cname = scanner.next();

			System.out.print("enter csalary : ");
			double csalary = scanner.nextDouble();

			System.out.print("enter pname : ");
			int cduration = scanner.nextInt();
			ContractEmp obj2 = new ContractEmp(cid, cname, csalary, cduration);

			System.out.println(obj1);
			System.out.println(obj2);
			
			scanner.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
			
		}
	}
}
