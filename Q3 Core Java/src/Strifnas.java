
public class Strifnas {

	public static void main(String[] args) {
		String s="Hello hi Everyone";
		int hc=0;
		int ec=0;
		int lc=0;
		int oc=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='H'||s.charAt(i)=='h') {
				hc++;
			}
			else if(s.charAt(i)=='e'||(s.charAt(i)=='E')) {
				ec++;
			}
			else if(s.charAt(i)=='l'||s.charAt(i)=='L') {
				lc++;
			}
			else if(s.charAt(i)=='O'||s.charAt(i)=='o') {
				oc++;
			}
		}
		System.out.println("H: count "+hc);
		System.out.println("e: count "+ec);
		System.out.println("l: count "+lc);
		System.out.println("o: count "+oc);
	}
}
