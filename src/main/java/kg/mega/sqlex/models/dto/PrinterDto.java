package kg.mega.sqlex.models.dto;

import kg.mega.sqlex.models.entity.Product;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class PrinterDto {
    Integer code;
    String model;
    Character color;
    String type;
    Double price;
}
