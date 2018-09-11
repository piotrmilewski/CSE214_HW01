public class Course{

    public String name;
    public String department;
    public int code;
    public byte section;
    public String instructor;

    public Course(){
	name = "";
	department = "";
	code = 0;
	section = 0;
	instructor = "";
    }

    public Course(String newName, String newDep, int newCode, byte newSection, String newInstructor){
	name = newName;
	department = newDep;
	code = newCode;
	section = newSection;
	instructor = newInstructor;
    }
    
    public String getName(){
	return name;
    }

    public String setName(String newName){
	String oldName = name;
	name = newName;
	return oldName;
    }

    public String getDepartment(){
	return department;
    }

    public String setDepartment(String newDepartment){
	String oldDepartment = department;
	department = newDepartment;
	return oldDepartment;
    }

    public int getCode(){
	return code;
    }

    public int setCode(int newCode){
	int oldCode = code;
	code = newCode;
	return oldCode;
    }

    public byte getSection(){
	return section;
    }

    public byte setSection(byte newSection){
	byte oldSection = section;
	section = newSection;
	return oldSection;
    }

    public String getInstructor(){
	return instructor;
    }

    public String setInstructor(String newInstructor){
	String oldInstructor = instructor;
	instructor = newInstructor;
	return oldInstructor;
    }

    public Object clone(){
	Course newCourse = new Course(this.name, this.department, this.code, this.section, this.instructor);
	return newCourse;
    }

    public boolean equals(Object obj){
	return ((this.name).equals(((Course)obj).getName()) &&
		(this.department).equals(((Course)obj).getDepartment()) &&
		(this.code) == (((Course)obj).getCode()) &&
		(this.section) == (((Course)obj).getSection()) &&
		(this.instructor).equals(((Course)obj).getInstructor()));
    }
}
