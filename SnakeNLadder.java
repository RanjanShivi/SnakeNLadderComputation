public class SnakeNLadder {
    public static void main(String[] args) {
        int pos = 0;
        System.out.println("The player's starting position= " + pos);
        int die = (int) ((Math.random() * 10) % 6 ) + 1;
        System.out.println("the number in die = " + die);

        int option = (int) (Math.random() * 10 ) % 3 ;
        switch (option) {
            case 1:
                pos += die;
                System.out.println("Ladder : position= " + pos);
                break;
            case 2:
                pos -= die;
                System.out.println("Snake : position= " + pos);
                break;
            default:
                System.out.println("No Case : positiion= " + pos);
        }
    }
    }

