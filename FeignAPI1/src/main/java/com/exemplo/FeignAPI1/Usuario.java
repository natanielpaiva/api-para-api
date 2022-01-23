package com.exemplo.FeignAPI1;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    private String nome;

    private Long idade;

    private String instagram;
}
