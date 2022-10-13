package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department insert ===");
		Department newDepartment = new Department(null, "Animes");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n=== TEST 2: Department update ===");
		Department dep = departmentDao.findById(11);
		dep.setName("Sales");
		departmentDao.update(dep);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 3: Department delete ===");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter id for delete test: ");
			int id = sc.nextInt();
			departmentDao.deleteById(id);
			System.out.println("Delete completed!");
		}
		
		System.out.println("\n=== TEST 4: Department findById ===");
		dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 5: Department findAll ===");
		List<Department> list = departmentDao.findAll();
		list.forEach(System.out::println);
	}
}
