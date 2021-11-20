package C07_11_2021;

public class ReplaceALL {

	public static void main(String[] args) {


		String str="Java 98öğrenmek c..ok k876olay";
		//ReplaceALL metadlarını kullanarak yapacağız
		str=str.replaceAll("\\d", "");
		System.out.println(str);
		str=str.replaceAll("\\s", "x");
		System.out.println(str);
		//str=str.replaceAll("\\W", "");
		//System.out.println(str);
		str=str.replaceAll("x", " ");
		System.out.println(str);
	}

}
