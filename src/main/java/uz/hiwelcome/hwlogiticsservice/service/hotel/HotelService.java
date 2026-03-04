package uz.hiwelcome.hwlogiticsservice.service.hotel;

import uz.hiwelcome.hwlogiticsservice.dto.request.HotelCreateRequest;
import uz.hiwelcome.hwlogiticsservice.dto.response.HotelResponse;

import java.util.List;

public interface HotelService {

    HotelResponse create(HotelCreateRequest request);

    HotelResponse update(Long id, HotelCreateRequest request);

    List<HotelResponse> getAll();

    HotelResponse getById(Long id);

    void delete(Long id);
}