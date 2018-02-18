package ru.llalive.dev.reservations.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.llalive.dev.reservations.data.entity.Room;

/**
 *
 * @author LLAlive
 */
@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
    Room findByNumber(String number);
}
