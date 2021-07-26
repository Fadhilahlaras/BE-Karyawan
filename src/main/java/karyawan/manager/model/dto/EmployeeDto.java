package karyawan.manager.model.dto;

import lombok.Data;

@Data
public class EmployeeDto {
    private Integer id;
    private String name;
    private String birthDate;
    private Integer idPosition;
    private Integer nip;
    private String gender;
}
