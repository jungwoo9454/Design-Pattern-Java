package FlyWeight;

// UnsahredConcreteFlyweight
class Tree {
    // 죄표값과 나무 모델 참조 객체 크기를 합친 사이즈
    long objSize = 10; // 10MB

    // 위치 변수
    double position_x;
    double position_y;

    // 나무 모델
    TreeModel model;

    public Tree(TreeModel model, double position_x, double position_y) {
        this.model = model;
        this.position_x = position_x;
        this.position_y = position_y;

        // 나무 객체를 생성하였으니 메모리 사용 크기 증가
        Memory.size +=  this.objSize;
    }
}