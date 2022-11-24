package org.sample;

public class sample {
	

	public static void main(String[] args) {
		
		         //01234567890123
		String s ="Java selenium";
		String s1="Java Selenium";
		
	
		
		//int length = s.length();
		//System.out.println(length);
		
	//	int indexOf = s.indexOf("e");
	//	System.out.println(indexOf);
		
		//1.charAt
		char c = s.charAt(6);
		System.out.println(c);
		
		//2.indexof(Value)
		int of = s.indexOf('e');
		System.out.println(of);
		
		//3.Latindex(value)
		int lastIndexOf = s1.lastIndexOf('n');
		System.out.println(lastIndexOf);
		
		// 3.toUpperCase
		String up = s.toUpperCase();
		System.out.println(up);
		
		//4.toLowerCase
		String low = s.toLowerCase();
		System.out.println(low);
		
		//5.isEmpty
		boolean nul = s.isEmpty();
		System.out.println(nul);
		
		//6.startswich(value)
		boolean str = s.startsWith("Sel");
		System.out.println(str);
		
		//7.endsWith(value)
		boolean end = s.endsWith("um");
		System.out.println(end);
		
		//8.contains(value)
		String con = s.concat("s");
		System.out.println(con);
		
		//9.equals
		boolean equ = s.equals(s1);
		System.out.println(equ);
		
		//10.equalIgnoreCase()
		boolean equalsI = s.equalsIgnoreCase(s1);
		System.out.println(equalsI);
		
		
		
		//11.compare
		int comTo = s.compareTo(s1);
		System.out.println(comTo);
		
		
		
		
		//12.lendth()
		int len = s.length();
		System.out.println(len);
		
		//13.replace(old,new)
		String rep = s.replace('e', '1');
		System.out.println(rep);
		
		//14.replaceAll(old,new)
		String replaceAll = s.replaceAll("selenium", "java");
		System.out.println(replaceAll);
		
		//16.trim
		String trim = s.trim();
		System.out.println(trim);
		
		//17.substring
		String substring = s.substring(5);
		System.out.println(substring);
		
		//18.substring(start index,end index)
		CharSequence subSequence = s.subSequence(4, 7);
		System.out.println(subSequence);
		
		//19.spilt
		String[] split = s.split("");
		for (int i = 0; i < split.length; i++) {
			System.out.println(i);
			
		}
		
		
		
		
		
		
		
		
		
	}

}
