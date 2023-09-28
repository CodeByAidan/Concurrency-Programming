package org.codebyaidan.ch2;

class Factorials {
    static int computeFactorials(int k) {
        if (k < 0) return -1;
        else if (k == 0 || k == 1) return 1;
        else return k*computeFactorials(k-1);
    }
    public static void main(String[] args) {
        int n;
        n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++)
            System.out.println
                (i + " factorial is " + computeFactorials(i));
    }
}
