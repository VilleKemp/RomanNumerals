//Converts roman numbers to integers. Returns 0 if number is not valid.
public class RomanNumerals {
		public int invalid;
		public int value;
	public int convertToInteger(String romanNum) {
		// To be Implemented
		invalid=0;
		value=0;
		if(check_validity(romanNum)!=0) {
			return 0;
		}
		
		calculate(romanNum);
		
		if(invalid!=0) {
			return 0;
		}
		return value;
		
	}
	
	public int calculate(String s) {
		
		
		for (int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
				
			if(counting_rules(s,i)==0){
				add(c);
			}
			else {
				substract(c);
			}
		}
		
		return value;
	}
	
	public int counting_rules(String s, int i) {
		if(i+1<s.length()) {
			//I and X can only be substracted from the 2 next highest values
			if(convert(s.charAt(i))<convert(s.charAt(i+1)) && ( s.charAt(i)=='I') && (convert(s.charAt(i+1))>10) ){
				invalid=1;
			}
			
			if(convert(s.charAt(i))<convert(s.charAt(i+1)) && ( s.charAt(i)=='X') && convert(s.charAt(i+1))>100 ){
				invalid=1;
			}
			
			//V,L,D can't appear before number that are larger than they are
			if(convert(s.charAt(i))<convert(s.charAt(i+1)) && ( s.charAt(i)=='V' || s.charAt(i)=='L' || s.charAt(i)=='D') ){
				invalid=1;
			}
				
		//smaller then larger
			
		if(convert(s.charAt(i))<convert(s.charAt(i+1)) && ( s.charAt(i)!='V' || s.charAt(i)!='L' || s.charAt(i)!='D') ){
			
			return 1;
			
		}

		}
		return 0;
	}
	
	
	public void substract(char c) {
		value=value-convert(c);
	}
	
	public void add(char c) {
		
		value=value+convert(c);
	}
	

	
	public int convert(char c) {
		int int_value=0;
		if(c=='I') {
			int_value=1;
		}
		if(c=='V') {
			int_value=5;
		}
		if(c=='X') {
			int_value=10;
		}
		if(c=='L') {
			int_value=50;
		}
		if(c=='C') {
			int_value=100;
		}
		if(c=='D') {
			int_value=500;
		}
		if(c=='M') {
			int_value=1000;
		}
		
		return int_value;
	}
	
	public int check_validity(String s) {

		for (int i = 0; i < s.length(); i++){
				char c = s.charAt(i);        
				repetition(c,s,i);	
			}
		if(invalid!=0) {
		return 1;
		}
		else {
			return 0 ;
		}
	}
	
	public void repetition(char c, String s, int i){
		if((i+3)<s.length()) {
		if(c=='M' && s.charAt(i+1)=='M' && s.charAt(i+2)=='M' && s.charAt(i+3)=='M' ) {
			invalid = 1;
		}
		if(c=='C' && s.charAt(i+1)=='C' && s.charAt(i+2)=='C' && s.charAt(i+3)=='C' ) {
			invalid = 1;
		}
		if(c=='X' && s.charAt(i+1)=='X' && s.charAt(i+2)=='X' && s.charAt(i+3)=='X') {
			invalid = 1;
		}
		if(c=='I' && s.charAt(i+1)=='I' && s.charAt(i+2)=='I' && s.charAt(i+3)=='I') {
			invalid = 1;
		}
		}
		if((i+1)<s.length()) {
		if(c=='V' && s.charAt(i+1)=='V' ) {
			invalid = 1;
		}
		if(c=='L' && s.charAt(i+1)=='L' ) {
			invalid = 1;
		}
		if(c=='D' && s.charAt(i+1)=='D' ) {
			invalid = 1;
		}
		
		}
	}
}
