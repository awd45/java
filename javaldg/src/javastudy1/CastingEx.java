package javastudy1;

//person Ŭ����
class Person{
	String name;
	String id;
	//name �Ű� ������ �ִ� ������
	public Person(String name) {
		super();
		this.name = name;	
	}
	
	public String toString(){
		return "�̸���"+name+","+"���̵��"+id;
	}
	
}
//student Ŭ���� (����)
class Student extends Person{
	String grade;
	String department;
	//������ �ڵ� �ϼ��� �ȵ� ==> ������ �߰�
	public Student(String name){
		super(name); // person.name�ϰ� ������ ����Ŭ������ ������ ȣ��
	}
		
}


public class CastingEx {

	public static void main(String[] args) {
		Person p = new Student("�̵���");
		//p=s�� ������ ǥ��( �� ĳ����)
		//������ ������ ����
		//���� = ���� (��ĳ����)
		//������ ������ ���� ����
		//�� ��ȯ�� �ʿ�
		Student s = (Student) p; // �ٿ�ĳ����=>�������� ��ȯ
		
		s.id="awd45";
		s.grade="A���";
		s.department ="�ڵ��а�";

		//������ �ϱ�
		System.out.println(s.id +","+ s.grade+","+s.department);
		//Ŭ�����ȿ� toString()�޼��带 ���� ����ϱ�
		System.out.println(s);
	}
}
