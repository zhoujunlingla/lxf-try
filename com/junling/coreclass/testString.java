package com.junling.coreclass;

public class testString {
    public static void main(String[] args){
        String s1 = "Hello!";
        String s2 = new String(new char[] {'H', 'e','l','l','o','!'});

        String s = "Hello";
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println(s);
        /* Hello HELLO */

        String s3 = "hello";
        String s4 = "Hello".toLowerCase();
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        // == 会比较两个字符串对象的引用

        System.out.println("Hello".contains("ll"));
        System.out.println("Hello".indexOf("l"));
        System.out.println("Hello".lastIndexOf("l"));
        System.out.println("Hello".startsWith("He"));
        System.out.println("Hello".endsWith("lo"));
        System.out.println("Hello".substring(2));
        System.out.println("Hello".substring(2, 4)); //返回[2,4)之间的子串
        System.out.println("\tHello\r\n".trim());//移除空格,\t，\r，\n
        System.out.println("".isEmpty()); // true，因为字符串长度为0
        System.out.println("  ".isEmpty()); // false，因为字符串长度不为0
        System.out.println("  \n".isBlank()); // true，因为只包含空白字符
        System.out.println(" Hello ".isBlank()); // false，因为包含非空白字符

        String s5 = "hello";
        s5.replace('l', 'w'); // "hewwo"，所有字符'l'被替换为'w'
        s5.replace("ll", "~~"); // "he~~o"，所有子串"ll"被替换为"~~"

        String s6 = "A,,B;C ,D";
        s6.replaceAll("[\\,\\;\\s]+", ","); // "A,B,C,D"

        String s7 = "A,B,C,D";
        String[] ss = s7.split("\\,"); // {"A", "B", "C", "D"}

        String[] arr = {"A", "B", "C"};
        String s8 = String.join("***", arr); // "A***B***C"

        String s9 = "Hi %s, your score is %d!";
        System.out.println(s9.formatted("Alice", 80));
        System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));
    }
}
