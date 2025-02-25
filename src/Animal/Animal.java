package Animal;
import java.util.Random;

public abstract class Animal {
    protected String name;
    public int HP = 20;
    protected Random random = new Random();
    public int choice = 0;

    public Animal(String name) {
        this.name = name;
    }

    public abstract int attack();

    public abstract int useSkill();

    public void judge(Animal user, Boss boss) {
        System.out.println("玩家" + user.name + "出招: " + getMoveName(user.choice));
        System.out.println("Boss出招: " + getMoveName(boss.choice));

        if (user.choice == boss.choice) {
            System.out.println("無事發生");
        } else if ((user.choice == 1 && boss.choice == 3) ||
                (user.choice == 2 && boss.choice == 1) ||
                (user.choice == 3 && boss.choice == 2)) {
            boss.HP -= user.attack();
        } else {
            user.HP -= boss.attack();
        }

        System.out.println("玩家 HP: " + user.HP);
        System.out.println("Boss HP: " + boss.HP);
    }

    private String getMoveName(int choice) {
        switch (choice) {
            case 1: return "剪刀";
            case 2: return "石頭";
            case 3: return "布";
            default: return "未知";
        }
    }
}
