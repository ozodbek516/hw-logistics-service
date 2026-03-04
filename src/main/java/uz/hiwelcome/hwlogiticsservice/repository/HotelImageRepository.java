package uz.hiwelcome.hwlogiticsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.hiwelcome.hwlogiticsservice.entity.HotelImage;

public interface HotelImageRepository extends JpaRepository<HotelImage, Long> {
}