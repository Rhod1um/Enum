public class LineBattle {
    EnumDemo enemyWeapons() {
        int choice = 0;
        if (choice == 0) {
            return EnumDemo.BOMB;
        } else if (choice == 1) {
            return EnumDemo.SHOOT;
        } else if (choice == 2) {
            return EnumDemo.TRAP;
        } else
            return null;
    }

    void go(){
        EnumDemo j; //laver EnumDemo instans
        j = enemyWeapons();
        System.out.println(j);
    }

    public static void main(String[] args) {
        new LineBattle().go();
    }

}
