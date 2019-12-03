package test;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.*;
import utils.Define;

public class TestMain {

	School goodSchool = School.getInstnace();
	Subject korean;
	Subject math;
	
	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) {
		TestMain test = new TestMain();
		
		test.createSubject();
		test.createStudent();
		
		String report = test.gradeReport.getReport(); //성적 결과 생성
		System.out.println(report);
	}

	public void creatSubject() {
		korean = new Subject("국어", Define.KOREAN);
		math = new Subject("수학", Define.MATH);
		
		goodSchool.addSubject(korean);
		goodSchool.addSubject(math);
	}
	
	public void createStudent() {
		Student student1 = new Student(181213, "남진현", korean);
		Student student2 = new Student(181512, "김수현", math);
		Student student3 = new Student(171230, "공유", korean);
		Student student4 = new Student(171255, "강동원", korean);
		Student student5 = new Student(171590, "김유식", math);
		
		goodSchool.addStudent(student1);
		goodSchool.addStudent(student2);
		goodSchool.addStudent(student3);
		goodSchool.addStudent(student4);
		goodSchool.addStudent(student5);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
