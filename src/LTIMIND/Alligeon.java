package LTIMIND;

public class Alligeon {
	public static void main(String[] args){
		  String s="my name is nayak";
		  String[] s1=s.split("\\s");
		  String result="";
		  
		  for(String s2:s1){
		  for(int i=s2.length()-1;i>=0;i--){
		    result=result+s2.charAt(i);
		}
		result=result+" ";
		}
		System.out.println(result);
		}

}
