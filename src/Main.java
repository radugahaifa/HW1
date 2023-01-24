public class Main {
    public static void main(String[] args) {
        //zadanie1
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Total weight of boxers is " + totalWeight);

        var overLoad = secondBoxer - firstBoxer;
        System.out.println(overLoad);
        var overload = (firstBoxer + secondBoxer) % overLoad;
        System.out.println(" overload is " + overLoad + " kg!");

        var hours = 640;
        var workHours = 8;
        var stuff = hours / workHours;
        System.out.println(" all employees " + stuff);

        var employee = 80;
        System.out.println(employee);
        employee = employee + 94;
        System.out.println(employee);

        var time = 640;
        var workers = 174;
        var workTime = time / workers;
        System.out.println(" new working time is " + workTime);

        byte a = 50;
        System.out.println(a);
        short b = -125;
        System.out.println(b);
        int c = 2000001;
        System.out.println(c);
        long d = 6523548651L;
        System.out.println(d);

        float k = 27.12F;
        System.out.println(k);
        double l = 987678965549D;
        System.out.println(l);
        float m = 2.786F;
        System.out.println(m);
        short n = 569;
        System.out.println(n);
        short o = -159;
        System.out.println(o);
        double p = 27897D;
        System.out.println(d);
        byte e = 67;
        System.out.println(e);

        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        int pupils = lp + as + ea;
        System.out.println(" all pupils " + pupils);
        short paperSheet = 460;
        int amount = (paperSheet / pupils);
        System.out.println(" Sheet of paper for every pupil is " + amount);

        byte outputMinute = 8;
        System.out.println(outputMinute);
        int twentyMinutes = outputMinute * 20;
        System.out.println("in 20 minutes the machine produces " + twentyMinutes + " butles ");
        short hour = 60 * 8;
        System.out.println(hour);
        int day = hour * 24;
        System.out.println("in 24 hours the machine produces " + day + " butles ");
        int threeDay = day * 3;
        System.out.println("in 3 days the machine produces " + threeDay + " butles ");
        int month = day * 30;
        System.out.println("in one month the machine produces " + month + " butles ");


        byte classroom = 2 + 4;
        System.out.println("numbers of cans of paint for one classroom " + classroom);
        short classNambers = 120 / 6;
        System.out.println("numbers of classes " + classNambers);
        short brownPaint = 20 * 4;
        System.out.println("brown paint cans " + brownPaint);
        short whitePaint = 120 - 80;
        System.out.println("wite paint cans " + whitePaint);

        short bananas = 5 * 80;
        System.out.println("bananas " + bananas + "gr");
        short milk = 105 * 2;
        System.out.println("milk " + milk + "gr");
        short plombir = 100 * 2;
        System.out.println("plombir " + plombir + "gr");
        short eggs = 4 * 70;
        System.out.println("eggs " + eggs + "gr");
        int gramsNumbers = bananas + milk + plombir + eggs;
        System.out.println("weight in grams " + gramsNumbers + "gr");
        float kgNumbers = gramsNumbers / 1000f;
        System.out.println("weight in kg " + kgNumbers + "kg");

        int needLoss = 7 * 1000;
        System.out.println("weight to be lost in grams " + needLoss + "gr");
        float firstWeightLoss = 250 / 1000f;
        System.out.println("weight loss with 250 gr per day " + firstWeightLoss + "kg");
        float secondWeightLoss = 500 / 1000f;
        System.out.println("weight loss with 500 gr per day " + secondWeightLoss + "kg");
        float firstWeightLossDay = 7 / firstWeightLoss;
        System.out.println("numbers of days of weight loss with 250 gr per day " + firstWeightLossDay + "days");
        float secondWeightLossDay = 7 / secondWeightLoss;
        System.out.println("numbers of days of weight loss with 500 gr per day " + secondWeightLossDay + "days");


        int mashaYearSalary = 67760 * 12;
        System.out.println("Masha's year salary " + mashaYearSalary);
        int denisYearSalary = 83690 * 12;
        System.out.println("Denis year salary " + denisYearSalary);
        int kristyYearSalary = 76230 * 12;
        System.out.println("Kristy year salary " + kristyYearSalary);

        double mashaSupplement = 67760 * 0.10;
        System.out.println("Masha's supplement " + mashaSupplement);
        double mashaNewSalary = 67760 + mashaSupplement;
        System.out.println("new Masha's month salary " + mashaNewSalary);
        double newMashaYearSalary = mashaNewSalary * 12;
        double mashaDifference = newMashaYearSalary - mashaYearSalary;
        System.out.println("Difference between Masha's year salaries " + mashaDifference);

        double denisSupplement = 83690 * 0.10;
        System.out.println("Denis supplement " + denisSupplement);
        double denisNewSalary = 83690 + denisSupplement;
        System.out.println("New Denis month salary " + denisNewSalary);
        double newDenisYearSalary = denisNewSalary * 12;
        double denisDifference = newDenisYearSalary - denisYearSalary;
        System.out.println("Difference between denis year salaries " + denisDifference);

        double kristySupplement = 76230 * 0.10;
        System.out.println("Kristy supplement " + kristySupplement);
        double kristyNewSalary = 76230 + kristySupplement;
        System.out.println("New Kristy month salary " + kristyNewSalary);
        double newKristyYearSalary = kristyNewSalary * 12;
        double kristyDifference = newKristyYearSalary - kristyYearSalary;
        System.out.println("Difference between Kristy year salaries " + kristyDifference);


    }
}