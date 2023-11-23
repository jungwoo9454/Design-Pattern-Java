package FlyWeight;

import java.util.HashMap;
import java.util.Map;

// FlyweightFactory
class TreeModelFactory {
    // Flyweight Pool - TreeModel 객체들을 Map으로 등록하여 캐싱
    private static final Map<String, TreeModel> cache = new HashMap<>(); // static final 이라 Thread-Safe 함

    // static factory method
    public static TreeModel getInstance(String key) {
        // 만약 캐시 되어 있다면
        if(cache.containsKey(key)) {
            return cache.get(key); // 그대로 가져와 반환
        } else {
            // 캐시 되어있지 않으면 나무 모델 객체를 새로 생성하고 반환
            TreeModel model = new TreeModel(
                    key,
                    new Object(),
                    new Object()
            );
            System.out.println("-- 나무 모델 객체 새로 생성 완료 --");

            // 캐시에 적재
            cache.put(key, model);

            return model;
        }
    }
}