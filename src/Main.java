public class Main {
    public static void main(String[] args) {

        int number = 10;
        if (number%2 == 0){
            System.out.println("The number can be devided to 2");
        } else {
            System.out.println("The number can NOT be devided to 2");
        }

        int number2 = 7;
        switch (number2){
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            default:
                System.out.println("There is no such day at the week");

        }

    }

}