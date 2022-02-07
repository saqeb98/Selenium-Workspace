package Random1;

public class Lettercount 
{
	public static void main(String[] args)
	  {
	    String str = "aabbcccddd";
	    int[] counts = new int[(int) Character.MAX_VALUE];
	    // If you are certain you will only have ASCII characters, I would use `new int[256]` instead

	    for (int i = 0; i < str.length(); i++) {
	        char charAt = str.charAt(i);
	        counts[(int) charAt]++;
	    }

	    for (int i = 0; i < counts.length; i++) {
	        if (counts[i] > 0)
	            //System.out.println("Number of " + (char) i + ": " + counts[i]);
	            System.out.print(""+ counts[i] + (char) i + "");
	    }
	  }
}
