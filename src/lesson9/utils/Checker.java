package lesson9.utils;

public class Checker {

    //области видимости по возрастанию доступности
    //private - только в текущем классе
    //default - (package-private)
    //protected - default + наследники класса
    //public - с любой точки проекта

    public int companyNamesValidatedCount = 0;

    public boolean checkCompanyName(String companyName) {
//        if(companyName == "Google" || companyName == "Amazon")
//            return false;
//        return true;

        if (companyNamesValidatedCount > 10)
            return false;

        companyNamesValidatedCount++;
        return companyName != "Google" && companyName != "Amazon";  // идентичное упрощение. return true
    }
}
