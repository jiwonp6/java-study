package ch24_generic.wildcard2;

public class HorseMain {
    public static void main(String[] args) {
        // 1. 모든 유닛을 태울 수 있는 말
        Horse<Unit> unitHorse = new Horse<>();
        unitHorse.setRider(new Unit());
        unitHorse.setRider(new Knight());
        unitHorse.setRider(new HolyKnight());
        // unitHorse.setRider(new String(" "));         X
        
        // 2. 기사 계급 이상만 탈 수 있는 말
        Horse<Knight> knightHorse = new Horse<>();
        // knightHorse.setRider(new Unit());            X
        knightHorse.setRider(new Knight());
        knightHorse.setRider(new HolyKnight());

        // 3. 성기사만 탈 수 있는 말
        Horse<HolyKnight> holyKnightHorse = new Horse<>();
        // holyKnightHorse.setRider(new Unit());        X
        // holyKnightHorse.setRider(new Knight());      X
        holyKnightHorse.setRider(new HolyKnight());

    // 제네릭 타입의 다형성을 활용하기 위해 와일드 카드를 활용

        // 4. 기사 계급 이상을 태우는 말을 받을 변수
        Horse<? extends Knight> middleHorse;
        // middleHorse = new Horse<Unit>();             X
        middleHorse = new Horse<Knight>();
        middleHorse = new Horse<HolyKnight>();

        // 5. Knight 의 조상 클래스만 받을 수 있는 변수
        Horse<? super Knight> donkey;
        donkey = new Horse<Unit>();
        donkey = new Horse<Knight>();
        // donkey = new Horse<HolyKnight>();            X
        donkey = unitHorse;
        donkey = knightHorse;
        // donkey = holyKnightHorse;                    X

        // 6. 제한이 없는 와일드 카드로 받는 변수
        Horse<?> everyHorse;
        everyHorse = unitHorse;
        everyHorse = knightHorse;
        everyHorse = holyKnightHorse;

    // HorseShop
        HorseShop horseShop = new HorseShop();

        // 1. 보급형 말 라인에는 고급 말 넣을 수 없다.
        horseShop.addEntry(unitHorse);
        horseShop.addEntry(knightHorse);
        // horseShop.addEntry(holyKnightHorse);         X

        // 2. 고급 라인에서는 일반 말을 넣을 수 없다.
        // horseShop.addPremium(unitHorse);             X
        horseShop.addPremium(knightHorse);
        horseShop.addPremium(holyKnightHorse);

        // 3. ? (와일드 카드)로 모두가 받을 수 있다.
        horseShop.addBestSeller(unitHorse);
        horseShop.addBestSeller(knightHorse);
        horseShop.addBestSeller(holyKnightHorse);

    }
}
