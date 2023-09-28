package org.codebyaidan.ch2;

class Factorials {

    static int computeFactorial(int k) {
        if (k < 0) return -1;
        else if (k == 0 || k == 1) return 1;
        else return k*computeFactorial(k-1);
    }

    public static void main(String[] args) {
        int n;
        n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++)
            System.out.println(i + " factorial is " + computeFactorial(i));
    }
}

/* ............... Example compile and run(s)

D:\>cd .\src\main\java\org\codebyaidan\ch2\

D:\>javac fact.java

D:\>cd ../../../

D:\>java -cp . org.codebyaidan.ch2.Factorials 5
1 factorial is 1
2 factorial is 2
3 factorial is 6
4 factorial is 24
5 factorial is 120

D:\>java -cp . org.codebyaidan.ch2.Factorials
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at org.codebyaidan.ch2.Factorials.main(fact.java:13)
                                            ... end of example run(s)  */
