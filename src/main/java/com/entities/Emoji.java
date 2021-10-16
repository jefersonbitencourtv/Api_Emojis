package com.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@ToString

public class Emoji {
    private String emoji;

    private String description;

    private String category;

    private List<String> aliases;

    private List<String> tags;

    public Emoji() {
        this.aliases = new ArrayList<>();
        this.tags = new ArrayList<>();
    }
}
