import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        // Задача 1: Сколько месяцев нужно, чтобы накопить 2495000, откладывая по 15000 в месяц
        int savings = 0;
        int deposit = 15000;
        int month = 0;
        while (savings < 2_495_000){
            savings = savings + savings/100;
            savings = savings + deposit ;
            month ++;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");

        // Задача 2: Выведите в одну строку числа от 1 до 10 с помощью цикла while. На следующей строке выведите числа в обратном порядке
   int i = 1;
   while (i <= 10) {
      System.out.printf("%d ", i);
      i++;
   }
        System.out.println();
   for (i=10;i>0; i--) {
       System.out.printf("%d ", i);
         }
   // Задача 3: Рассчитать численность населеения через 10 лет, зная рождаемость и смертность
   int population = 12_000_000;
   int year = 1;
   String msg = "\n Год %d, численность населения составляет %d";
   while (year <= 10) {
       population = population + (population / 1000 * 17) - (population/1000*8);
       System.out.printf (msg, year, population);
       year++;
   }
   // Задача 4: Вклад 15000 ежемесячно увеличивается на 7%. Сколько месяцев понадоюится, чтобы накопить 12000000?
        System.out.println();
        int total = 15000;
        int n = 1;
        while (total < 12000000){

        total = total + total/100*7;
        System.out.println("Месяц " + n + ", сумма накоплений равна " + total + " рублей");
        n++;
    }
        // Задача 5: Должны быть видны накопления за 6-й, 12-й, 18-й, 24-й и следующие месяцы.
        int total1 = 15000;
        int n1 = 1;
        while (total1 < 12000000) {

            total1 = total1 + total1 / 100 * 7;
            if (n1 % 6 == 0) {
                System.out.println("Месяц " + n1 + ", сумма накоплений равна " + total1 + " рублей");
                            }
            n1++;
        }
        //Задача 6: Вывдить результат накоплений каждые полгода в течении 9 лет.
        int total2 = 15000;
        int n2 = 1;
        int halfYear = 1;
        while (halfYear <= 18) {
            total2 = total2 + total2 / 100 * 7;
            if (n1 % 6 == 0) {
                if (n1%12 == 0) {
                    System.out.println("За " + halfYear/2 + "-й год, сумма накоплений равна " + total2 + " рублей");
                } else {
                    System.out.println("За " + halfYear/2 + "-йгод и полгода, сумма накоплений равна " + total2 + " рублей");
                }
                halfYear++;
            }
            n1++;
        }
    //Задача 7: Вывести все пятницы месяца (у меня следующего месяца - октября)

        int friday = 6;
        for (i=1; i<=31;i++){
            if (i == friday || (i-6) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е октября. Необходимо подготовить отчет.");
            }
        }
        //Задача 8:
        int startYears = 1823;
        int endYears = 2123;
        for (int years = 0; years <= endYears; years++) {
            if ( years >= startYears && years % 79 == 0) {
                System.out.println(years);
            }
        }

    }
}