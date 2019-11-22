
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.io.*;

public class MountfieldProcessor {

    private static long sumCena;

    private JSONArray itemArray;

    public MountfieldProcessor() {
        itemArray = loadItems();
    }

    private JSONArray loadItems() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        File file = new File(classLoader.getResource("mountfield.json").getFile());
        JSONArray jsonArray = null;

        JSONParser parser = new JSONParser();
        try (Reader reader = new FileReader(file)) {
            jsonArray = (JSONArray) parser.parse(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
        return jsonArray;
    }

    /**
     * @return vrací celkový počet mountfield produktů
     */
    public int countItems() {
        return loadItems().size();
    }

    /**
     * Metoda může vypsat do konzole id zlevněných produktů
     *
     * @return vrací počet zlevněných produktů
     */
    public int getDiscountedItemsCount() {

        return 0;
    }

    /**
     * @return Sečte celkovou aktuální cenu (currentPrice)
     */
    public long sumCurrentPrices() {
        loadItems().get(Integer.parseInt("currentPrice"));
        return 0;
    }

    /**
     * @return Vrací itemID nejvíce zlevněného produktu
     */
    public String getBiggerDiscountItem() {
        return null;
    }

    /**
     * Metoda vypíše a idProduktu a jeho procentuální slevu - pokud existuje
     */
    public void printDiscountPercent() {

    }

}