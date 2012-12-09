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
	      switch((x % 100) / 10)
	      {
	       case 9: s+="XC";break;
	       case 8: s+="LXXX";break;
	       case 7: s+="LXX";break;
	       case 6: s+="LX";break;
	       case 5: s+="L";break;
	       case 4: s+="XL";break;
	       case 3: s+="XXX";break;
	       case 2: s+="XX";break;
	       case 1: s+="X";break;
	      }
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