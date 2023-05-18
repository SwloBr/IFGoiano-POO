package com.swlo.client;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
public class LegalEntity extends Client{

    private final String CNPJ; //constant
    private String fantasyName;

    public LegalEntity(String name, String phoneNumber, String address, String CNPJ, String fantasyName) {
        super(name, phoneNumber, address);
        this.CNPJ = CNPJ;
        this.fantasyName = fantasyName;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }
}
