import java.util.Scanner;
public class online {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("               WEL COME TO OCEAN ONLINE SHOPPING AND SHIPPING INC");
        System.out.println("\nEnter the price of item/items one by one.");
        System.out.println("Enter 0 to get total price before tax");
        System.out.println("\nEnter price: ");
        float total = 0;
        while (true) {
            float price = scan.nextFloat();
            if (price == 0) {
                break;
            }
            total += price;
            double rounded = Math.round(total*100)/100.000;
        }
        System.out.println("Your total before tax is $"+total);
        if (total>=100) {
            System.out.println("\nYou qualify for free shipping");
            System.out.print("\nPlease select your state from the following.");
            System.out.println("\n1.NY\t2.NJ\t3.FL\t4.CT\t5.MD\t6.NC\t7.SC\t8.CA\t9.DC\t10.CO");
            System.out.println("\nEnter your state(only short form): ");
            String state = scan.next();
            double tax= 0.0;
            while (true) {

                if( state.equalsIgnoreCase("NY")) {
                    tax = 8.875;
                }else if(state.equalsIgnoreCase("NJ")) {
                    tax = 7.3;
                }else if(state.equalsIgnoreCase("FL")) {
                    tax = 6.0;

                }else if( state.equalsIgnoreCase("CT")) {
                    tax = 6.35;
                }else if(state.equalsIgnoreCase("MD")) {
                    tax = 6.00;
                }else if(state.equalsIgnoreCase("NC")) {
                    tax = 6.98;
                }else if( state.equalsIgnoreCase("SC")) {
                    tax = 7.46;
                }else if(state.equalsIgnoreCase("CA")) {
                    tax = 8.68;
                }else if(state.equalsIgnoreCase("DC")) {
                    tax =6.00 ;
                }else if (state.equalsIgnoreCase("CO")) {
                    tax =7.72;
                }else {
                    System.out.println("Sorry, Currently we are not shipping in this state.");
                    System.out.println("\nThankyou! You have successfully exited the portal.");
                    break;
                }
                double total_tax;
                total_tax = total *(tax/100);
                double rounded = Math.round(total_tax*100)/100.000;
                System.out.println("\nYour total tax is $"+total_tax);
                double total_with_tax = total+total_tax;

                System.out.println("\nYour final price with tax is $"+total_with_tax);
                System.out.println("Thankyou!");
                break;


            }}

        else {
            System.out.println("\nYou donot qualify for free shipping. "
                    + "\nTotal price is less than $100.00.");
            System.out.println("\nDo you want to proceed with shipping charge:");
            String proceed =scan.next();
            while (true) {
                if (proceed.equalsIgnoreCase("Y")) {
                    System.out.print("\nPlease select your state from the following.");
                    System.out.println("\n1.NY\t2.NJ\t3.FL\t4.CT\t5.MD\t6.NC\t7.SC\t8.CA\t9.DC\t10.CO");
                    System.out.println("\nEnter your state(only short form): ");
                    String state = scan.next();
                    double tax= 0.0;

                    if( state.equalsIgnoreCase("NY")) {
                        tax = 8.875;
                    }else if(state.equalsIgnoreCase("NJ")) {
                        tax = 7.3;
                    }else if(state.equalsIgnoreCase("FL")) {
                        tax = 6.0;

                    }else if( state.equalsIgnoreCase("CT")) {
                        tax = 6.35;
                    }else if(state.equalsIgnoreCase("MD")) {
                        tax = 6.00;
                    }else if(state.equalsIgnoreCase("NC")) {
                        tax = 6.98;
                    }else if( state.equalsIgnoreCase("SC")) {
                        tax = 7.46;
                    }else if(state.equalsIgnoreCase("CA")) {
                        tax = 8.68;
                    }else if(state.equalsIgnoreCase("DC")) {
                        tax =6.00 ;
                    }else if (state.equalsIgnoreCase("CO")) {
                        tax =7.72;
                    }else {
                        System.out.println("Sorry, Currently we are not shipping in this state.");
                        System.out.println("\nThankyou! You have successfully exited the portal.");
                        break;
                    }


                    double total_tax;
                    total_tax = total *(tax/100);
                    System.out.println("\nYour total tax is $"+total_tax);
                    double total_with_tax = total+total_tax;

                    System.out.println("\nYour total price with tax is $"+total_with_tax);
                    double final_total;
                    final_total = total_with_tax+10;


                    System.out.println("\n$10 shipping charge will be added to your total cost with tax.");
                    System.out.println("\nYour final price with tax and shipping charge is $"+final_total);
                    System.out.println("Thankyou!");
                    break;
                }else if(proceed.equalsIgnoreCase("N")) {
                    System.out.println("You choosed to not to proceed with shipping fee.");
                    System.out.println("\nThankyou! You have successfully exited the portal.");
                    break;

                }else {
                    System.out.println("Invalid entry!");
                    System.out.println("\nThankyou! You have successfully exited the portal.");

                    break;


                }




            }}}}

