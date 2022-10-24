public class Kindle {
//----------------------------------------------------------------------------------------------------
    private int currentPage;
    private int numPages;
//----------------------------------------------------------------------------------------------------
    public Kindle(int numberOfPages) {

        numPages = numberOfPages;
        currentPage = 1;
    }
//----------------------------------------------------------------------------------------------------
    public String toString() {

        return(String.format("Page %d of %d.", currentPage, numPages));
    }
//----------------------------------------------------------------------------------------------------
    public void turnPages() {

        currentPage++;
        if (currentPage > numPages) {
            currentPage = (currentPage - 1);
            System.out.println("You were on                  : " + toString());
            System.out.println("Turning 1 page would take you past the last page.");
            currentPage = numPages;
            System.out.print("You are now on               : Page " + currentPage + " of " + numPages + ".");
        }
    }
//----------------------------------------------------------------------------------------------------
    public void turnPages(int pagesTurned) {

        currentPage = currentPage + pagesTurned;
        if (currentPage > numPages) {
            currentPage = (currentPage - pagesTurned);
            System.out.println("You were on                : " + toString());
            System.out.println("Turning " + pagesTurned + " pages would take you past the last page.");
            currentPage = numPages;
            System.out.print("You are now on             : Page " + currentPage + " of " + numPages + ".");
        }
    }
//----------------------------------------------------------------------------------------------------
}
//====================================================================================================
