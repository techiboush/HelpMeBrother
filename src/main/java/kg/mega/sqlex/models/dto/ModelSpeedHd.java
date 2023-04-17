package kg.mega.sqlex.models.dto;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class ModelSpeedHd {
    String model;
    Integer speed;
    Double hd;
}
