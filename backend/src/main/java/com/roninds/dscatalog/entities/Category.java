package com.roninds.dscatalog.entities;

import lombok.*;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Category implements Serializable {

    private  Long id;
    private String name;
}
