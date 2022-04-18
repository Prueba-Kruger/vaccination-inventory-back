package com.kruger.vaccinationinventoryback.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Data
@Getter
@Setter
@EqualsAndHashCode(of = "vaccineId")
@ToString(of = "vaccineId")
@Entity
@NoArgsConstructor
@Table(name ="vaccines")
@Builder
@AllArgsConstructor
public class Vaccine {
    @Id
    @GeneratedValue
    @Column(name = "vaccine_id")
    private UUID vaccineId;

    @NotNull
    private String name;

    private String description;

}
