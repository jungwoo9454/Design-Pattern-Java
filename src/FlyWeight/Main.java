package FlyWeight;
public class Main {
    public static void main(String[] args) {
        // 지형 생성
        Terrain terrain = new Terrain();

        // 지형에 Oak 나무 5 그루 생성
        for (int i = 0; i < 5; i++) {
            terrain.render(
                    "Oak", // type
                    Math.random() * Terrain.CANVAS_SIZE, // position_x
                    Math.random() * Terrain.CANVAS_SIZE // position_y
            );
        }

        // 지형에 Acacia 나무 5 그루 생성
        for (int i = 0; i < 5; i++) {
            terrain.render(
                    "Acacia", // type
                    Math.random() * Terrain.CANVAS_SIZE, // position_x
                    Math.random() * Terrain.CANVAS_SIZE // position_y
            );
        }

        // 지형에 Jungle 나무 5 그루 생성
        for (int i = 0; i < 5; i++) {
            terrain.render(
                    "Jungle", // type
                    Math.random() * Terrain.CANVAS_SIZE, // position_x
                    Math.random() * Terrain.CANVAS_SIZE // position_y
            );
        }

        // 총 메모리 사용률 출력
        Memory.print();
    }
}
