package uz.hiwelcome.hwlogiticsservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "hotels")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer stars;

    private String region;

    private String city;

    private Double pricePerNight;

    @Column(columnDefinition = "TEXT")
    private String description;

    private List<HotelImage> images;
}
