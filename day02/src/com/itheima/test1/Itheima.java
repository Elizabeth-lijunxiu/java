package com.itheima.test1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Itheima {
    public static void main(String[] args) {


    }

    public static void scanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.nextLine();
        String str2 = "";
        for (int i = str.length(); i >= 0; i--) {
            str2 += str.charAt(i);
        }
        if (str.equals(str2)) {
            System.out.println(str + "是对称的");
        } else {
            System.out.println(str + "是对称的");
        }

    }

    public static List<Integer> getDiff(List<Integer> list1, List<Integer> list2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            int num = list1.get(i);
            if (!list2.contains(num)) {
                list.add(i);
            }
        }
        for (int i = 0; i < list2.size(); i++) {
            int num = list2.get(i);
            if (!list.contains(num)) {
                list.add(i);
            }
        }
        return list;
    }

    public static List<Integer> getSame(List<Integer> list1, List<Integer> list2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            int num = list.get(i);
            if (list2.contains(num)) {
                list.add(num);
            }
        }
        return list;
    }

    public static boolean no14(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        if (list.contains(1) && list.contains(4)) {
            return false;
        }
        return true;
    }

    public static List<Integer> getRandom() {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        while (list.size() < 10) {
            int num = r.nextInt(100) + 1;
            //去重
            if (!list.contains(num)) {
                list.add(num);
            }

        }
        return list;

    }

    public static void method21() {
        int count = 0;

        for (int i = 1; i <= 10; i++) {

            if (i % 5 == 0) {

                break;

            }

            count++;

        }

        System.out.println(count);

    }

    public static int blackjack(int a, int b) {
//        System.out.println(blackjack(15,18));
        int c = 21 - a;
        int d = 21 - b;

        if (c <= 0 && d >= 0) {
            return b;
        }
        if (c >= 0 && d <= 0) {
            return a;
        }
        if (c >= 0 && d >= 0) {
            if (c > d) {
                return b;
            }
            return a;
        }
        return 0;
    }

    public static int sum() {
        int sum = 0;
        for (int i = 15; i <= 1005; i++) {
            if (i % 10 == 5) {
                sum += i;
            }
        }
        return sum;
    }

    public static int sum(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        }
        if (a == b && b != c) {
            return c;
        }
        if (a != b && b == c) {
            return a;
        }
        if (a != b && a == c) {
            return b;
        }
        return a + b + c;
    }

    public static boolean brick(int a, int b, int c) {
        return a + (b * 5) >= c && a >= c % 5;
    }

    public static int makeChocolate(int a, int b, int c) {
        if ((a + (b * 5) < c) || a < c % 5) {
            return -1;
        }
        if (b * 5 >= c) {
            return c % 5;
        }
        if (a > c % 5) {
            return c - (b * 5);
        }
        return 0;
    }

    public static void zHight() {
        double h = 0.001;
        int count = 0;
        while (8848 >= h) {
            h = h * 2;
            count++;
        }
        System.out.println(count);


    }

    public static void getCou() {
        int count = 0;
        System.out.print("偶数分别是：");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "  ");
                count++;
            }

        }

        System.out.println("\n偶数个数有：" + count);
    }

    public static int getSum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static void method20() {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("1到100之间的总和是：" + sum);
    }

    public static void method19() {
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                count += i;
            }
        }
        System.out.println("1-100之间的偶数和是：" + count);

    }

    public static void method18() {
        int num = 7;
        if (num == 1) {
            System.out.println("星期一");
        } else if (num == 2) {
            System.out.println("星期二");
        } else if (num == 3) {
            System.out.println("星期三");
        } else if (num == 4) {
            System.out.println("星期四");
        } else if (num == 5) {
            System.out.println("星期五");
        } else if (num == 6) {
            System.out.println("星期六");
        } else if (num == 7) {
            System.out.println("星期日");
        }
    }

    public static void method17() {
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 9 || i / 10 == 9) {
                continue;
            }
            System.out.println("1到100除去含有9的整数分别是：" + i + "  ");
        }
    }

    public static void method16() {
        int num = 7;
        if (num >= 3 && num <= 5) {
            System.out.println("春季");
        } else if (num >= 6 && num <= 8) {
            System.out.println("夏季");
        } else if (num >= 9 && num <= 11) {
            System.out.println("秋季");
        } else if (num == 12 || (num >= 1 && num <= 2)) {
            System.out.println("冬季");
        } else {
            System.out.println("数据有误");
        }
    }

    public static void method15() {
        int x = 2, y = 3;

        switch (x) {
            default:
                y++;
            case 3:
                y++;
                break;
            case 4:
                y++;
        }
        System.out.println("y=" + y);
    }

    public static void method14() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void method13() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void method12() {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 7 - 2 * (i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void method11() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + (i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void method10() {
            /*
         第一行： i=1   0空格       6列星星
         第一行： i=2   1空格       5列星星
         第一行： i=3   2空格       4列星星
         第i行：        i-1个空格   7-i列星星
        */
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 7 - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void method09() {
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void method08() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("sum的结果是：" + sum);

    }

    public static void method07() {
        int i = 1;
        do {
            System.out.println("HelloWorld");
            i++;
        } while (i <= 100);


    }

    public static void method06() {
         /*初始化表达式
      while(布尔表达式）{
      循环体
      步进表达式
      */
        //能用for循环就一定能用while循环，能用while循环就一定能用for循环
        //while中的初始变量可以作用于while循环外面（因为初始变量本来就是在外面），而for不能只能在for循环内部使用
        int i = 1;
        while (i <= 100) {
            System.out.println(i + "  HelloWorld");
            i++;
        }

    }

    public static void method05() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + "   HelloWorld");
        }
    }

    public static void method04() {
        int score = 89;
        int num = score / 10;
        switch (num) {
            case 10:
//                System.out.println("优秀");
//                break;
//                实行代码一模一样时可以合理使用穿透。
            case 9:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("好");
                break;
            case 7:
                System.out.println("良好");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }

    }

    public static void method03() {
        int Weekday = 1;
        switch (Weekday) {// byte short int char String 和枚举 最后一个break可以省略。多个case的数值不能相同
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("无效日期");
        }

    }

    public static void method02() {
        int score = 98;
        if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("好");
        } else if (score >= 70 && score < 80) {
            System.out.println("良好");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }

    public static void method01() {
        System.out.println("HelloWorld");
        System.out.println('a');
        System.out.println("");
        System.out.println("==================");
        byte b = 100;
        System.out.println(b);
        short s = 200;
        System.out.println(s);
        int i = 300000;
        System.out.println(i);
        long l = 328709;
        System.out.println(l);
        float f = 3.5F;
        System.out.println(f);
        double d = 3.1;
        System.out.println(d);
        char ch = 'q';
        System.out.println(ch);
        System.out.println("================");
        byte b3 = (byte) 130;
        System.out.println(b3);
    }
}
