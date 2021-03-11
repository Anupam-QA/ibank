import java.util.ArrayList;
import java.util.stream.Stream;

public class JavaStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> name =new ArrayList<String>();
		name.add("ram");
		name.add("mohan");
		name.add("ravi");
		name.add("kavi");
		name.add("love");
		
		int count=0;
		
		for (int i=0;i<name.size();i++)
		{
			String actualName = name.get(i);
			
			if(actualName.startsWith("r"))
			{
				count++;
			}
		}

	System.out.println("count is "+ count);	
		
	}
	
	public  void StreamFilter()
	
	{
		ArrayList<String> name =new ArrayList<String>();
		name.add("ram");
		name.add("ram");
		name.add("mohan");
		name.add("ravi");
		name.add("kavi");
		name.add("love");
		
		Stream.of("ram","mohan","mohan","mohan","mohan").filter(s->s.startsWith("r")).count();
		
		long c= name.stream().filter(s->s.startsWith("r")).count();
		
		//print the name lenght greater then 3
		
		name.stream().filter(s->s.length()>3).forEach(s->System.out.println());
		
		name.stream().filter(s->s.length()>3).limit(1).forEach(s->System.out.println());
		
		System.out.println("c" +c);
	}

}

