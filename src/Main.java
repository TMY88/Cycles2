public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задание 1");
        int totalAccumulation=0;
        int monthAccumulation=15000;
        int countMonth=0;
        while (totalAccumulation<2459000) {
            totalAccumulation=totalAccumulation+monthAccumulation;
            countMonth=countMonth+1;
            System.out.println("Месяц "+countMonth+", сумма накоплений равна "+totalAccumulation+" рублей");
        }
    }
    public static void task2() {
        System.out.println("Задание 2");
        int number=0;
        while (number<10) {
            number=number+1;
            System.out.print(number+" ");
        }
        System.out.println();
        for (;number>0;number=number-1) {
            System.out.print(number+" ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задание 3");
        int population=12_000_000;
        double fertility=17;
        double mortality=8;
        int year=0;
        while (year<10){
            year=year+1;
            population=(int)(population+fertility/1000*population-mortality/1000*population);
            System.out.println("Год "+year+", численность населения составляет "+population);
        }
    }
    public static void task4() {
        System.out.println("Задание 4");
        int total=15_000;
        int month=0;
        while (total<12_000_000) {
            month=month+1;
            total=total+total*7/100;
            System.out.println("Месяц "+month+", сумма накоплени "+total);
        }
    }
    public static void task5() {
        System.out.println("Задание 5");
        int total=15_000;
        int month=0;
        while (total<12_000_000) {
            month=month+1;
            total=total+total*7/100;
            if (month%6==0) {
                System.out.println("Месяц " + month + ", сумма накоплени " + total);
            }
        }
    }
    public static void task6() {
        System.out.println("Задание 6");
        int total=15_000;
        int month=0;
        while (month<9*12) {
            month=month+1;
            total=total+total*7/100;
            if (month%6==0) {
                System.out.println("Месяц " + month + ", сумма накоплени " + total);
            }
        }
    }
    public static void task7() {
        System.out.println("Задание 7");
        int dayOfMonth=1;
        int friday=6;
        while (dayOfMonth<31) {
            dayOfMonth=dayOfMonth+1;
            friday=friday+1;
            if (friday%7==0) {
                System.out.println("Сегодня пятница, "+dayOfMonth+"-е число. Необходимо подготовить отчет");
            }
        }
    }
    public static void task8() {
        System.out.println("Задание 8");
        int year=2023;
        int previousYears=year-200;
        int futureYears=year+100;
        while (previousYears<futureYears){
            previousYears=previousYears+1;
            if (previousYears%79==0) {
                System.out.println(previousYears);
            }
        }

    }
}