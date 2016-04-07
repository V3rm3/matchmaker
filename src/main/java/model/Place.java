package model;

import lombok.Data;

/**
 * @author renantdesouza
 * @since
 * */
public @Data class Place {

    private Long id;
    private String description;
    private String reference;
    private Address address;

    public Place() {
    }

}
