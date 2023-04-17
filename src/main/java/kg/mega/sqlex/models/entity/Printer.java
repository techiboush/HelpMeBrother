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
@Table(name = "printers")
public class Printer {

    @Id
    Integer code;

    @ManyToOne
    @JoinColumn(name = "model")
    Product product ;

    @Column(length = 1)
    Character color;

    String type;

    Double price;
}
