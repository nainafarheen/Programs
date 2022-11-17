package practice;

public class Stringrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="I am a Consultant"; 
		String es = "Consultant am I a";
		String[] wd = s.split(" ");
		String fs="", ls="";
		for(int i=wd.length-1; i>=0; i--) {
			if(i%2!=0) {
				fs=fs+wd[i];
			}
			else {
				ls=ls+wd[i];
			}
		}
		System.out.println(fs+ls);
		

	}

}
