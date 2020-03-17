import java.util.*; 

public class CSVStripper
{				
	public String strip(String field)
	{
		if(field.isEmpty()) return "";
		
		String result = "";
		int stringStart = 0;
		boolean hasMinusSign = false;
		
		//parse until a string or numeric values is reached
		for(stringStart = 0; stringStart < field.length(); stringStart++)
		{
			if(isValidStringStart(field.charAt(stringStart)))
			{	//Check previous character for - sign
				if(stringStart > 0) hasMinusSign = field.charAt(stringStart -1) == '-';
				break;
			}
		}
			
		result = field.substring(stringStart, field.length());
		
		if(isNumeric(result))
		{
			if(hasMinusSign) result = "-"+result; 
		}
	
		return result; 
	}
	
	private boolean isValidStringStart(char value)
	{
		return Character.isLetter(value) || Character.isDigit(value);
	}
	
	private boolean isNumeric(String field)
	{
		if(field == null || field.isEmpty()) return false;
		try
		{
			double number = Double.parseDouble(field);
		}
		catch(NumberFormatException ex){ return false;}
		
		return true;
	}

}
