package HomeWork7;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader{

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
//        return load("https://www.bps-sberbank.by/page/currency-exchange-cards" + currencyName.getId(), currencyName);
//        return load("https://belapb.by/ExCardsDaily.php?ondate=11/22/2013" + currencyName.getId(), currencyName);
//        return load("https://developerhub.alfabank.by:8273/partner/1.0.0/public/rates" + currencyName.getId(), currencyName);

    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    //в строке content вы дожны найти курс валюты имя которой передали в параметре currencyName.
    // Почти обычный поиск строки currencyName по строке content (нельзя использовать регулярные выражения).
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
        double index = content.indexOf(String.valueOf(currencyName));
        if (index == -1){
            System.out.print("Валюта не найдена ");
        }
        String substring = content.substring((content.length() - 8), content.length() - 2);
        return Double.parseDouble(substring);
    }
}
