
## 1. Entity


### annotations

* @Entity : 클래스 위에 선언하여 이 클래스가 엔티티임을 알려준다. 이렇게 되면 JPA에서 정의된 필드들을 바탕으로 데이터베이스에 테이블을 만들어준다.
* @Builder : 해당 클래스에 해당하는 엔티티 객체를 만들 때 빌더 패턴을 이용해서 만들 수 있도록 지정해주는 어노테이션이다. 이렇게 선언해놓으면 나중에 다른 곳에서 Board.builder(). {여러가지 필드의 초기값 선언 }. build() 형태로 객체를 만들 수 있다.
* @AllArgsConstructor : 선언된 모든 필드를 파라미터로 갖는 생성자를 자동으로 만들어준다.
* @NoArgsConstructor : 파라미터가 아예없는 기본생성자를 자동으로 만들어준다.
* @Getter : 각 필드값을 조회할 수 있는 getter를 자동으로 생성해준다. 예를들어 다른 파일에서 Board 객체의 title값을 얻고 싶다면 getTitle() 메서드를 정의해서 해당 객체의 title값을 얻어오게 되는데, 해당 메서드를 굳이 작성하지 않아도 자동으로 생성해주는 것이다.
* @ToString : 해당 클래스에 선언된 필드들을 모두 출력할 수 있는 toString 메서드를 자동으로 생성할 수 있도록 해준다.
* @Id, @GeneratedValue : 해당 엔티티의 주요 키(Primary Key, PK)가 될 값을 지정해주는 것이 @Id 이다. @GeneratedValue는 이 PK가 자동으로 1씩 증가하는 형태로 생성될지 등을 결정해주는 어노테이션이다.
* @ManyToOne : 해당 엔티티와 다른 엔티티를 관계짓고 싶을 때 쓰는 어노테이션이다. ManyToOne이라고 부르는 이유는 Writer 입장에서 Board는 여러 개가 될 수 있기 때문에 Writer : Board = 1 : N 관계가 되기 때문이다.

### 

## 2. Repository

-Entity에 의해 생성된 DB에 접근하는 메서드(ex) findAll()) 들을 사용하기 위한 인터페이스이다. 위에서 엔티티를 선언함으로써 데이터베이스 구조를 만들었다면, 여기에 어떤 값을 넣거나, 넣어진 값을 조회하는 등의 CRUD(Create, Read, Update, Delete)를 해야 쓸모가 있는데, 이것을 어떻게 할 것인지 정의해주는 계층이라고 생각하면 된다.

JpaRepository를 상속받도록 함으로써 기본적인 동작이 모두 가능해진다! JpaRepository는 어떤 엔티티를 메서드의 대상으로 할지를 다음 키워드로 지정한다. JpaRepository<대상으로 지정할 엔티티, 해당 엔티티의 PK의 타입>.



### Mapper와 Repository의 차이 정리

MVC에서 repository, mapper를 적용해보면 아래와 같이 구현하고자 하는 구조에 따라서 유동적으로 선택해서 사용하면 된다. Mapper만 썼으니 잘못됐어! Mapper 클래스 없이 Repository만 썼으니 잘못됐어! 이런건 없다.

- Controller -> Service -> Repository -> mapper.xml

- Controller -> Service -> Repository -> Mapper -> mapper.xml

- Controller -> Service -> Mapper -> mapper.xml