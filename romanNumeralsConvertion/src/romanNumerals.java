public class romanNumerals {
	
	public boolean checkInput(int input)
	{
		if(input < 1 || input > 2999)
    		return false;
		return true;
	}
	
	 static String NumberToRomain(int x)
	 {
	      String s;
	      s = "";
	       switch(x % 10)
	       {
	       		case 9: s+="IX";break;
				case 8: s+="VIII";break;
				case 7: s+="VII";break;
				case 6: s+="VI";break;
				case 5: s+="V";break;
				case 4: s+="IV";break;
				case 3: s+="III";break;
				case 2: s+="II";break;
				case 1: s+="I";break;
	       }
	      
	      
	      
	      return s;
	      
	 }
	 
}