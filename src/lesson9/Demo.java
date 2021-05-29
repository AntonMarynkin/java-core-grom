package lesson9;

import lesson9.homework.UserRepository;
import lesson9.utils.Checker;

public class Demo {
    public static void main(String[] args) {
        Company company = new Company();
        System.out.println(company.getCountryFounded());
        System.out.println(company.getName());

        company.setName("IBM");

        Checker checker = new Checker();
        System.out.println(checker.checkCompanyName(company.getName()));
        System.out.println(checker.companyNamesValidatedCount);



        UserRepository userRepository = new UserRepository(null, null);
        System.out.println(userRepository.getUsers());
    }
}
