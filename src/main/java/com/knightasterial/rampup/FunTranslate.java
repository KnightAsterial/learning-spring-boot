package com.knightasterial.rampup;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FunTranslate {
    private Content contents;

    public Content getContents() {
        return contents;
    }

    public void setContents(Content contents) {
        this.contents = contents;
    }

    public String toString() {
        return contents.getTranslated() + "\n" + contents.getText();
    }
}
