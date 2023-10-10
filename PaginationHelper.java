import java.util.List;

import static java.lang.Math.floor;

// TODO: complete this object/class

public class PaginationHelper<I> {

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    private final int pages;
    private final int items;
    private final int itemsPerPage;
    public PaginationHelper(List<I> collection, int itemsPerPage) {
         if (collection.size() % itemsPerPage == 0) {
             this.pages = collection.size() / itemsPerPage;
         } else if (collection.isEmpty()) {
             this.pages = 0;
         } else {
             this.pages = collection.size() / itemsPerPage + 1;
        }
         this.items = collection.size();
         this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return this.items;
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return this.pages;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex >= this.pages) {
            return -1;
        } else if (pageIndex < 0) {
            return -1;
        } else if (pageIndex == this.pages - 1) {
            return this.items - (this.pages - 1) * this.itemsPerPage;
        } else {
            return this.itemsPerPage;
        }
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex + 1 > this.items) {
            return -1;
        } else if (this.items == 0) {
            return -1;
        } else if (itemIndex < 0) {
            return -1;
        }
        else if ((itemIndex + 1) % this.itemsPerPage == 0) {
            return (itemIndex + 1) / this.itemsPerPage - 1;
        } else {
            return (itemIndex + 1) / this.itemsPerPage;
        }
    }
}
