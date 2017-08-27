

public class FileIO {

public static void main(String args[]) 
{        
    
    	BufferedWriter bw = null;
    	BufferedReader br = null;
    
        try{
            br = new BufferedReader(new FileReader("C:/Users/mdavawal/Desktop/TEST/ddbQuery"));
            bw = new BufferedWriter(new FileWriter("C:/Users/mdavawal/Desktop/TEST/ddbQuery1"));
             
            String line = br.readLine();
             
            for( int i = 1; i <= 1000 && line != null; i++)
            {
                bw.write(line);
                bw.write("\n");
                line = br.readLine();
            }
             
            System.out.println("Lines are Successfully copied!");
             
            br.close();
            bw.close();
        }
        catch(Exception e){
            System.out.println("Exception caught : " + e);
        }
	}
}