package com.kruger.vaccinationinventoryback.entity;

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Table(name = "employees")
@Getter
@Setter
@EqualsAndHashCode(of = "employeeId")
@ToString(of = "employeeId")
@Builder
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "employee_id")
    private UUID employeeId;

    @NotNull
    @Column(unique = true)
    private String dni;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String mail;

    private Date dateOfBirth;

    private String address;

    private String phone;

    private String status;

    @ManyToMany()
    @Builder.Default
    @JoinTable(name = "employees_vaccines",
            joinColumns = { @JoinColumn(name = "employee_id") },
            inverseJoinColumns = { @JoinColumn(name = "vaccine_id") })
    private Set<Vaccine> vaccines= new HashSet<>();
}
