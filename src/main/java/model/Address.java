package model;

import lombok.Data;

/**
 * @author renantdesouza.
 * @since 03/30/2016.
 * */
public @Data class Address {

    private Long id;
    private String cep;
    private String name;
    private Short number;
    private String neighborhood;
    private String city;
    private String state;
    private String country;

    public Address() {
    }

}
