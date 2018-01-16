public class Junk{

public static void main(String[] args){
System.out.println("inputting " + args[0]);

boolean result = didOstwaldActAlone(Boolean.parseBoolean(args[0]));

if (result)
	{System.out.println("Acted Alone");} 
else 
	{System.out.println("Did not act alone");}
}

private static  boolean didOstwaldActAlone(boolean input){return input;}

}
