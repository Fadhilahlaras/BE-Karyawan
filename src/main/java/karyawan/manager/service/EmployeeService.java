package karyawan.manager.service;

import karyawan.manager.model.entity.Employee;

public interface EmployeeService {
    Employee save(Employee employee);
    void setIsDelete(Integer id);
    Employee update(Employee employee);
}
