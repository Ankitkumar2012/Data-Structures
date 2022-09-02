package cls_23;

public class NotrepeatAlphabat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abca";
		ans(str, "");

	}

	public static void ans(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			boolean ac = false;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					ac = true;
					break;
				}
			}
			
			if (ac == false)
				ans(str.substring(i + 1) + str.substring(0, i), ans + str.charAt(i));

		}
	}
}
