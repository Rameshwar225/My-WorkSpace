
import java.util.*;

import java.io.*;

 

 

class Switch

{

      public static String ReadString()

      {

           try

           {

                 InputStreamReader input = new InputStreamReader(System.in);

                 BufferedReader reader = new BufferedReader(input);

                 return reader.readLine();

           }

           catch (Exception e)

           {

 

                 e.printStackTrace();

                 return "";

           }

      }

 

 

      public static int ReadInteger()

      {

           try

           {

                 InputStreamReader input = new InputStreamReader(System.in);

                 BufferedReader reader = new BufferedReader(input);

                 return Integer.parseInt(reader.readLine());

           }

           catch (Exception e)

           {

 

                 e.printStackTrace();

                 return 0;

           }

      }

     

     

 

      public static void main(String[] args)

      {

         int a, b, opcode, result;

        

         System.out.println("Program for Addition, Subtraction, Multiplication and Division\n");

        

         while (true)

         {

            System.out.print("Enter Your Choice: 1 - Add, 2 - Sub, 3 - Mul, 4 - Div: ");

            opcode = ReadInteger();

 

            if (opcode < 1 || opcode > 4)

               return;

 

            System.out.print("Enter First Number:");

            a = ReadInteger();

            System.out.print("Enter Second Number:");

            b = ReadInteger();

 

            switch (opcode)

            {

               case 1:

                  result = a + b;

                  System.out.format("%d + %d = %d\n", a, b, result);

                  break;

 

               case 2:

                  result = a - b;

                  System.out.format("%d - %d = %d\n", a, b, result);

                  break;

 

               case 3:

                  result = a * b;

                  System.out.format("%d * %d = %d\n", a, b, result);

                  break;

 

               case 4:

                  result = a / b;

                  System.out.format("%d / %d = %d\n%d %% %d = %d", a, b, result, a, b, a % b);

                  break;

               default:

                  break;

            }

         }

      }

}