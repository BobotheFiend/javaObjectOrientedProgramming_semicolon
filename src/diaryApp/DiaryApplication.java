package diaryApp;

import java.util.Scanner;

public class DiaryApplication {
    public static void main() {
        goToMainMenu();
    }
    private static Diaries yourDiary = new Diaries();
    private static void goToMainMenu(){

        print("""
           ----  W E L C O M E --- T 0 --- T H E --- D I A R Y ----
           
           
                1. Create Diary
                2. Find Diary
                3. Delete Diary
                0. Exit
           """);
        int userChoice = Integer.parseInt(input("Enter Choice: "));
        switch(userChoice){

            case 1 -> createDiary();
            case 2 -> findDiary();
            case 3 -> deleteDiary();
            case 0 -> exit();
            default -> invalidInput();
        }
    }

    private static void deleteDiary(){
        print("So Sad to let you let It Go!! :( ");

        String userName = input("Enter Your Username: ");
        String password = input("Enter Your Password: ");

        yourDiary.delete(userName, password);

        print("Diary Deleted Successfully!");
        goToMainMenu();
    }
    private static void createDiary(){
        print("JUST FOLLOW THESE STEPS AND YOU'LL CREATE YOUR OWN DIARY MY FRIEND :)\n\n");

        print("Create yourUserName Below!");
        String userName = input("Create your userName: ");

        print("Create Your Own Password Below!!");
        String password = input("Create your own password: ");

        yourDiary.add(userName, password);

        print("New Diary Created Successfully!!  Yayyyy!!");
        goToMainMenu();
    }

    private static void findDiary(){
        print("Lets Find your diary together my friend!!\n");

        print("Okay now, Give me Your UserName below my friend");
        String userNAme = input("Enter Username: ");

        print("Noiceee! Okay now lets find it>>>>.... ");

        Diary getYourDiary  = yourDiary.findByUsername(userNAme);
        print("Diary Has Been Found!!");

        print("Okay now, Give me your Password to access the Diary :) ");
        String password = input("Enter password: ");
        getYourDiary.unlockDiary(password);

        goToDiariesMainMenu(getYourDiary);
    }

    private static void goToDiariesMainMenu(Diary yourDiary){

        print("\t\t\tHeyy Friend!! Welcome!\n\tHow are you feeling.\nYou can Share it with me I promise I wont Tell :)");

        print("""
                1. Create an Entry
                2. Find an Entry
                3. Update an Entry
                4. Delete an Entry
                5. Lock Your Diary
                0. Exit to MainMenu
                """);

        int userChoice = Integer.parseInt(input("Enter your choice: "));

        switch(userChoice){
            case 1 -> createEntry(yourDiary);
            case 2 -> findEntry(yourDiary);
            case 3 -> updateEntry(yourDiary);
            case 4 -> deleteEntry(yourDiary);
            case 5 -> lockDiary(yourDiary);
            case 0 -> goToMainMenu();
            default -> invalidInput();
        }

    }

    private static void createEntry(Diary yourDiary){
        print("Welcome My Friend!\nWhat Would You Like To Write Today!");

        print("Enter a Title");
        String title = input("Enter Title: ");

        print("What do you want to talk about");
        String body = input("Enter Body: ");

        yourDiary.createEntry(title, body);
        print("Entry Created Successfully\nThat was Something Alright :) ");

        goToDiariesMainMenu(yourDiary);
    }

    private static void findEntry(Diary yourDiary){
        print("Lets Find Some Of Your Previous Entries!!");

        print("Give Me your the Entry ID and I will delete it for you");
        int entryID = Integer.parseInt(input("Enter ID: "));
        Entry yourEntry = yourDiary.findEntry(entryID);
        print(yourEntry.getTitle());
        print(yourEntry.getBody());

        goToDiariesMainMenu(yourDiary);
    }

    private static void updateEntry(Diary yourDiary){
        print("What entry would you like to update?");

        print("Give me your ID and i will fetch the entry");
        int userID = Integer.parseInt(input("Enter ID: "));

        print("Great Stuff\nNow Give input the New Title");
        String title = input("Enter Title: ");

        print("Noicee\nNow Write your New Body of Message");
        String body = input("Enter Body: ");

        print("Fantastic Stuff!, Your Entry Has Benn Updated Successfully!!");

        goToDiariesMainMenu(yourDiary);
    }
    private static void deleteEntry(Diary yourDiary){
        print("What Entry Would You Like To Delete!");

        print("Give Me your the Entry ID and I will delete it for you");
        int id = Integer.parseInt(input("Enter ID: "));
        yourDiary.deleteEntry(id);

        print("Entry has been deleted Successfully!!");
        goToDiariesMainMenu(yourDiary);

    }

    private static void lockDiary(Diary yourDiary){
        yourDiary.lockDiary();
        print("Diary is Locked!");

        goToMainMenu();
    }

    private static void exit(){
        print("GoodBye!!!");
    }

    private static void invalidInput() {
        print("Invalid Option!!!!");
    }

    private static void print(String message) {
        System.out.println(message);
    }

    private static String input(String message){
        print(message);
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        return inputCollector.nextLine();
    }
}
