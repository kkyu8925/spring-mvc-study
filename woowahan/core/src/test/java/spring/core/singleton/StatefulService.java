// 싱글톤 방식의 주의점
// 싱글톤 객체는 상태를 유지(stateful)하게 설계하면 안된다.
// 무상태(stateless)로 설계해야 한다.
// 특정 클라이언트에 의존적인 필드가 있으면 안된다.
// 특정 클라이언트가 값을 변경할 수 있는 필드가 있으면 안된다.
// 가급적 읽기만 가능해야 한다.
// 필드 대신에 자바에서 공유되지 않는 지역변수, 파라미터, ThreadLocal 등을 사용해야 한다.
package spring.core.singleton;

public class StatefulService {
    // 1. 상태를 유지하는 설계
//    private int price; //  상태를 유지하는 필드
//
//    public void order(String name, int price) {
//        System.out.println("name = " + name + " price = " + price);
//        this.price = price; // 여기가 문제!
//    }
//
//    public int getPrice() {
//        return price;
//    }

    // 2. 무상태를 유지하는 설계
    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        return price;
    }
}
