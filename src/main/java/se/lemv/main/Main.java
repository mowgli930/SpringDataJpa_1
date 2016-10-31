package se.lemv.main;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import se.lemv.model.Department;
import se.lemv.model.Employee;
import se.lemv.model.ParkingSpot;
import se.lemv.repository.DepartmentRepository;
import se.lemv.repository.EmployeeRepository;
import se.lemv.repository.ParkingSpotRepository;

public class Main {
	
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
			context.scan("se.lemv");
			context.refresh();
			
			EmployeeRepository employeeRepo = context.getBean(EmployeeRepository.class);
			ParkingSpotRepository parkingSpotRepo = context.getBean(ParkingSpotRepository.class);
			DepartmentRepository departmentRepo = context.getBean(DepartmentRepository.class);
			
			Department department = new Department("Department of testing");
			ParkingSpot parkingSpot = new ParkingSpot("The parking label");
			departmentRepo.save(department);
			parkingSpotRepo.save(parkingSpot);

			Employee employee = new Employee("Anakin", "Skywalker", "theTester", Arrays.asList(department), parkingSpot);
			
			employeeRepo.save(employee);
			departmentRepo.findAll().forEach(System.out::println);
			parkingSpotRepo.findAll().forEach(System.out::println);
			employeeRepo.findAll().forEach(System.out::println);
			
			employeeRepo.findAll().forEach(e -> System.out.println(e.getDepartments()));
		}
	}
}
