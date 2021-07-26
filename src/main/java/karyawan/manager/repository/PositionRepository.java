package karyawan.manager.repository;

import karyawan.manager.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Employee, Integer> {
}
