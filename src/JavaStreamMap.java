import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;

public class JavaStreamMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//filter name end with a 
		//Stream.of("rama","sohan","yashika","ravi","mohan").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));

		// filter name first letter r in shorting
		//Stream.of("rama","sohan","yashika","raavi","mohan").filter(s->s.startsWith("r")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		List<String> fname=Arrays.asList("rama","sohan","yashika","raavi","mohan");
		//name.stream().filter(s->s.startsWith("r")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		List<String> lname=Arrays.asList("sinha","singh","ved","yadav","kumar");
		
		Stream<String> newstream= Stream.concat(fname.stream(),lname.stream());
		
		//newstream.sorted().forEach(s->System.out.println(s));
		
		boolean flag=newstream.anyMatch(s->s.equalsIgnoreCase("ved"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
		
	}
	@Test
	public void streamcollect()
	{
		//List<String> Ls=Stream.of("rama","sohan","yashika","raavi","mohan").filter(s->s.startsWith("r")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());
		//System.out.println(Ls.get(0));
		
		List<Integer> values= Arrays.asList(3,5,7,1,4,4,6);
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		
		
	}

}
