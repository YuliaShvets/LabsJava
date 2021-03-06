package ua.lviv.iot.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bird {
    private String name;
    private String colour;
    private double weight; // kg
    private double speed;  // km/h
    private double feed;         // kg/day
    private int lifeTime;// years
    private boolean isBirdFlying;


    public String getHeaders() {
        return "Name, colour, speed";
    }

    public String toCSV() {
        return this.getName() + ", " + this.getColour() + ", " + this.getSpeed();
    }
}
