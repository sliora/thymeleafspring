package hello.itemservice.domain.item;

public enum ItemType {
    BOOK("도서"), FOOD("음석"), ETC("기타");

    ItemType(String description) {
        this.description = description;
    }

    private final String description;

}
