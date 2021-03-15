package com.techelevator;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Application {
	// instance variables
	private static List<Department> departments = new ArrayList<>();
	private static List<Employee> employees = new ArrayList<>();
	private static Map<String, Project> projects = new HashMap<>();
	
    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {
        // create some departments
        createDepartments();
        // print each department by name
        printDepartments();
        // create employees
        createEmployees();
        // give Angie a 10% raise, she is doing a great job!
        Employee angieSmith = employees.get(1);
		angieSmith.raiseSalary(10);
		
        // print all employees
        printEmployees();
        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();
        // print each project name and the total number of employees on the project
        printProjectsReport();
    }
    /**
     * Create departments and add them to the collection of departments
     */
    private static void createDepartments() {
    	
    	Department engineering = new Department(003, "engineering");
    	Department marketing = new Department(001, "marketing");
    	Department sales = new Department(002, "sales");
    	
    	departments.add(marketing);
    	departments.add(sales);
    	departments.add(engineering);
    }
    /**
     * Print out each department in the collection.
     */
    private static void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for(Department department : departments ) {
        	System.out.println(department.getName());
        }
    }
    /**
     * Create employees and add them to the collection of employees
     */
    private static void createEmployees() {
    	Department engineering = departments.get(2);
    	Department marketing = departments.get(0);
    	
    	Employee deanJohnson = new Employee(0, null, null, null, marketing, null);
    	Employee angieSmith= new Employee(002, "Angie", "Smith", "asmith@teams.com", engineering, "08/21/2020" );
    	Employee margaretThompson = new Employee(003, "Margaret", "Thompson", "mthompson@teams.com", marketing, "08/21/2020" );
    	deanJohnson.setEmployeeId(001);
    	deanJohnson.setFirstName("Dean");
    	deanJohnson.setLastName("Johsnon");
    	deanJohnson.setEmail("djohnson@teams.com");
    	deanJohnson.setDepartment(departments.get(2));
    	deanJohnson.setHireDate("08/21/2020");
    //	angieSmith.raiseSalary(10);
    	
    	employees.add(deanJohnson);
    	employees.add(margaretThompson);
    	employees.add(angieSmith);
    }
    /**
     * Print out each employee in the collection.
     */
    private static void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        for(Employee employee : employees ) {
        	System.out.println(employee.getFullName() + " (" + employee.getSalary() + ") " + employee.getDepartment().getName());
        }
    }
    /**
     * Create the 'TEams' project.
     */
    private static void createTeamsProject() {
    	
  	Project teams = new Project("TEams", "Project Management Software", "10/10/2020", "11/10/2020");
  	
  	List<Employee> engineeringTeam = new ArrayList<>();
  	for ( Employee employee : employees){
  		if (employee.getDepartment().getName().equals("engineering")){
  			engineeringTeam.add(employee);
  		}
  	}
  	projects.put(teams.getName(), teams);
  		teams.setTeamMembers(engineeringTeam);
  	}
    /**
     * Create the 'Marketing Landing Page' project.
     */
    private static void createLandingPageProject() {
    	
    Project marketingLandingPage = new Project("Marketing Landing Page", "Lead Capture Landing Page for Marketing", "10/10/2020", "10/17/2020");
    List<Employee> marketingTeam = new ArrayList<>();
  	for ( Employee employee : employees){
  		if (employee.getDepartment().getName().equals("marketing")){
  			marketingTeam.add(employee);
  		}
  	}
  	projects.put(marketingLandingPage.getName(), marketingLandingPage);
  		marketingLandingPage.setTeamMembers(marketingTeam);
    }
    /**
     * Print out each project in the collection.
     */
    private static void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");
        for(Map.Entry<String, Project> entry : projects.entrySet()) {
        	System.out.println(entry.getKey() + ": " + entry.getValue().getTeamMembers().size());
        }
    }
}