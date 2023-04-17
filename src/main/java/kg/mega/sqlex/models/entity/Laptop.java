package kg.mega.sqlex.models.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "laptops")
public class Laptop {
    @Id
    Integer code;

    @ManyToOne
    @JoinColumn(name = "model")
    Product product ;
    Integer speed;
    Integer ram ;
    Double hd ;
    Double price;
    Integer screen;
}
