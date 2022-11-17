package practice;

public class Uplers {
	static int solution(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;
            if (A[i] == Y)
                nY += 1;
            if ((nX!=0) && (nX == nY))
                result = i;
        }       
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b= {1,1,1};
		int p=solution(1,1,b);
		System.out.println(p);
		
}
}
