package Practice;

public class ImmutableString {

	public static void main(String[] args) {

		String str = new String("happy");// scp string constant pool

		String s = ("virat");
		s.concat("kohli");
		System.out.println(s);

		System.out.println("string buffer:" + "==============================");

		StringBuffer sb = new StringBuffer("sachin");
		sb.append("tendulkar");
        System.out.println(sb);
	}

}
