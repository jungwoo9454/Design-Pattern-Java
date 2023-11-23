package FlyWeight;

// ConcreteFlyweight - 플라이웨이트 객체는 불변성을 가져야한다. 변경되면 모든 것에 영향을 주기 때문이다.
final class TreeModel {
    // 메시, 텍스쳐 총 사이즈
    long objSize = 90; // 90MB

    String type; // 나무 종류
    Object mesh; // 메쉬
    Object texture; // 나무 껍질 + 잎사귀 텍스쳐

    public TreeModel(String type, Object mesh, Object texture) {
        this.type = type;
        this.mesh = mesh;
        this.texture = texture;

        // 나무 객체를 생성하여 메모리에 적재했으니 메모리 사용 크기 증가
        Memory.size += this.objSize;
    }
}