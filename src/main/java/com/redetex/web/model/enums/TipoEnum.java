package com.redetex.web.model.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum TipoEnum {
    REDE(1, "REDE"),
    PERSIANA(2, "PERSIANA"),
    CORTINA(3, "CORTINA"),
    TELA(4, "TELA"),
    BOX(5, "BOX");

    private final Integer id;
    private final String tipo;

}