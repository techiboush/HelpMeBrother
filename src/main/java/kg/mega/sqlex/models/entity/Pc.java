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
@Table(name = "pcs")
public class Pc {

    @Id
    Integer code;

    @ManyToOne
    @JoinColumn(name = "model")
    Product product ;
    Integer speed;
    Integer ram ;
    Double hd ;
    String cd ;
    Double price;

}
