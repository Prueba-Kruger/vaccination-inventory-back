package com.kruger.vaccinationinventoryback.presentation.presenter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RolePresenter {
    private UUID roleId;
    private String name;
    @Builder.Default
    private List<PermissionPresenter> permissionPresenters = new ArrayList<>();
}
