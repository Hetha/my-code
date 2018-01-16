public class Junk{

public static void main(String[] args){
System.out.println("inputting " + args[0]);

if (didOstwaldActAlone(Boolean.parseBoolean(args[0])))
	{System.out.println("Acted Alone");} 
else {System.out.println("Did not act alone");}
}

private static  boolean didOstwaldActAlone(boolean input){return input;}

}
