package Single;

public class SingleLevelInheritanceMain {
public static void main(String[] args) {
		
		FulltimeEmployee fte = new FulltimeEmployee(100, "ABC Bank");
		
		FulltimeEmployee fte1 = new FulltimeEmployee("ABC", 1, "abc@abc.com");

		FulltimeEmployee fte3 = new FulltimeEmployee("ABC1", 2, "abc2@abc.com",100,"DEF Bank");

		fte.display();
		fte1.display();
		fte3.display();
		
		System.out.println(fte);
		System.out.println(fte1);
		System.out.println(fte3);
		
		Employee emp = new Employee();
		Employee emp1= new Employee("EMployee", 3, "e@abc.com");
		
		System.out.println(emp);
		System.out.println(emp1);
		
		Employee e1 = new FulltimeEmployee();
		Employee e2 = new Employee();
		FulltimeEmployee e3 = new FulltimeEmployee();
		
		e1.updateSalary();
		
		e1.display();
		e2.display();
		//e1.super.display();
		
		//FullTimeEmployee e4 = new Employee();


	}
}
