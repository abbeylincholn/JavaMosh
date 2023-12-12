public class SwitchStatement {
    public static void main (String[] args) {
//        String role = "role";
//        if (role == "admin")
//            System.out.println("You're an admin");
//        else if (role == "moderator")
//            System.out.println("You're a moderator");
//        else
//            System.out.println("You're a guest");
        // using switch statement for above statement

//        switch (role) {
//            case "admin":
//                System.out.println("You're an admin");
//                break;
//            case "moderator":
//                System.out.println("You're an moderator");
//                break;
//            default:
//                System.out.println("You're a guest");
//     if statement is an integer
            int role = 1;
            switch (role) {
            case 1:
            System.out.println("You're an admin");
            break;
            case 2:
            System.out.println("You're an moderator");
            break;
            default:
            System.out.println("You're a guest");
        }
    }
}
