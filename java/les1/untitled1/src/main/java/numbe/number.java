package numbe;

public class number {
    public static void namg (int year)
    {
        boolean name = false;

        if (year % 4 == 0) {
            name = true;
            if (year % 100 == 0) {

                if (year % 400 == 0)
                    name = true;
                else
                    name = false;
            }
        }
        else
            name = false;
        if (!name)
            System.out.println(year + " : Невисокосный год");
        else
            System.out.println(year + " : Високосный год");
    }

    public static void main(String[] args)
    {
        namg(2024);

        namg(2019);
    }
}

