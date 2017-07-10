import java.time.LocalDate;

public class MainClass {

    public static void main(String[] args)
    {

        //Invoice class
        Bag inv = new Bag();
        Bag inv2 = new Bag();
        Bag.Item item = inv.addItem("Rozga",20,10.5);
        Bag.Item item2 = inv.addItem("Pałka",10,100);
        Bag.Item item10 = inv2.addItem("Tarcza",1,300);

        Bag.Item item3 = inv.addItem("Topór",2,2);
        item.removeItem();

        System.out.println(item3.showItemInfo());
        System.out.println(item2.showItemInfo());
        System.out.println(inv.getList());
        System.out.println(item3.isBelongingTo(inv));
        System.out.println(item10.isBelongingTo(inv2));

        //Punkt class (class that doesn't change state of object)
        Punkt p = new Punkt(3,4).translate(1,3).scale(0.5);

        System.out.println(p.getX() + " " + p.getY());
        System.out.println(p.translate(4,4).scale(2));
        System.out.println(p.getX() + " " + p.getY());

        //Car class
        Car BMW = new Car(15.5);
        BMW.drive(20);
        BMW.addFuel(6);
        BMW.drive(31);
        BMW.drive(12.8);
        System.out.println(BMW.getTotalAmountOfKilometersTraveled() + " kilometers");
        System.out.println(BMW.getTotalFuel() + " liters");
        BMW.addFuel(10);
        BMW.drive(51.2);
        System.out.println(BMW.getTotalAmountOfKilometersTraveled() + " kilometers");
        System.out.println(BMW.getTotalFuel() + " liters");
    }

    private static void sundayCalendar(int nrMiesiaca,int rok)
    {
        int count = 0;
        LocalDate localDate = LocalDate.of(rok,nrMiesiaca,1);

        System.out.println("ND"+"\t"+"PN"+"\t"+"WT"+"\t"+"SR"+"\t"+"CZW"+"\t"+"PT"+"\t"+"SO");

        while (localDate.getMonthValue() == nrMiesiaca)
        {
            if (localDate.getDayOfMonth()==1) {
                switch (localDate.getDayOfWeek())
                {
                    case SUNDAY:
                        System.out.print(localDate.getDayOfMonth() + "\t");
                        count++;
                        break;
                    case MONDAY:
                        System.out.print("\t" +localDate.getDayOfMonth() + "\t");
                        count+=2;
                        break;
                    case TUESDAY:
                        System.out.print("\t"+"\t"+localDate.getDayOfMonth() + "\t");
                        count+=3;
                        break;
                    case WEDNESDAY:
                        System.out.print("\t"+"\t"+"\t"+localDate.getDayOfMonth() + "\t");
                        count+=4;
                        break;
                    case THURSDAY:
                        System.out.print("\t"+"\t"+"\t"+"\t"+localDate.getDayOfMonth() + "\t");
                        count+=5;
                        break;
                    case FRIDAY:
                        System.out.print("\t"+"\t"+"\t"+"\t"+"\t"+localDate.getDayOfMonth() + "\t");
                        count+=6;
                        break;
                    case SATURDAY:
                        System.out.print("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+localDate.getDayOfMonth() + "\t");
                        count+=7;
                        break;
                }
            }
            else
            {
                System.out.print(localDate.getDayOfMonth() + "\t");
                count++;
            }

            localDate = localDate.plusDays(1);

            if (count == 7 || localDate.getMonthValue() > nrMiesiaca)
            {
                System.out.println();
                count=0;
            }
        }
    }
}
