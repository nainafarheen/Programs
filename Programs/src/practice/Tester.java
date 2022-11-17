package practice;

import java.io.IOException;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new AirJet();
		}catch(IOException e) {
			System.out.println("IOEXceptin is shown in Tester");
		}

	}

}
