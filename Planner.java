public class Planner{

    public final int MAX_COURSES = 50;
    public Course[] Planner;
    public int size = 0;
    
    public Planner(){
	Planner = new Course[MAX_COURSES];
    }
    
    public int size(){
	return size;
    }

    public void addCourse(Course newCourse, int position){
	int positionInArr = position - 1;
	for (int step = size; step > positionInArr; step--){
	    Planner[step] = Planner[step-1];
	}
	Planner[positionInArr] = newCourse;
	size++;
    }

    public void addCourse(Course newCourse){
	addCourse(newCourse, size+1);
    }

    public void removeCourse(int position){
	int positionInArr = position - 1;
	for (int step = positionInArr; step < size; step++){
	    Planner[positionInArr] = Planner[step+1];
	}
	size--;
    }

    public Course getCourse(int position){
	int positionInArr = position - 1;
	return Planner[positionInArr];
    }

    public static void filter(Planner planner, String department){
	String output = "No. Course Name               Department Code Section Instructor\n" +
	    "-------------------------------------------------------------------------------";
	int count = 1;
	for (Course course : planner.Planner){
	    if (department.equals(course.getDepartment())){
		output += "  " + Integer.toString(count);
		output += " " + course.getName();
		output += "\t" + course.getDepartment();
		output += "         " + Integer.toString(course.getCode());
		output += "      " + course.getSection();
		output += " " + course.getInstructor() + "\n";
		count++;
	    }
	}
	System.out.println(output);
    }

    public boolean exists(Course course){
	for (Course listedCourse : Planner){
	    if (course.equals(listedCourse))
		return true;
	}
	return false;
    }

    public Object clone(){
	Course[] newPlanner = new Course[MAX_COURSES];
	for (int step = 0; step < MAX_COURSES; step++){
	    Course temp = Planner[step];
	    newPlanner[step] = new Course(temp.getName(), temp.getDepartment(), temp.getCode(), temp.getSection(), temp.getInstructor());
	}
	return newPlanner;
    }

    public void printAllCourses(){
	System.out.println(this.toString());
    }
    
    public String toString(){
	String output = "No. Course Name               Department Code Section Instructor\n" +
	    "-------------------------------------------------------------------------------";
	int count = 1;
	for (Course course : Planner){
	    output += "  " + Integer.toString(count);
	    output += " " + course.getName();
	    output += "\t" + course.getDepartment();
	    output += "         " + Integer.toString(course.getCode());
	    output += "      " + course.getSection();
	    output += " " + course.getInstructor() + "\n";
	    count++;
	}
	return output;
    }
}
