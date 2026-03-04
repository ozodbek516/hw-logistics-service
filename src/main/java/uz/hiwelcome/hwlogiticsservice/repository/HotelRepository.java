package uz.hiwelcome.hwlogiticsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.hiwelcome.hwlogiticsservice.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}