package test;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

public class TestMain {

	School goodSchool = School.getInstnace();
	Subject korean;
	Subject math;
	Subject dance;
	
	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) {
		TestMain test = new TestMain();
		
		test.createSubject();
		test.createStudent();
		
		String report = test.gradeReport.getReport(); //성적 결과 생성
		System.out.println(report);
	}

	public void createSubject() {
		korean = new Subject("국어", Define.KOREAN);
		math = new Subject("수학", Define.MATH);
		dance = new Subject("댄스", Define.DANCE);
		
		goodSchool.addSubject(korean);
		goodSchool.addSubject(math);
		goodSchool.addSubject(dance);
	}
	
	public void createStudent() {
		Student student1 = new Student(181213, "남진현", korean);
		Student student2 = new Student(181512, "김수현", math);
		Student student3 = new Student(171230, "전지현", korean);
		Student student4 = new Student(171255, "강동원", korean);
		Student student5 = new Student(171590, "김유식", math);
		
		goodSchool.addStudent(student1);
		goodSchool.addStudent(student2);
		goodSchool.addStudent(student3);
		goodSchool.addStudent(student4);
		goodSchool.addStudent(student5);
		
		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);
		
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);
		
		addScoreForStudent(student1, korean, 95);
		addScoreForStudent(student1, math, 56);
		
		addScoreForStudent(student2, korean, 95);
		addScoreForStudent(student2, math, 95);
		
		addScoreForStudent(student3, korean, 100);
		addScoreForStudent(student3, math, 88);
		
		addScoreForStudent(student4, korean, 89);
		addScoreForStudent(student4, math, 95);
		
		addScoreForStudent(student5, korean, 85);
		addScoreForStudent(student5, math, 56);
	}
	
		public void addScoreForStudent(Student student, Subject subject, int point) {
			Score score = new Score(student.getStudentId(), subject, point);
			student.addSubjectScore(score);
		}
}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


















































