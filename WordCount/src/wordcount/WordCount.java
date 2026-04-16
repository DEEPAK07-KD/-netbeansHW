package wordcount;

import java.util.Scanner;

public class WordCount {
    Scanner sc=new Scanner(System.in);
    String get;
    String word;
    WordCount(String get)
    {
        word=get;
        
    }
    public static void main(String[] args) {
       Scanner se=new Scanner(System.in);
        System.out.print("ENTER THE WORD :");
        String get=se.nextLine();
        WordCount wc=new WordCount(get);
       wc.main();
    }
    void main()
    {
        boolean result=true;
        do{
        System.out.println("<--WORD COUNTER-->");
        System.out.println("1.TOTAL CHARACTERS");
        System.out.println("2.TOTAL WORDS");
        System.out.println("3.TOTAL VOWELS");
        System.out.print("CHOOSE YOUR OPTION :");
        int op=sc.nextInt();
        if(op==1)
        {
            character(word);
        }
        else if(op==2)
        {
            words(word);
        }
        else if(op==3)
        {
            vowels(word);
        }
        else
        {
            result=false;
        }
        }while(result);
    }
    void character(String data)
    {
            data=data.replace(" ", "");
            System.out.println(data.length());
        
    }
    void words(String wo)
    {
        String wor[]=wo.trim().split(" ");
        System.out.println(wor.length);
    }
    void vowels(String data)
    {
        int count=0;
        data=data.toLowerCase();
        for (int i = 0; i < data.length(); i++) {
            char ch=data.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
