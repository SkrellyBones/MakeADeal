import java.util.Scanner;

public class makeadeal {
    public static void main(String[] args) {
        System.out.println("WELCOME TO 'LETS MAKE A DEAL'");
        System.out.println("Please Enter 'A' to Play or 'Q' To Quit");
        Scanner input = new Scanner(System.in);
        String choice = input.next();

        boolean done = false;
        int prizeIs = (int) ((Math.random() * 3) + 1);
        int finChoice = 0;
        int booby = 0;

        while (!done) {

            if (choice.equals("A")) {
                System.out.println("Please Choose a door:\n");
                System.out.println("[1] [2] [3]\n");
                System.out.println("Type '1', '2', or '3'");

                if (input.hasNextInt()) {
                    int chosenDoor = input.nextInt();
                    if (chosenDoor <= 3 && chosenDoor > 0 && chosenDoor != 0) {

                        if (prizeIs == chosenDoor) {
                            boolean chooseFirstBooby = Math.random() < 0.5; // 50% chance
                            switch (prizeIs) {
                                case 1:
                                    if (chooseFirstBooby) {
                                        booby = 2;
                                    } else {
                                        booby = 3;
                                    }
                                    break;
                                case 2:
                                    if (chooseFirstBooby) {
                                        booby = 1;
                                    } else {
                                        booby = 3;
                                    }
                                    break;
                                case 3:
                                    if (chooseFirstBooby) {
                                        booby = 1;
                                    } else {
                                        booby = 2;
                                    }
                                    break;
                            }
                        }

                        else if (prizeIs == 1) {

                            if (chosenDoor == 2) {
                                booby = 3;
                            } else if (chosenDoor == 3) {
                                booby = 2;
                            }
                        } else if (prizeIs == 2) {
                            if (chosenDoor == 1) {
                                booby = 3;
                            }

                            else if (chosenDoor == 3) {
                                booby = 1;
                            }
                        } else if (prizeIs == 3) {
                            if (chosenDoor == 1) {
                                booby = 2;
                            } else if (chosenDoor == 2) {
                                booby = 1;
                            }

                        } else {
                            System.out.println("Please choose a door between 1 and 3");
                        }
                    }
                    System.out.println("\nI Will Now Reveal A Booby prize\n\nDoor [" + booby + "]");
                    System.out.println("\nWould You Like To Change Doors? ('Y' or 'N') ");

                    String decision = input.next();

                    if (decision.equals("Y")) {
                        if (booby == 2 && chosenDoor != prizeIs) {
                            chosenDoor = 3;
                        } else if (booby == 1 && chosenDoor != prizeIs) {
                            chosenDoor = 2;

                        } else if (booby == 3 && chosenDoor != prizeIs) {
                            chosenDoor = 1;
                        }

                        System.out.println("Your new door is: " + chosenDoor);

                        finChoice = chosenDoor;
                        System.out.println("Your final choice is: " + finChoice);
                        System.out.println("\nWell Then\n\nThe Moment You've Been Waiting For\n");
                        System.out.println("The Prize is in\n\nDoor [" + prizeIs + "]");
                        if (prizeIs == finChoice || prizeIs == chosenDoor) {
                            System.out.println("\nCONGRATUALTIONS!!!\nYOU WON!!!!!");

                        } else {
                            System.out.println("\n..Sorry, You Lost.");

                        }

                        System.out.println("\nWould You Like To Play Again? ('Y' or 'N')");
                        decision = input.next();

                        if (decision.equals("N")) {
                            System.out.println("\nWell Thanks For Playing");

                            done = true;
                            input.close();
                        } else if (decision.equals("Y")) {

                            System.out.println("*******************************");

                        } else {
                            System.out.println("Invalid Entry, Please Try Again ('Y' or 'N')");

                        }

                    } else if (decision.equals("N")) {
                        finChoice = chosenDoor;
                        System.out.println("\nWell Then\n\nThe Moment You've Been Waiting For\n");
                        System.out.println("The Prize is in\n\nDoor [" + prizeIs + "]");
                        if (prizeIs == finChoice || prizeIs == chosenDoor) {
                            System.out.println("\nCONGRATUALTIONS!!!\nYOU WON!!!!!");

                        } else {
                            System.out.println("\n..Sorry, You Lost.");

                        }
                    }
                    System.out.println("\nWould You Like To Play Again? ('Y' or 'N')");
                    decision = input.next();

                    if (decision.equals("N")) {
                        System.out.println("\nWell Thanks For Playing!");

                        done = true;
                        input.close();
                    } else if (decision.equals("Y")) {

                        System.out.println("*******************************");

                    } else {
                        System.out.println("Invalid Entry, Please Try Again ('Y' or 'N')");

                    }
                }

                else {
                    System.out.println("Invalid Entry, Please Try Again ('Y' or 'N')");

                }

            } else {
                System.out.println("Invalid Entry, Please Try Again.");
            }

        }

        if (choice.equals("Q"))

        {
            done = true;
            input.close();
        } else {
            System.out.println("Invalid Entry, Please Try Again..");
            choice = input.next();
        }

    }
}
