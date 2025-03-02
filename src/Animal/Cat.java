package Animal;

public class Cat extends Animal {
    public Cat() {
        super("貓");
        HP = 80;
        rate = 0.3;
    }

//    @Override
//    public int attack() {
//        if (random.nextDouble() < 0.3) {// 30% 機率觸發技能
//            System.out.println("玩家(" + name + ")使用了強力攻擊");
//            return useSkill();
//        } else {
//            System.out.println("玩家(" + name + ")使用了普通攻擊");
//            System.out.println("Boss受到了攻擊，生命值-15");
//            return 15;
//        }
//    }

    @Override
    public int useSkill1() {
        if (random.nextDouble() < rate) {// 40% 機率觸發技能
            System.out.println("玩家(" + name + ")使用了咬住! 暴擊! Boss HP -40");
            return 40;
        }else {
            System.out.println("玩家(" + name + ")使用了咬住! Boss HP -20");
            return 20;
        }

    }

    @Override
    public int useSkill2() {
        if (random.nextDouble() < rate) {// 40% 機率觸發技能
            System.out.println("玩家(" + name + ")使用了瘋狗亂撞! 暴擊! Boss HP -15");
            return 15;
        }else {
            System.out.println("玩家(" + name + ")使用了瘋狗亂撞! Boss HP -7");
            return 7;
        }
    }

    @Override
    public int useSkill3() {
        if (random.nextDouble() < rate) {// 40% 機率觸發技能
            System.out.println("玩家(" + name + ")使用了瘋狗亂撞! 暴擊! Boss HP -20");
            return 20;
        }else {
            System.out.println("玩家(" + name + ")使用了瘋狗亂撞! Boss HP -10");
            return 10;
        }
    }

    @Override
    public int useSkill4() {
        if (random.nextDouble() < rate) {// 40% 機率觸發技能
            System.out.println("玩家(" + name + ")使用了瘋狗亂撞! 暴擊! Boss HP -30");
            return 30;
        }else {
            System.out.println("玩家(" + name + ")使用了瘋狗亂撞! Boss HP -15");
            return 15;
        }
    }
}

