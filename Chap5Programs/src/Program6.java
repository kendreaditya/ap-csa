
public class Program6 {
	public static void main(String[] args) 
    {

		for(int x = 10;x >= 1; x--)
		{
		for(int i = 1;i <= 3; i++)
		{
			String dayString;
         
  
        switch (i) { 
        case 1: 
            dayString = String.valueOf(x)+" green bottles hanging on the wall,\n"+String.valueOf(x)+" green bottles hanging on the wall,\n"; 
            break; 
        case 2: 
            dayString = "And if "+String.valueOf(1)+" green bottle should accidentally fall,\n"; 
            break; 
        case 3:
        	if(!(x==1))
        		dayString = "There'll be "+String.valueOf(x-1)+" green bottles hanging on the wall.\n\n"; 
        	else
        		dayString = " There'll be no green bottles hanging on the wall.";
            break;
        default: 
            dayString = "There'll be no green bottles hanging on the wall."; 
            break; 
        	}
        System.out.print(dayString);
		}
		System.out.println();
		}
    }
}
