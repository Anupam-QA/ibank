import java.io.File;
import java.io.IOException; 

public class FileCount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		   
        	File directory=new File("H:\\GoogleDriveOffline\\content\\Contents");
        	//int fileCount=directory.list().length;
            //System.out.println("File Count:"+fileCount);
            
            File[] files = directory.listFiles();
         
            
            for (File file : files)
            {
            	
            	if(file.isDirectory())
            	{
            		//desktop.open(file);  
            		File s=file.getAbsoluteFile();
            		int l=s.list().length;
            		if(l<2)
            		{
            			File mising=s.getAbsoluteFile();
            			 System.out.println(mising);
            		}
            		
            		
            	}
            	
            }
        }
           

	}


