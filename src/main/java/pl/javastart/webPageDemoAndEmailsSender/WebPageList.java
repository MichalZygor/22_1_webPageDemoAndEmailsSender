package pl.javastart.webPageDemoAndEmailsSender;

enum WebPageList {
    HOME_PAGE("Strona główna"),
    WHY_VAZZA("Dlaczego VAZZA"),
    VALUES("Wartości"),
    CONTACT("Kontakt");

    private final String description;

    WebPageList(String descriprion) {
        this.description = descriprion;
    }

    public String getDescription() {
        return description;
    }
}
