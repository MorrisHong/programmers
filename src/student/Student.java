package student;

public class Student {
	String name;
	int birthYear;
	int number;
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.birthYear = 1991;
		s1.number = 101010;
		
		Student s2 = new Student();
		s2.name = "홍길동";
		s2.birthYear = 1991;
		s2.number = 101010;
		
		if(s1.equals(s2)) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		System.out.println("s1.hashCode() : "+s1.hashCode());
		System.out.println("s2.hashCode() : "+s2.hashCode());
		
		System.out.println("s1 : "+s1.toString());
		System.out.println("s2 : "+s2.toString());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + birthYear;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (birthYear != other.birthYear)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", birthYear=" + birthYear + ", number=" + number + "]";
	}
	
	
}
