public class Main {
    public static void main(String[] args)
    {
        //Задание 1
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
        //Задание 2
        for(int i=10;i>=1;i--)
        {
            System.out.println(i);
        }
        //Задание 3
        for(int i=0;i<=17;i=i+2)
        {
            System.out.println(i);
        }
        //Задание 4
        for(int i=10;i>=-10;i--)
        {
            System.out.println(i);
        }
        //Задание 5
        for(int i=1904;i<=2096;i=i+4)
        {
            System.out.println(i);
        }
        //Задание 6
        for(int i=7;i<=98;i=i+7)
        {
            System.out.println(i);
        }
        //Задание 7
        int s=1;
        for(int i=1;i<=9;i++)
        {
            s=s*2;
            System.out.println(s);
        }
        //Задание 8
        short delta=29000;
        int sum=0;
        for(int i=1; i<=12;i++){
            sum=sum+delta;
            System.out.println("Месяц "+i+", сумма накоплений равна "+ sum+" рублей");
        }
        //Задание 9
        sum=0;
        for(int i=1; i<=12;i++){
            sum=sum/100+sum+delta;
            System.out.println("Месяц "+i+", сумма накоплений равна "+ sum+" рублей");
        }
        // Задание 10
        for(int i=1;i<=10;i++){
            System.out.println("2 * "+ i+" = "+2*i);
        }


    }
}