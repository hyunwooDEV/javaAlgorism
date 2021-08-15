package algorism;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		Student st1 = new Student("�տ���", "1");
		Student st2 = new Student("���Ȱ�", "2");
		Student st3 = new Student("�����", "3");
		
		ArrayList <Student> list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
//		for (Student stu : list) {
//			System.out.println(stu.getName());
//			System.out.println(stu.getNo());
//		}
		
		Scanner scan = new Scanner(System.in);
		
		
		
		
		
		while(true) {
			System.out.println("��� �˻��� �ϰ������ y, �����ϰ������ n");
			String input = scan.next();
			
			if (input.equals("y")) {
				System.out.println("�˻��� �����մϴ�.");
				String name = scan.next();
				boolean flag = false;
				
				for (Student stu: list) {
					if(stu.getName().equals(name)) {
						System.out.println("�ش��ϴ� �л��� �й���:"+stu.getNo());
						flag = true;
					}
				}
				// flag�� false �϶�
				if (!flag) {
					System.out.println("�ش��ϴ� �л��̸��� �����ϴ�.");
				}
				
			} else if (input.equals("n")) {
				break;
			} else {
				
			}
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		scan.close();
	}
	
}

class Student {
	
	private String name;
	private String no;
	
	public Student(String name, String no) {
		this.name = name;
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	
	
}
