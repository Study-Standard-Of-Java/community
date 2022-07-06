package chapter14.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class StoreDto {
    public String storeName;
    public String location;

    public StoreDto(String storeName, String location) {
        this.storeName = storeName;
        this.location = location;
    }
}

public class CollectTest {
    public static void main(String[] args) {
        StoreDto storeDto = new StoreDto("store1", "어딘가");
        StoreDto storeDto2 = new StoreDto("store2", "저긴가");
        StoreDto storeDto3 = new StoreDto("store3", "요긴가");

        ArrayList<StoreDto> list = new ArrayList<>(Arrays.asList(storeDto, storeDto2, storeDto3));
        Map<String, String> map = list.stream()
                .collect(Collectors.toMap(s -> s.storeName, s -> s.location));

        String store1 = map.get("store1");
        System.out.println("store1 = " + store1);

    }
}
