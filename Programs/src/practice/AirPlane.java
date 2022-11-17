package practice;

import java.io.IOException;

class AirPlane {
	public AirPlane() throws IOException {
		System.out.println("AirPlane");
		throw new IOException();
	}

}
