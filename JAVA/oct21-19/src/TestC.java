
public class TestC {
      public static void main(String[] args) {
	    Person.color = "fair";
	    Person.sleep();
	    System.out.println("Person color is "+Person.color);
	    Person p1 = new Person();
	    p1.age = 22;
	    p1.name = "Afreen";
	    
	    System.out.println("Person name is "+p1.name);
	    System.out.println("Person age is "+p1.age);
	    p1.color = "fair";
	    p1.sleep();
	    System.out.println("********************************************");
	   
	    Person p2 = new Person();
	    p2.age = 13;
	    p2.name = "Sufi";
	    p1.color = "fair";
	    
	    System.out.println("Person name is "+p2.name);
	    System.out.println("Person age is "+p2.age);
	    System.out.println("Person color is "+p2.color);
	    
}
}
