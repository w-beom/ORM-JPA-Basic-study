package hellojpa;

import javax.persistence.*;

@Entity(name = "Member") // JPA가 Entity를 구분하는 속성 기본값은 클래스 이름
//@Table(name = "MBR") // 데이터베이스에 MBR이라는 테이블과 매핑
@Table(uniqueConstraints = {@UniqueConstraint(name = "NAME_AGE_UNIQUE", columnNames = {"NAME", "AGE"})}) // 유니크 제약 조건 추가
public class Member {

    @Id
    private Long id;
    @Column(nullable = false, length = 10) // name값으 필수, 10자리 초과 X
    private String name;
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
