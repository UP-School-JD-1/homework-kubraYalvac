//Chapter13 Hw1 

package book;

public enum BookType {
	
    ROMANCE("Romance"), FICTION("Fiction") , NON_FICTION("Non fiction"), FANTASY("Fantasy") , SCIENTIFIC("Scientific"), PHILOSOPHY("Philosopy") ;

	private String description;

    BookType(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
