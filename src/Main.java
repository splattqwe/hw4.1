public class Main {
    public static void main(String[] args) {
        // задание 1
       for (int i=10; i>0; i--){
           System.out.print(i + " ");
       }
       int a =0;
        System.out.println();
       while (a<10) {
           a++;
           System.out.print(a+" ");
       }
        System.out.println();

// задание 3

int yearNow = 2022;
int start=yearNow-200;
int end = yearNow +100;
for( int year = start; year <= end; year ++){
if (year % 79 ==0)
            System.out.println(year);}
// задание 2
        int firstF =7;
        for (int allF =firstF; allF <=31; allF=allF+7){
            System.out.println("сегодня пятница " +allF);}}}