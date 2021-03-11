import java.util.ArrayList;
import java.util.stream.Stream;

public class JavaStream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> name =new ArrayList<String>();
		name.add("ram");
		name.add("ram");
		name.add("mohan");
		name.add("ravi");
		name.add("kavi");
		name.add("love");
		
		//Stream.of("ram","mohan","mohan","mohan","mohan").filter(s->s.startsWith("r")).count();
		
		//long c= name.stream().filter(s->s.startsWith("r")).count();
		
		//print the name lenght greater then 3
		
		//name.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
		
		name.stream().filter(s->s.length()>3).limit(1).forEach(s->System.out.println(s));
		
		//System.out.println("c" +c);

	}

}
