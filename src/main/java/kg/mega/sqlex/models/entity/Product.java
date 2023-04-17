package kg.mega.sqlex.models.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @Column(length = 50)
    String model;

    @Column(length = 10)
    String maker;

    @Column(length = 50)
    String type;


}


