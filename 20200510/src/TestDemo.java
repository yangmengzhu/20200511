/*
 * @program: 20200510
 * @description
 * @author: mrs.yang
 * @create: 2020 -05 -10 11 :11
 */

import java.util.*;

public class TestDemo {
    public static void main(String[] args) {
        //StringBuffer stringBuffer =new StringBuffer();
        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append("abc") ;
        stringBuilder.append("def").append(1234);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());
    }
    public static void main10(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int i=1;
        if(a>b){//将较大值存放在b中
            int tmp=a;
            a=b;
            b=tmp;
        }
        int n=b;
        if(b%a==0){
            System.out.println(b);
        }else{
            while(n%a!=0){
                n=b*i;
                i++;
            }
            System.out.println(n);
        }
    }
    /*public static void main(String[] args) {
        //最小公倍数
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int i=1;
        while((a*i)%b!=0){
            i++;
        }
        System.out.println(a*i);
    }*/
        /*public static String reverse(String str,int begin,int end) {
            char[] ch = str.toCharArray();
            while (begin < end) {
                char tmp = ch[begin];
                ch[begin] = ch[end];
                ch[end] = tmp;
                begin++;
                end--;
            }
            return new String(ch);
        }
        public static String func(String str,int k){
            if(str==null|| k<0 || k>=str.length()){
                return null;
            }
            String str1=reverse(str,0,k-1);
            String str2=reverse(str1,k+1,str.length()-1);
            String str3=reverse(str2,0,str.length()-1);
            return str3;
        }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k=scan.nextInt();
        String str=scan.next();
        String ret=func(str,k);
        System.out.println(ret);
    }*/
        /*public static void main(String[] args) {
            String str = "abcdefg";
            String ret = reverse(str,0,str.length()-1);
            System.out.println(ret);
        }*/
    /*public static int func(int m,int n){
        if(m<n){
            int tmp=m;
            m=n;
            n=tmp;
        }
        while(m%n<0){
            m=n;
            n=m%n;
        }
        return n;
    }
    public static int get_lcm(int m,int n){

        int d=0;

        d = m*n/func(m, n);

        return d;

    }

    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         int m=scan.nextInt();
        int n=scan.nextInt();
        int ret=func(m,n);
        System.out.println(ret);
        System.out.println(ret);

    }*/

    /* public static int fib(int n){
         int count=0;
         count++;
         if(n==0){
             return 1;
         }else if(n==1){
             return 2;
         }else{
            return fib(n-1)+fib(n-2);
         }
     }
     public static void main(String[] args) {
        int count=0;
         fib(8);
         System.out.println(count);
     }*/
        /*public int[] multiply(int[] A) {
            int B[]=new int[A.length];
            for(int j=0;j<B.length;j++){
                B[j]=1;
                for(int i=0;i<A.length;i++){
                    if(i!=j){
                        B[j]=B[j]*A[i];
                    }
                }
            }
            return B;
        }
    }*/
    /*public static int minNumberInRotateArray(int [] array) {
       int len=array.length;
       int min=array[0];
       if(len==0){
           return 0;
       }
        for (int i = 0; i < len; i++) {
            if(min>array[i]){
                min=array[i];
            }
        }
        return  min;
    }*/
    /*public static int minNumberInRotateArray(int [] array){
        int i=0;
        int j=array.length-1;
        while(i<j){
            if(array[i]<array[j]){
                return array[i];
            }
            int mid=(i+j)/2;
            if(array[mid]>array[i]){
                i=mid+1;
            }else if(array[mid]<array[j]){
                j=mid;
            }else{
                i++;
            }
        }
        return array[i];
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] array=new int[5];
        for (int i = 0; i < 5; i++) {
            array[i]=scan.nextInt();
        }
        int ret=minNumberInRotateArray(array);
        System.out.println(ret);
    }*/
    /*public static void main(String[] args) {
        //abcdefg==>defgabc将前K个字符放到后面
        Scanner scan=new Scanner(System.in);
        int k=scan.nextInt();
        String str=scan.next();
        String ret=func(str,k);
        System.out.println(ret);
    }
    public static String func(String str,int k){
        if(str==null|| k<0|| k>=str.length()){
            return null;
        }
        String str1=reverse(str,0,k-1);
        String str2=reverse(str1,k,str.length()-1);
        String str3=reverse(str2,0,str.length()-1);
        return str3;
    }
    public static String reverse(String str,int start,int end){
        char[] ch=str.toCharArray();
        while(start<end){
            char tmp=ch[start];
            ch[start]=ch[end];
            ch[end]=tmp;
            start++;
            end--;
        }
        return new String(ch);
    }*/
    /*public static void main(String[] args) {
        //字符串逆置
        String str="abcdefg";
        String ret=reverse(str,0,str.length()-1);
        System.out.println(ret);
    }*/
    /*public static String func(String str){
        String[] strings=str.split(" ");//以空格分割
        String ret="";
        for (String s:strings) {
            ret+=s;//拼接
        }
       return ret;
    }*/
    /*public static void main8(String[] args) {
        //连接两个字符串  abc def  ==>abcdef
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){//循环输入
            String str=scan.nextLine();//只能输入一行
            //不可以用next    遇到空格会结束
            String ret=func(str);
            System.out.println(ret);
        }
        String str=scan.nextLine();//只能输入一行
        //不可以用next    遇到空格会结束
        String ret=func(str);
        System.out.println(ret);
    }*/
    public static void main7(String[] args) {
        //分割多次
        String str="name=zhangsan&age=18";
        String[] ret=str.split("&");
        //name=zhangsan  age=18
        for (String s1:ret) {
            String[] string1=s1.split("=");
            //name zhangsan age 18
            for (String rs2:string1) {
                System.out.println(rs2);
            }
        }
    }
    public static void main6(String[] args) {
        String str="java30-split#bit";
        String[] strings=str.split(" |-|#");
        for (String s:strings) {
            System.out.println(s);
        }
    }
    public static void main5(String[] args) {
        String str="192\\168\\1\\1";
        String[] strings= str.split("\\\\");//分割
        for (String s:strings) {
            System.out.println(s);
        }
    }
    public static void main4(String[] args) {
        String str="abc de f";
       String[] strings= str.split(" ",2);//字符串拆分
        for (String s:strings) {
            System.out.println(s);
        }
    }
    public static void main3(String[] args) {
        String str="ababcabcdabcde";
        System.out.println(str.contains("abc"));
        int ret=str.indexOf("abc",2);
        System.out.println(ret);
        int ret1=str.lastIndexOf("abc",3);
        System.out.println(ret1);
        System.out.println(str.startsWith("abc"));
        System.out.println(str.endsWith("e"));
    }
    public static void main2(String[] args) {
        System.out.println(100%3.0);
        Map<String,String> map=new HashMap();
        map.put("国民女神","高圆圆");
        map.put("国民老公","王思聪");
        System.out.println(map.get("国民老公"));
        System.out.println(map.containsKey("国民女神"));
        System.out.println(map.containsValue("高圆圆"));
        System.out.println(map.get("国民老公"));
        System.out.println(map);
        System.out.println(map.getOrDefault("比特", "haha"));
        //Set<Map,entry<k,v>>.entrySet()>;
    }
    public static void main1(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("hello");
        collection.add("bit");
        collection.remove("bit");
        System.out.println(collection);
        boolean ret=collection.isEmpty();
        System.out.println(ret);

       // collection.clear();

    }
}
