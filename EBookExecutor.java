class EBookExecutor {

    public static void main(String[] args) {

        System.out.println("ASIN: " + EBook.getASIN());
        System.out.println("Publisher: " + EBook.getPublisher());
        System.out.println("Publication Date: " + EBook.getPublicationDate());
        System.out.println("Language: " + EBook.getLanguage());
        System.out.println("File Size: " + EBook.getFileSize());
        System.out.println("Screen Reader: " + EBook.isScreenReaderSupported());
        System.out.println("Enhanced Typesetting: " + EBook.isEnhancedTypesettingEnabled());
        System.out.println("X-Ray: " + EBook.isXRayEnabled());
        System.out.println("Word Wise: " + EBook.isWordWiseEnabled());
        System.out.println("Print Length: " + EBook.getPrintLength());
        System.out.println("ISBN-13: " + EBook.getISBN13());
        System.out.println("Page Flip: " + EBook.isPageFlipEnabled());
    }
}