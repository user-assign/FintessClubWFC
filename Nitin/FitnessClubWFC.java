//bringing in a few significant libraries scanner and so on with the goal that we can utilize some particular capability of getting input and so forth.
//utilizing esterik to import all
import java.util.*;

//beginning the manin class named FitnessClubWFC. this is the beginning public class and the document must be saves with this name FitnessClubWFC.java
//or on the other hand it will toss a blunder.
public class FitnessClubWFC {
    //making an array named days which will contain name of days inside it.
    static String[] days = {"Saturday", "Sunday"};
    //making an array named classes which will store the nae of the classes and these will be of string types.
    static String[] classes = {"Spin", "Yoga", "Bodysculpt", "Zumba", "Aquacise", "Box Fit"};
    //it shows that 2 days, 2 classes per day, and 5 customers in each day
    static int[][] bookings = new int[2][12];
    //six lesson tyes, 2 ratings (sum and count)
    static int[][] ratings = new int[6][2]; 
    //6 lesson types
    static double[] incomes = new double[6]; 
    //making an object of the scanner which will be used in taking the inputs of the user.
    static Scanner input = new Scanner(System.in);

    //beginning the main function, this is the beginning stage for all the code which must be executed later on execution.
    public static void main(String[] args) {
        //printing the greetings message about the system
        System.out.println("                        *******This is Weekend Fitness Club, Welcome to our friendly community******");

        System.out.println("                        ____________________________________________________________________________");
        System.out.println("                                                          WELCOME TO SYSTEM");
        System.out.println("                        ____________________________________________________________________________");
        System.out.println("                        ****************************************************************************");
        System.out.println("                        *********************  _______  *  _____  *****                           **");
        System.out.println("                        ********************* |  _____| * |  ___| *****       **           **     **");
        System.out.println("                        ********************* | |___    * | |     *****      ***___________***    **");
        System.out.println("                        ********************* |  ___|   * | |     *****     ****-----------****   **");
        System.out.println("                        ********************* | |       * | |___  *****      *** Gym with  ***    **");
        System.out.println("                        ********************* |_|       * |_____| *****       **    Fun    **     **");
        System.out.println("                        *********************           *         *****                           **");
        System.out.println("                        ************************  FITNESS CLUB  ************************************");
        System.out.println("                        ****************************************************************************");
        System.out.println("             *    *     *   Above here FC means Fitness Club Not Fight Club So please be kind :)    *    *    *");
        System.out.println("                        ____________________________________________________________________________\n");
        //starting a loop which will run unless the client/customer chooses the exit option which will make it false
        while (true) {
            //below are the options which will be shown to the customer/client. these are the options and choices given to the customer 
            //so that the customer can make choices inside the system and will perform functions
            System.out.println("                        Kindly choose one option from the below options:-");
            System.out.println("                        1. I want to know the time table");
            System.out.println("                        2. I want to make a booking");
            System.out.println("                        3. I want to cancel a booking");
            System.out.println("                        4. I want to write a review for a lesson");
            System.out.println("                        5. I ant to Generate reports for the average ratings, highest income class and number of customers per lesson");
            System.out.println("                        6. I want to exit the system");
            
            //the below line of code is for taking the input in the integer format so that the system can show the exact function of the choice to the customer
            int choice = input.nextInt();
            //starting a switch case on the choice integr and calling the functions which are related to the specific choice
            switch (choice) {
                //case 1 is for viewing the timetable
                case 1:
                    watchtheTimetble();
                    break;
                //case 2 is for making the bookings
                case 2:
                    makeBooking();
                    break;
                //case 3 is for cancelling the booking which is made
                case 3:
                    cancelBooking();
                    break;
                //case 4 is for writing the review
                case 4:
                    writeReview();
                    break;
                //case 5 is to generate the reports for the client which shows the average ratings, customers, and the lesson which made the highest income
                case 5:
                    generateReport();
                    break;
                //case 6 is for exiting the system and stop the execution    
                case 6:
                    System.exit(0);
                //and the last is default which is to show the invalid option on the screen when the customer enters an option
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    //this function below is the function of watchtheTimetble which can display the timetable to the customer.
    //it can display the timetable by two ways. first by the daywise and second by the lessonwise
    public static void watchtheTimetble() {
        //asking the user to know how the customer wants to see the timetable
        System.out.println("                        There are two ways by which you can watch the timetable. How would you like to view the timetable?");
        //first choiice is by day i.e. saturday and sunday
        System.out.println("                        1. I want to view timetable daywise");
        //second choie is by lesson .i.e the lesson names like Yoga, Zumba etc.
        System.out.println("                        2. I want to view the timetable lessonwise");
        //taking the choice of the user as input so that the chosen time table can be shown
        int choice = input.nextInt();
        //starting a switch loop which will iterate over choice variable
        switch (choice) {
            //case 1 is when the customer chooses to view the timetable with th edaywise section
            case 1:
                //the below line of code asks the user to choose the day in the string format
                System.out.println("                        So you want to watch the timetable daywise? Type the name of the day in camlec case (for ex - Sunday)");
                //the below lin eof code takes the input of the user about the day he/chose and takes it in the string format
                String day = input.next();
                int index = Arrays.asList(days).indexOf(day);
                if (index < 0) {
                    // if the index is less than zero then the code will display an error message of iputting the wrong day.
                    System.out.println("                        I think you entered the wrong day! can you please try again with the right name");
                    return;
                }
                //displaying the time table to the customer
                System.out.println("                        Showing the timetable for " + day + ":");
                // beginning a for loop which will repeat twice, from 0 to under 2
                //it will print the name of the classes accessible that day and the numberof bookings made from 5 openings.
                for (int i = 0; i < 2; i++) {
                    System.out.println("                        Classes " + (i + 1) + ": " + classes[i + index * 2] +  " (" + bookings[index][i * 2] + "/" + 5 + " booked, " + bookings[index][i * 2 + 1] + "/" + 5 + " booked)");
                }
                break;
            //this case 2 will be executed when the user will selct the second option that is to view the timetable according the lesson type.
            case 2:

                System.out.println("                        So you want to watch the timetble lessonwise? Well, Enter the name of the lesso you want to get the timetable for!");
                // taking  the input from the user for the name of the lesson.
                String lesson = input.next();
                int i = Arrays.asList(classes).indexOf(lesson);
                if (i < 0) {
                    //if the i integer gets a value less than 0 then it will show the invalid lesson message onscreen
                    System.out.println("                        I think you enetered the wrong ame for the lesson :( can you please try again");
                    return;
                }
                //printing the time tablefor the user according to the lesson type
                System.out.println("                        Showing Timetable for " + lesson + ":");
                for (int j = 0; j < 2; j++) {
                    System.out.println("                        Class " + (j + 1) + " on " + days[j] + ": " + bookings[j][i * 2] + "/" + 5 + " booked, " + bookings[j][i * 2 + 1] + "/" + 5 + " booked");
                }
                break;
            default:
                //below lie will show forthe invalid input
                System.out.println("                        I think you made a wrong choice! i mean your input was not correct");
        }
    }
    //below is a function of makebooking which will be used to make the booking into the system by the customer.
    public static void makeBooking() {
        System.out.println("                        To make Booking, you will have to enter your name :- ");
        String name = input.next();
        
        System.out.println("                        Now can you please enter the name of the lesson for which you want to make the booking :-");
        String lesson = input.next();
        int i = Arrays.asList(classes).indexOf(lesson);
        if (i < 0) {
        System.out.println("                        I think you entered the wrong input");
        return;
        }
        System.out.println("                        Can you please enter the name of the day (Saturday or Sunday):");
        String day = input.next();
        int j = Arrays.asList(days).indexOf(day);
        if (j < 0) {
        System.out.println("                        I think you entered the name of the day incorrectly");
        return;
        }
        if (bookings[j][i * 2] == 5 && bookings[j][i * 2 + 1] == 5) {
        System.out.println("                        Oh no! Sorry! This lesson is booked fully. We would like you to make early bookings next time as the system is very busy");
        return;
        }
        if (bookings[j][i * 2] < 5) {
        bookings[j][i * 2]++;
        } else {
        bookings[j][i * 2 + 1]++;
        }
        System.out.println("                        Congrats!!! Your booking completed successfully and now you can attend the weekend fitness classes with us");
        }
        public static void cancelBooking() {
            System.out.println("                        Can you please enter your name?");
            String name = input.next();
            for (int j = 0; j < 2; j++) {
                for (int i = 0; i < 6; i++) {
                    if (bookings[j][i * 2] > 0 && name.equals(bookings[j][i * 2 + 1])) {
                        bookings[j][i * 2]--;
                        System.out.println("                        Your booking got cancelled!");
                        return;
                    }
                    if (bookings[j][i * 2 + 1] > 0 && name.equals(bookings[j][i * 2 + 1])) {
                        bookings[j][i * 2 + 1]--;
                        System.out.println("                        Your booking got cancelled");
                        return;
                    }
                }
            }
            System.out.println("                        Can not find the booking with this name! sorry!");
        }
        
        
        public static void writeReview() {
            System.out.println("                        Thanks for choosing this option! Please enter your name before writing the review. name here:-");
            String name = input.next();
            System.out.println("                        Please enter the name of the class for which you want to write the review");
            String lesson = input.next();
            int i = Arrays.asList(classes).indexOf(lesson);
            if (i < 0) {
                System.out.println("                        I think you entered wrong input for the lesson");
                return;
            }
            System.out.println("                        Please rate our lesson on a scale of 1 to 5 where 1 means very disappointed and 5 means awesome experience");
            int rating = input.nextInt();
            ratings[i][0] += rating;
            ratings[i][1]++;
            System.out.println("                        We are grateful because not all people write reviews after classes so thank you again!");
        }
        
        public static void generateReport() {
            System.out.println("                        ******GENERATING THE REPORTS******");
            System.out.println("                        1st report for the average rating of each class and number of customers for each class");
            for (int j = 0; j < 2; j++) {
                for (int i = 0; i < 6; i++) {
                    int count = bookings[j][i * 2] + bookings[j][i * 2 + 1];
                    System.out.println(days[j] + " " + classes[i] + ": " + count);
                    double rating = (double) ratings[i][0] / ratings[i][1];
                    System.out.println("                        The average rating for the " + classes[i] + " class is" + rating);
                }
            }
            System.out.println("                        Showing the incomes of all the classes and showing result for the highest income generating class:-");
            double maxIncome = 0;
            int maxIndex = -1;
            for (int i = 0; i < 6; i++) {
            incomes[i] = bookings[0][i * 2] * 10 + bookings[0][i * 2 + 1] * 10;
            incomes[i] += bookings[1][i * 2] * 10 + bookings[1][i * 2 + 1] * 10;
            if (incomes[i] > maxIncome) {
            maxIncome = incomes[i];
            maxIndex = i;
            }
            System.out.println("                        " + classes[i] + ": " + incomes[i]);
            }
            System.out.println("                        AND the class which generated the highest income til now is :- " + classes[maxIndex]);
            }
            
        }            