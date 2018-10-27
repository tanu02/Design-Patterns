package coldMessage;

public class Sender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TemplateImp1 template1 = new TemplateImp1("Ayushi", "JPMC", "Java Developer");
		TemplateImp1 template2 = new TemplateImp1("Gourav", "JPMC", "C# Developer");
		
		System.out.println(template1.template().toString());
		System.out.println("\n");
		System.out.println(template2.template().toString());
	}
}
