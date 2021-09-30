
public class BoxPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boxPrimitives();

	}

	private static void boxPrimitives() {
		// TODO Auto-generated method stub
		Integer boxedInt = Integer.valueOf(8);//static factory
		Boolean boxedBoolean = Boolean.valueOf(true);
		Character boxedCharacter = Character.valueOf('c');
		Double boxedDouble = Double.valueOf(25.5);
		
		System.out.println(boxedInt);
		System.out.println(boxedBoolean);
		System.out.println(boxedCharacter);
		System.out.println(boxedDouble);
		
		
		
		//Integer boxedInt1 = Integer.valueOf("8");
		//Integer invalid = Integer.valueOf("eight");
		
		//Integer boxedInt2 = new Integer(8);//deprecated constructor
		
		//System.out.println(boxedInt1);
		//unwrap type values
		int primitiveInt = boxedInt.intValue();
		boolean primitiveBoxed = boxedBoolean.booleanValue();
		char primitiveChar = boxedCharacter.charValue();
		
		System.out.println(primitiveInt);
	    System.out.println(primitiveBoxed);
		System.out.println(primitiveChar);
		
		//Parsing Strings
		String data = "4004 Effective java programming language guide 2007";
		String[] items = data.split("\t");
		long id = Long.parseLong(items[0]);
		String title = items[1];
		int pubYear = Integer.parseInt(items[2]);
		char genre = items[3].charAt(0);
		double rating = Double.parseDouble(items[4]);
		
		System.out.println(id);
		System.out.println(title);
		System.out.println(pubYear);
		System.out.println(genre);
		System.out.println(rating);
		
		//Integer boxedPubYear = Integer.valueOf(items[2]);
		//utility method
		boolean isLetter = Character.isLetter(genre);
		boolean isDigit = Character.isDigit(genre);
		boolean isLetterOrDigit = Character.isLetterOrDigit(genre);
		boolean isUpperCase = Character.isUpperCase(genre);
		
		System.out.println(isLetter);
		System.out.println(isDigit);
		System.out.println(isLetterOrDigit);
		System.out.println(isUpperCase);
				

		
		
	}

}
