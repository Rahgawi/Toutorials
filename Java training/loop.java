public class loop {


    public static void main(String[] args) {

        int rows = 7;
        int column = 7;

        for (int count = 1; count <=rows ; count++)
        {
           for(int space =7; space >=rows;space--)
            {
                System.out.println();
            }
            for (int counted =1; counted <= count; counted++)
            {
                System.out.print(counted);



            }

            System.out.println();

        }



    }
}
