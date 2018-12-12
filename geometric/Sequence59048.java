package geometric;
/***
각 항이 그 앞 항과. 일정한 비(곱셈)를 가지는 수열을 말한다. 
그리고, 이 일정한 비를 공비(共比, common ratio)라고 한다.
2 + 6 + 18 + 54 = 80 4항까지의 합이다.
그렇다면 10항까지의 합(=시리즈)은 얼마인가? 59048
2 + (2*3) + (2* 3*3) + (2*3*3*3) 
 */
public class Sequence59048 {
	public static void main(String[] args) {
		int A = 2;//초항 init 이니셜라이징
		int R = 3;//공비 common rate
		int S = A;//시리즈 series
		int N = 2;//카운트 
		while(true) {
			N++;
			A *= R;
			S += A;
			if(N>11) {
			break;
		}
			System.out.println(S);
		}
	}
}
